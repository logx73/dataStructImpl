package dataDirectory.Map;

import dataDirectorty.Map.HashMap;
import dataDirectorty.Map.Key;
import dataDirectorty.Map.Value;
import org.junit.jupiter.api.Test;

public class HashMapTest {
    @Test
    void run(){
        HashMap hashMap=new HashMap();
        hashMap.put(new Key("abc"),new Value("abc"));
        System.out.println(hashMap.get(new Key("abc")));
    }
}
