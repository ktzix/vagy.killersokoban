package killer;

/**
 * Crate class implementation,
 * for further information about functions check interface Thing
 */
@SuppressWarnings({"FieldCanBeLocal", "unused", "WeakerAccess", "FinalizeCalledExplicitly"})
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

	/**
	 * These functions below are explained in the thing interface
	 * @param c
	 * @param f
	 */


	public void Push(Crate c,Field f) {
		Control.Write(this);
		System.out.println("Push(Crate,Field)");
		f.Accept(this);
	}

	/**
	 * case 3 is extended here
	 */
	public void Push(Worker w, Field f) {
		Control.Write(this);
		System.out.println("Push(Worker,Field)");
		switch(Control.getUseCase()) {
		case 3:
			f.Accept(this);			
			f.Remove(this);			
			Pillar p=new Pillar();
			Control.addToMap(p, "p");
			f.Accept(p);
			this.finalize();
			break;
		default:
			f.Accept(this);
			break;
		}
	}


	public void enters(Field f) {
		Control.Write(this);
		System.out.println("Enters(Field)");
		f.Accept(this);
	}
	@Override
	public void push(Thing t, Field f) {
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
