package dataDirectorty.Map;

import lombok.Data;

@Data
public class Node<K,V> {
    private int hash;
    private Key key;
    private Value value;
    private Node<K,V> node;
    Node(){

    }
}
