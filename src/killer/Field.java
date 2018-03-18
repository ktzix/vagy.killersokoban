package killer;
import java.util.*;




/**
 * Field class implementation
 */
@SuppressWarnings({"unused", "FinalizeCalledExplicitly", "WeakerAccess"})
public class Field {
	private Map<Direction,Field> neighbors;
	private Thing currentThing;
	private Crate targetCrate;


	public Field() {}

	/**
	 * If a thing wants to step on the field, it must be accepted first
	 * @param t is the thing.
	 *
	 *          also, a few sequences are extended here
	 */
	public void Accept(Thing t) {
		Control.Write(this);
		System.out.println("Accept(Thing)");
	}
	public void Accept(Worker w) {
		Control.Write(this);
		System.out.println("Accept(Worker)");
		Field f2=new Field();
		Control.addToMap(f2, "f2");
		Pillar p;
		switch(Control.getUseCase()) {
		case 6:
			Crate c=new Crate();
			Control.addToMap(c,"c");
			c.Push(w, f2);
			Remove(c);
			break;
		case 7:
			Worker w2=new Worker();
			Control.addToMap(w2, "w2");
			w2.Push(w, f2);
			break;
		case 9:
			p=new Pillar();
			Control.addToMap(p, "p");
			p.push(w, f2);
			break;
		case 10: 
			Field f3=new Field();
			Control.addToMap(f3, "f3");
			p=new Pillar();
			Control.addToMap(p, "p");
			p.push(p,f3);
			w.finalize();
			break;
			
			
		}
	}

/**
 * a few sequences are extended here
 * */
	public void Accept(Crate c) {
		Control.Write(this);
		System.out.println("Accept(Crate)");
		Field f1;
		Worker w=new Worker();
		Control.addToMap(w, "w");
		switch(Control.getUseCase()) {
		case 1:
			Field f2=new Field();
			Control.addToMap(f2,"f2");
			w.Push(c,f2);
			Remove(w);
			break;
		case 2:
			Control.setUseCase(0);
			f2=new Field();
			Control.addToMap(f2,"f2");
			Crate c2=new Crate();
			Control.addToMap(c2, "c2");
			c2.Push(c, f2);
			Remove(w);
			break;
		case 8:
			Pillar p=new Pillar();
			Control.addToMap(p, "p");
			f2=new Field();
			Control.addToMap(f2,"f2");
			p.Push(c, f2);
			break;
		case 10:
			f1=new Field();
			Control.addToMap(f1,"f3");
			w.Push(c, f1);
			break;
		}				
	}


	public void Accept(Pillar p) {
		Control.Write(this);
		System.out.println("Accept(Pillar)");
		
	}

	/**
	 * removes the thing that was on the field
	 * @param t, the thing which was on the field
	 */
	public void Remove(Thing t) {
		Control.Write(this);
		System.out.println("Remove(Thing)");
	}

	/**
	 * the fucntions below arent needed now
	 */
	public Field GetNeighbor(Direction dir) {
		Control.Write(this);
		System.out.println("GetNeighbor(Direction)");
		return null;
	}
	public void SetNeighbor(Direction dir, Field f) {
		Control.Write(this);
		System.out.println("SetNeighbor(Direction, Field");
	}
	public Thing GetThing() {
		Control.Write(this);
		System.out.println("GetThing()");
		return null;
	}
}
