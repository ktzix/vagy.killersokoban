package killer;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**implementation of the worker class
 * for furhter inforkation about the functions check interface Thing
 * */
public class Worker implements Thing {
	private Field current;


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


	public void Push(Worker w, Field f) {
		Control.Write(this);
		System.out.println("w Push(Worker, Field)");
	}
	@Override


	public void push(Thing t, Field f) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void enters(Field f) {
		Control.Write(this);
		System.out.println("w Enters(Field)");
		f.Accept(this);
		
	}

	/**
	 * death scenario
	 */
	public void finalize() {
		Control.Write(this);
		System.out.println("Destroy(Worker)");
		
	}
	

}
