package dataDirectory.Link;

import dataDirectorty.link.DoublyList;
import org.junit.jupiter.api.Test;

public class DoublyListTest {
    @Test
    void insertTestOnDoubly(){
//        DoublyList doublyList=new DoublyList();
//        doublyList.insertFirst(10);
//        doublyList.insertFirst(20);
//        doublyList.insertLast(30);
//        doublyList.insertLast(40);
        DoublyList doublyList = new DoublyList();
        doublyList.insert(10);
        doublyList.insert(20);
        doublyList.delete(0);
    }
}
