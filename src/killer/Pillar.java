package killer;

/**
 * its a special thing, functions as a piece of wall
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Pillar implements Thing{
	private Field current;
	
	public Pillar() {
		if(Control.getUseCase()==3) {
			Control.addToMap(this, "p1");
			Control.Write(this);
			System.out.println("Create");
		}			
				
	}

	/**
	 *check interface Thing for the explanation of the functions
	 */

	public void push(Thing t, Field f) {
		Control.Write(this);
		System.out.println("Push(Thing, Field)");
	}
	
	public void Push(Crate c, Field f) {
		Control.Write(this);
		System.out.println("Push(Crate, Field)");
		f.Accept(this);
	}

	@Override
	public void enters(Field f) {
		// TODO Auto-generated method stub
		
	}

}
