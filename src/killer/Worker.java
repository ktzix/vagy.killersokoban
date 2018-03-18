package killer;




/**implementation of the worker class
 *
 * */
public class Worker implements Thing {
	/*private Field current;*/


	/**
	 * you can check up the functions below in the Thing interface
	 * a few sequences are extended here
	 * */

	 @SuppressWarnings("unused")
	 void Push(Crate c , Field f) {
		Control.Write(this);

		System.out.println("Push(Crate, Field)");
		
		switch(Control.getUseCase()	)	{
		case 1:
			f.Accept(this);
			break;
		case 10: 
			Field f2=new Field();
			Control.addToMap(f2, "f2");
            f2.Accept(this);     
            break;          
		}		
	}

	@SuppressWarnings({"unused", "WeakerAccess"})
	public void Push(Worker w, Field f) {
		Control.Write(this);
		System.out.println("Push(Worker, Field)");
	}
	@Override


	public void push(Thing t, Field f) {

		
	}


	@Override
	public void enters(Field f) {
		Control.Write(this);
		System.out.println("Enters(Field)");
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
