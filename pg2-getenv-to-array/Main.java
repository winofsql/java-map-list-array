import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> env = System.getenv();
        // new String[0] : 大きさの無い文字列配列
        String[] keys;
        keys = env.keySet().toArray(new String[0]);
        // ソート
        Arrays.sort(keys);

        // 通常 for
        for( int i = 0; i < keys.length; i++ ) {
            String key = keys[i];
            String out = String.format( "%s : %s", key, env.get( key ) );
            System.out.println( out );
        }

        System.out.println( "-----------------------------------" );

        // 拡張 for
        for( String key : keys ) {
            String out = String.format( "%s : %s", key, env.get( key ) );
            System.out.println( out );
        }

    }

}
