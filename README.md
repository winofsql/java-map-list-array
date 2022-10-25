# java-map-list-array
MAP と LIST と 配列の一覧表示

## 何かおかしい場合
```
Java: Clean Java Language Server Workspace
```

## forEach メソッドと変数参照
```java
import java.util.*;

class Main {
  static int count = 1;

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<String, String>();
    map.put("言語1", "Java");
    map.put("言語2", "JavaScript");
    map.put("言語3", "C#");
    map.put("言語4", "PHP");

    int[] cnt = { 1 };
    var counter = new Counter(1);
    map.forEach( (key, value) -> {
        System.out.println( cnt[0] + " : " + count + " : " + counter.getCount() );

        String out = String.format( "%s : %s", key, value );
        System.out.println( out );

        cnt[0]++;
        count++;
        counter.add();
    });
    
  }
}

class Counter {

    private int start;

    public Counter(int start) {
        this.start = start;
    }

    public void add() {
        this.start++;
    }

    public int getCount() {
        return this.start;
    }
}

```
