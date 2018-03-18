package killer;


import java.util.HashMap;
import java.util.Map;

/**
 * control class implementation
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class Control {

    /**
     * it is used to keep track of the sequences
     */
    private static int number = 1;
	
    private static  Map<Object, String> names=new HashMap<>();

    public static void addToMap(Object ob, String string){
        names.put(ob, string);
    }

    public static String getMapValue(Object key){
        return names.get(key);
    }

  /*  private static Control control = new Control();*/
    /**
     * these serve to help the switch-case architecture you can find in the code
     */
    private static int usecase;

    public static void setUseCase(int i){
        usecase = i;
    }

    public static int getUseCase(){
        return usecase;
    }

    /**
     *
     * @return the number of the current sequence
     */

    public static int getNumber() {
    	return number;
    }
    
    public static void setNumber(int i){
        number = i;
    }

    private Control() {
    }

    public static void Write(Object obj) {
       	System.out.print(number + ". call on: "+getMapValue(obj)+" ");
    	number++;
     	
    }
    

}
