package dataDirectorty.Map;

import java.util.ArrayList;
import java.util.List;

public class HashMap {
    Node[] bucket=new Node[10];
    int i=0;
    public HashMap(){

    }

    public void put(Key key,Value value){
        Node node=new Node();
        node.setKey(key);
        node.setValue(value);
        if(i<bucket.length){
            bucket[index(key.hashCode())]=node;
            i++;
        }

    }

    public String get(Key key){
        Node node= bucket[index(key.hashCode())];
        return node.getValue().getValue();
    }

    int index(int hashCode){
        return (hashCode) & (bucket.length-1);
    }
}
