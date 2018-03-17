package killer;

/**
 * its a special thing, functions as a wall
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Pillar implements Thing{
	private Field current;
	
	public Pillar() {
		if(Control.usecase==3) {
			Control.Write(this);
			System.out.println("Pillar Create");
		}			
				
	}
	
	public void push(Thing t, Field f) {
		Control.Write(this);
		System.out.println("Pillar Push(Thing, Field)");
	}
	
	public void Push(Crate c, Field f) {
		Control.Write(this);
		System.out.println("Pillar Push(Crate, Field)");
		f.Accept(this);
	}

	@Override
	public void enters(Field f) {
		// TODO Auto-generated method stub
		
	}

}
