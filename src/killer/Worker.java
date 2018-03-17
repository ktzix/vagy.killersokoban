package killer;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**munkás osztály megvalósítása */
public class Worker implements Thing {
	private Field current;

	/**
	 *ha egy láda meglöki a munkást,
	 * @param c , a láda
	 * @param f, ahova tolja
	 */
	public void Push(Crate c, Field f) {
		Control.Write(this);
		System.out.println("w Push(Crate, Field)");
		
		switch(Control.usecase)	{
		case 1:
			f.Accept(this);
			break;
		case 10: 
			Field f2=new Field();
            f2.Accept(this);     
            break;      
      
		}
		
	}

	/**
	 *ha egy munkás meglöki a munkást,
	 * @param w , a munkás
	 * @param f, ahova tolja
	 */
	public void Push(Worker w, Field f) {
		Control.Write(this);
		System.out.println("w Push(Worker, Field)");
	}
	@Override

	/**
	 *ha egy dolog meglöki a munkást,
	 * @param t, a dolog
	 * @param f, ahova tolja
	 */
	public void Push(Thing t, Field f) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Ha egy mezőre megy a munkás, ez hívódik meg
	 * @param f, a mező, amire a munkás megy
	 */
	@Override
	public void Enters(Field f) {
		Control.Write(this);
		System.out.println("w Enters(Field)");
		f.Accept(this);
		
	}

	/**
	 * meghalás
	 */
	public void finalize() {
		Control.Write(this);
		System.out.println("Destroy(Worker)");
		
	}
	

}
