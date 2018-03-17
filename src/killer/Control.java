package killer;




/**
 * control class implementation
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class Control {


   /* private Map<Object, String> names;
    private static Control control = new Control();*/
    /**
     * it serves to help the switch-case architecture you can find in the code
     */
    public static int usecase;

    public void setUseCase(int i){
        usecase = i;
    }

    public int getUseCase(){
        return usecase;
    }

    private Control() {
    }

    public static void Write(Object obj) {
    }

}
