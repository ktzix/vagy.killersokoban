package killer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * control class implementation
 */
public class  Control {

	/**
	 * map to store objects with their names
	 */
	private Map<Object,String> names;
	private static Control control=new Control();
	/**
	 * it serves to help the switch-case architecture you can find in the code
	 */
	public static int usecase;
	private Control() {	}
	
	public static void Write(Object obj) {}

}
