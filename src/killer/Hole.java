package killer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is a special field, similar functions, only if a thing steps on it it dies
 */
@SuppressWarnings({"unused", "FinalizeCalledExplicitly"})
public class Hole extends Field {
	private Thing currentThing;

	/**
	 *check interface Thing fot the explanation of the functions
	 */

	public void Accept(Worker w) {
		Control.Write(this);
		System.out.println("Accept(Worker)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Is the hole opened?(y/n) ");
			String s=br.readLine();
			if(s.equals("y")) w.finalize();
			else System.out.println("Hole accepted "+Control.getMapValue(w));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void Accept(Crate c) {
		Control.Write(this);
		System.out.println("Accept(Crate)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Is the hole opened?(y/n) ");
			String s=br.readLine();
			if(s.equals("y")) c.finalize();
			else System.out.println("Hole accepted "+Control.getMapValue(c));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
