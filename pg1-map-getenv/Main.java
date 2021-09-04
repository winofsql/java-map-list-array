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
        
        HashMap<String, String> mymap = new HashMap<String, String>();
        mymap.put("言語1", "Java");
        mymap.put("言語2", "JavaScript");
        mymap.put("言語3", "C#");
        mymap.put("言語4", "PHP");

        iterator = mymap.keySet().iterator();
        while ( iterator.hasNext() ) {
            String key = iterator.next();
            String out = String.format( "%s : %s", key, mymap.get( key ) );
            System.out.println( out );
        }        

    }

}
