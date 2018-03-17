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
	 * If a thing wants to step on the field
	 * @param t,  the thing
	 */
	public void Accept(Thing t) {
		Control.Write(this);
		System.out.println("field Accept(Thing)");
	}
	public void Accept(Worker w) {
		Control.Write(this);
		System.out.println("field Accept(Worker)");
		Field f2=new Field();
		Pillar p;
		switch(Control.getUseCase()) {
		case 6:
			Crate c=new Crate();
			c.Push(w, f2);
			Remove(c);
			break;
		case 7:
			Worker w2=new Worker();
			w2.Push(w, f2);
			break;
		case 9:
			p=new Pillar();
			p.push(w, f2);
			break;
		case 10: 
			Field f3=new Field();
			p=new Pillar();
			p.push(w,f3);
			w.finalize();
			break;
			
			
		}
	}


	public void Accept(Crate c) {
		Control.Write(this);
		System.out.println("field Accept(Crate)");
		Field f2;
		Worker w=new Worker();
		switch(Control.getUseCase()) {
		case 1:
			f2=new Field();
			w.Push(c,f2);
			Remove(w);
			break;
		case 2:
			Control.setUseCase(0);
			f2=new Field();
			Crate c2=new Crate();
			c2.Push(c, f2);
			Remove(w);
			break;
		case 8:
			Pillar p=new Pillar();
			f2=new Field();
			p.Push(c, f2);
			break;
		case 10:
			f2=new Field();
			w.Push(c, f2);
			break;
		}				
	}


	public void Accept(Pillar p) {
		Control.Write(this);
		System.out.println("field Accept(Pillar)");
		
	}

	/**
	 * removes the thing that was on the field
	 * @param t, the thing which was on the field
	 */
	public void Remove(Thing t) {
		Control.Write(this);
		System.out.println("field Remove(Thing)");
	}

	/**
	 *
	 * the fucntions below arent needed now
	 *
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
