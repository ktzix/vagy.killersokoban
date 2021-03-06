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
	void push(Thing t, Field f);

	/**
	 * if a thing wants to enter a new field
	 * @param f,  the field which the thing enters
	 */
	void enters(Field f);



}
