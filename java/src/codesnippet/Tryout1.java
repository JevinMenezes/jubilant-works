package codesnippet;

/**
 * @note Use Java 8 (lambda expressions are used)
 */
class Tryout1 {
    public static void main(String [] args){
        String name = "WelcomeJava";
        Runnable r1 = () -> System.out.println(name); //lambda expression
        String name1 = name.toUpperCase();
        Runnable r2 = () -> System.out.println(name1); //lambda expression
        r1.run();
    }    
}