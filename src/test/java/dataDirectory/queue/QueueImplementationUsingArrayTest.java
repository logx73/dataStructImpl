package dataDirectory.queue;

import dataDirectorty.queue.QueueImplementationUsingArray;
import exception.StructureEmptyException;
import exception.StructureFullException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QueueImplementationUsingArrayTest {

    QueueImplementationUsingArray queueImplementationUsingArray;

    @BeforeAll
    public void initialInsertInit() throws StructureFullException {
        queueImplementationUsingArray=new QueueImplementationUsingArray(5);
        queueImplementationUsingArray.insert(101);
        System.out.println(queueImplementationUsingArray.toString());
        queueImplementationUsingArray.insert(102);
        System.out.println(queueImplementationUsingArray.toString());
        queueImplementationUsingArray.insert(103);
        System.out.println(queueImplementationUsingArray.toString());
        queueImplementationUsingArray.insert(104);
        System.out.println(queueImplementationUsingArray.toString());
        queueImplementationUsingArray.insert(105);
        System.out.println(queueImplementationUsingArray.toString());
    }

    void popInit() throws StructureEmptyException,StructureFullException{
        queueImplementationUsingArray.remove();
        System.out.println(queueImplementationUsingArray.toString());
        queueImplementationUsingArray.remove();
        System.out.println(queueImplementationUsingArray.toString());
        queueImplementationUsingArray.remove();
        System.out.println(queueImplementationUsingArray.toString());
        queueImplementationUsingArray.remove();
        System.out.println(queueImplementationUsingArray.toString());
        queueImplementationUsingArray.remove();
        System.out.println(queueImplementationUsingArray.toString());
        queueImplementationUsingArray.remove();
        System.out.println(queueImplementationUsingArray.toString());
    }


    @Test
    void fullQueueException() throws StructureEmptyException, StructureFullException {
        Assertions.assertThrows(StructureFullException.class,()->queueImplementationUsingArray.insert(106));
    }

    @Test
    void emptyQueueException() throws StructureFullException,StructureEmptyException{
        Assertions.assertThrows(StructureEmptyException.class,()->popInit());
    }
}
