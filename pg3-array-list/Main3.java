import java.util.*;

public class Main3 {

    public static void main(String[] args) {

        Map<String, String> env = System.getenv();
        // new String[0] : 大きさの無い文字列配列
        String[] keys;
        keys = env.keySet().toArray(new String[0]);
        // ソート
        Arrays.sort(keys);

        // 追加不可なリスト
        List<String> slist = Arrays.asList(keys);

        // 拡張 for
        for( String key : slist ) {
            String out = String.format( "%s : %s", key, env.get( key ) );
            System.out.println( out );
        }

        System.out.println( "-----------------------------------" );

        // 追加可能な List へ変換
        ArrayList<String> list = new ArrayList<String>( slist );

        // データ追加
        list.add("abc");
        list.add("ABC");

        // ソート( 大文字小文字の違いを無視 )
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        
        // forEach メソッド
        list.forEach( (key) -> {
            String out = String.format( "%s : %s", key, env.get( key ) );
            System.out.println( out );
        });

    }

}
