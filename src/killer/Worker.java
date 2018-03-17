package killer;




/**implementation of the worker class
 * for further information about the functions check interface Thing
 * */
public class Worker implements Thing {
	/*private Field current;*/


	 @SuppressWarnings("unused")
	 void Push(Crate c , Field f) {
		Control.Write(this);

		System.out.println("w Push(Crate, Field)");
		
		switch(Control.getUseCase()	)	{
		case 1:
			f.Accept(this);
			break;
		case 10: 
			Field f2=new Field();
            f2.Accept(this);     
            break;      
      
		}
		
	}


	@SuppressWarnings({"unused", "WeakerAccess"})
	public void Push(Worker w, Field f) {
		Control.Write(this);
		System.out.println("w Push(Worker, Field)");
	}
	@Override


	public void push(Thing t, Field f) {

		
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
