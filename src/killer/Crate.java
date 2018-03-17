package killer;

/**
 * Crate class implementation,
 * for further information about functions check interface Thing
 */
public class Crate implements Thing {
	private Field target;
	private Field current;

	/**
	 * constructor to be able to set the destination field
	 */
	public Crate() {}
	public Crate(Field f) {
		target=f;		
	}


	public void Push(Crate c,Field f) {
		Control.Write(this);
		System.out.println("c Push(Crate,Field)");
		f.Accept(this);
	}


	public void Push(Worker w, Field f) {
		Control.Write(this);
		System.out.println("c Push(Worker,Field)");
		switch(Control.usecase) {
		case 3:
			f.Accept(this);			
			f.Remove(this);			
			Pillar p=new Pillar();
			f.Accept(p);
			this.finalize();
			break;
		default:
			f.Accept(this);
			break;
		}
	}


	public void Enters(Field f) {
		Control.Write(this);
		System.out.println("c Enters(Field)");
		f.Accept(this);
	}
	@Override
	public void Push(Thing t, Field f) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * death scenario
	 */
	public void finalize() {
		Control.Write(this);
		System.out.println("Destroy(Crate)");
	}
	

}
