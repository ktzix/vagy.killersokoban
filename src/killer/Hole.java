package killer;

public class Hole extends Field {
	private Thing currentThing;
	
	public void Accept(Worker w) {
		Control.Write(this);
		System.out.println("h Accept(Worker)");
		w.finalize();
	}
	public void Accept(Crate c) {
		Control.Write(this);
		System.out.println("h Accept(Crate)");
		c.finalize();
	}

}
