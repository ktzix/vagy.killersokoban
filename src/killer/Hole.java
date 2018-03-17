package killer;

/**
 * This is a special field, similar functions, only if a thing steps on it it dies
 */
@SuppressWarnings({"unused", "FinalizeCalledExplicitly"})
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
