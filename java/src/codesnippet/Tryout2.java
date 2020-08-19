

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @note Use Java 8 (lambda expressions are used)
 */
public class Tryout2 {
    public interface Adder {
        String add(Function<String, String> f);
        void add(Consumer<Integer> f);
    }
     
    public class AdderImpl implements Adder {

        @Override
        public String add(Function<String, String> f) {
            return f.apply("Welcome ");
        }

        @Override
        public void add(Consumer<Integer> f) {
        }
    }

    public static void main(String [] args) {
        Tryout2 x = new Tryout2();
        AdderImpl adderImpl = x.new AdderImpl();
        String r = adderImpl.add(a -> a + " lambda");
        System.out.println(r);       
    }
}