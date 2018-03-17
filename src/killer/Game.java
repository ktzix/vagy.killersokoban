package killer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *This class is responsible for the running of the game
 */
public class Game {
	private Warehouse warehouse;
	private List<Player> players;
	
	public static void main(String[] args) {
		System.out.println("KillerSokoban");
		int i=0;
		Crate c=new Crate();
		Field f1=new Field();
		Worker w1=new Worker();
		Crate c1=new Crate();
		Hole h1=new Hole();
		Worker w=new Worker();
		//while(i==0)
		switch(Select()) {
		case 1:
			System.out.println("CratePushesWorker");	
			Control.usecase=1;
			c.Enters(f1);
			break;
		case 2:
			System.out.println("CratePushesCrate");
			Control.usecase=2;
			c.Enters(f1);			
			break;
		case 3:
			System.out.println("CrateFindsTarget");
			Control.usecase=3;
			c1.Push(w1,f1);
			break;
		case 4:
			System.out.println("CrateFallsInHole");	
			Control.usecase=4;
			c1.Push(w1, h1);
			break;
		case 5:
			System.out.println("WorkerFallsInHole");
			Control.usecase=5;
			w1.Enters(h1);
			break;
		case 6:
			System.out.println("WorkerPushesCrate");
			Control.usecase=6;
			w.Enters(f1);
			break;
		case 7:
			System.out.println("WorkerPushesWorker");
			Control.usecase=7;
			w1.Enters(f1);
			break;
		case 8:
			System.out.println("CratePushedToWall");
			Control.usecase=8;
			c.Enters(f1);
			break;
		case 9:
			System.out.println("WorkerWalksIntoWall");
			Control.usecase=9;			
			w1.Enters(f1);
			break;
		case 10:
			System.out.println("WorkerPushedIntoWall");
			Control.usecase=10;
			c.Enters(f1);
			break;
		case 11:
			i=1;
			break;
		default:
			break;	
		
		}
	}
	
	public static int Select() {
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
	
	
	
	
	
	public void NewGame() {
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
	}

}
