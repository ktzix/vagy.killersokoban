package killer;

/**
 * its a special thing, functions as a wall
 */
public class Pillar implements Thing{
	private Field current;
	
	public Pillar() {
		if(Control.usecase==3) {
			Control.Write(this);
			System.out.println("Pillar Create");
		}			
				
	}
	
	public void Push(Thing t, Field f) {
		Control.Write(this);
		System.out.println("Pillar Push(Thing, Field)");
	}
	
	public void Push(Crate c, Field f) {
		Control.Write(this);
		System.out.println("Pillar Push(Crate, Field)");
		f.Accept(this);
	}

	@Override
	public void Enters(Field f) {
		// TODO Auto-generated method stub
		
	}

}
