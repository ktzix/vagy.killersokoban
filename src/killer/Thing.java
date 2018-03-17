package killer;

/**
 * interface for things
 */
public interface Thing {
	/**
	 * if a thing is pushed,
	 * @param t, the thing which pushes it
	 * @param f, the field where it is pushed to
	 */
	 public void push(Thing t, Field f);
	 public void enters(Field f);
	

}
