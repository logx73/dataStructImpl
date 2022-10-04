package dataDirectory.Link;

import dataDirectorty.link.LinkList;
import exception.StructureNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LinkListTest {

    static LinkList linkList;

    @BeforeAll
    static void initialInsert() throws StructureNotFoundException {
        linkList=new LinkList();
    }

    @Test
    void verifyDataInsertedSuccesfully(){
        Assertions.assertEquals("Added Data "+100+" Succesfully",linkList.insert(100));
    }

    @Test
    void verifyNoDataToDeleteException(){
        Assertions.assertThrows(StructureNotFoundException.class,()-> linkList.delete(500));
    }

    @Test
    void verifyDataDeletedSuccesfully() throws StructureNotFoundException {
        Assertions.assertEquals("Data "+100+" deleted Succesfully",linkList.delete(100));
    }
}
