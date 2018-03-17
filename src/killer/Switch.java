package killer;

@SuppressWarnings("unused")
public class Switch extends Field{
	private SecretHole secretHole;
	private Thing currentThing;
	
	public void Accept(Worker w) {
		Control.Write(this);
		System.out.println("Accept(Worker)");
	}
	public void Accept(Crate c) {
		Control.Write(this);
		System.out.println("Accept(Crate)");
	}
	public void Remove(Thing t) {
		Control.Write(this);
		System.out.println("Remove(Thing)");
	}

}
