package killer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;



/**
 *This class is responsible for the running of the game
 */
public class Game {

    private static Logger LOG = Logger.getLogger(Game.class.getName());

	/*private Warehouse warehouse;
	private List<Player> players;*/


	public static void main(String[] args) {

	    LOG.finer("trace");
	    LOG.fine("debug");
	    LOG.info("Info");
	    LOG.severe("error");
	    LOG.warning("warning");

		LOG.info("KillerSokoban");

		/*
		 * we are creating the basic entities here
		 */
		Crate c=new Crate();
		Field f1=new Field();
		Worker w1=new Worker();
		Crate c1=new Crate();
		Hole h1=new Hole();
		Worker w =new Worker();

		Control.addToMap(c, "c");
		Control.addToMap(f1, "f1");
		Control.addToMap(w1, "w1");
		Control.addToMap(c1, "c1");
		Control.addToMap(h1, "h1");
		Control.addToMap(w, "w");

		boolean i=true;
		while(i) {
			switch(Select()) {
				case 1:
					System.out.println("CratePushesWorker");
					Control.setUseCase(1);
					Control.setNumber(1);
					c.enters(f1);
					break;
				case 2:
					System.out.println("CratePushesCrate");
					Control.setUseCase(2);
					Control.setNumber(1);
					c1.enters(f1);
					break;
				case 3:
					System.out.println("CrateFindsTarget");
					Control.setUseCase(3);
					Control.setNumber(1);
					c1.Push(w1,f1);
					break;
				case 4:
					System.out.println("CrateFallsInHole");
					Control.setUseCase(4);
					Control.setNumber(1);
					c1.Push(w1, h1);
					break;
				case 5:
					System.out.println("WorkerFallsInHole");
					Control.setUseCase(5);
					Control.setNumber(1);
					w1.enters(h1);
					break;
				case 6:
					System.out.println("WorkerPushesCrate");
					Control.setUseCase(6);
					Control.setNumber(1);
					w.enters(f1);
					break;
				case 7:
					System.out.println("WorkerPushesWorker");
					Control.setUseCase(7);
					Control.setNumber(1);
					w1.enters(f1);
					break;
				case 8:
					System.out.println("CratePushedToWall");
					Control.setUseCase(8);
					Control.setNumber(1);
					c.enters(f1);
					break;
				case 9:
					System.out.println("WorkerWalksIntoWall");
					Control.setUseCase(9);
					Control.setNumber(1);
					w1.enters(f1);
					break;
				case 10:
					System.out.println("WorkerPushedIntoWall");
					Control.setUseCase(10);
					Control.setNumber(1);
					c.enters(f1);
					break;
				case 11:
					i = false;
					break;
				default:
					break;

			}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("Press enter to continue");
				br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static int Select() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1: CratePushesWorker");
		System.out.println("2: CratePushesCrate");
		System.out.println("3: CrateFindsTarget");
		System.out.println("4: CrateFallsInHole");
		System.out.println("5: WorkerFallsInHole");
		System.out.println("6: WorkerPushesCrate");
		System.out.println("7: WorkerPushesWorker");
		System.out.println("8: CratePushedToWall");
		System.out.println("9: WorkerWalksIntoWall");
		System.out.println("10: WorkerPushedIntoWall");
		System.out.println("11: Exit");
		System.out.println("Select UseCase! ");
		try{
			return Integer.parseInt(br.readLine());
		}catch(Exception e){
			System.err.println("Invalid Format!");
		}
		return 0;

	}
	
	
	
	
	
	/*public void NewGame() {
		Control.Write(this);
		System.out.println("NewGame()");
	}
	public void Play() {
		Control.Write(this);
		System.out.println("Play()");
	}
	public void EndGame() {
		Control.Write(this);
		System.out.println("EndGame()");
	}
	public void NextPlayer() {
		Control.Write(this);
		System.out.println("NextPlayer()");
	}*/

}
