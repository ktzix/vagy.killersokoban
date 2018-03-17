package killer;

public class SecretHole extends Hole {
	private Switch sw;
	private boolean state;
	private Thing currentThing;
	
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
