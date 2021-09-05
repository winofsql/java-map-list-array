import java.util.*;

public class Main4 {

    public static void main(String[] args) {

        Map<String, String> env = System.getenv();

        env.forEach( (key, value) -> {
            String out = String.format( "%s : %s", key, value );
            System.out.println( out );
        });

    }

}
