package killer;

/**
 * Ii's special hole, it need a switch to act like a hole, otherwise its just a simple field
 */
@SuppressWarnings("unused")
public class SecretHole extends Hole {
	private Switch sw;
	private boolean state;
	private Thing currentThing;

	/**
	 * If a crate enters the Secrethole's switch, then the secret hole functions as a hole,
	 * if the crate leaves then it's just a field
	 *
	 */
	public void Change() {
		Control.Write(this);
		System.out.println("Change()");
	}
	public void Accept(Worker w) {
		Control.Write(this);
		System.out.println("Accept(Worker)");
	}
	public void Accept(Crate c) {
		Control.Write(this);
		System.out.println("Accept(Crate)");
	}
	

}
