import java.util.*;

public class Pg4MapForEach {

    public static void main(String[] args) {

        Map<String, String> env = System.getenv();

        env.forEach( (key, value) -> {
            String out = String.format( "%s : %s", key, value );
            System.out.println( out );
        });

        System.out.println( "----------------------------------------" );

        Properties props = System.getProperties();

        props.forEach( (key, value) -> {
            String out = String.format( "%s : %s", key, value );
            System.out.println( out );
        });

    }

}
