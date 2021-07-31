import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> env = System.getenv();
        Iterator<String> iterator = env.keySet().iterator();

        while ( iterator.hasNext() ) {
            String key = iterator.next();
            String out = String.format( "%s : %s", key, env.get( key ) );
            System.out.println( out);
        }

    }

}
