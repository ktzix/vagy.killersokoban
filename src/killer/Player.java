package killer;
import java.util.*;

public class Player {
	private List<Worker> workers;
	private String name;
	private int number;
	
	public void Select(Worker w) {
		Control.Write(this);
		System.out.println("Select(Worker)");
	}
	public void MoveOn(Field f) {
		Control.Write(this);
		System.out.println("MoveOn(Field)");
	}
	public void ActivateRound() {
		System.out.println("ActivateRound()");
		Control.Write(this);
	}
}
