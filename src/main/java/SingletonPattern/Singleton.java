package SingletonPattern;
//can be through eager, lazy or static block initialization
//must provide a global access point to get the instance

/*steps:
1. create a private constructor to restrict instantiation of the class from other classes
2. create private static variable of the same class that is the only intance of the class
3. create a public static method that returns the instance of the class and is the global access point for outer world.
 */

public class Singleton {
    //Eager
    private static Singleton INSTANCE = null;//new Singleton();
    private Singleton(){

    }
    static {//static
        try {
            if (INSTANCE== null){
                INSTANCE = new Singleton();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Singleton getInstance(){
        return INSTANCE;
    }

}
