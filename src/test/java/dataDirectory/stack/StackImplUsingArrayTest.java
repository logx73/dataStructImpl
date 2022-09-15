package dataDirectory.stack;

import dataDirectorty.stack.StackImplUsingArray;
import exception.StructureEmptyException;
import exception.StructureFullException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StackImplUsingArrayTest {

    StackImplUsingArray stackImplUsingArray;

    @BeforeAll
    void InitialPushRun() throws StructureFullException{

        stackImplUsingArray=new StackImplUsingArray(5);
        stackImplUsingArray.push(101);
        System.out.println(stackImplUsingArray.toString());
        stackImplUsingArray.push(102);
        System.out.println(stackImplUsingArray.toString());
        stackImplUsingArray.push(103);
        System.out.println(stackImplUsingArray.toString());
        stackImplUsingArray.push(104);
        System.out.println(stackImplUsingArray.toString());
        stackImplUsingArray.push(105);
        System.out.println(stackImplUsingArray.toString());
    }

    @Test
    void stackPushOverloadException() throws StructureFullException {
        Assertions.assertThrows(StructureFullException.class,()->stackImplUsingArray.push(107));
    }

    void stackPop() throws StructureEmptyException{
        stackImplUsingArray.pop();
        System.out.println(stackImplUsingArray.toString());
        stackImplUsingArray.pop();
        System.out.println(stackImplUsingArray.toString());
        stackImplUsingArray.pop();
        System.out.println(stackImplUsingArray.toString());
        stackImplUsingArray.pop();
        System.out.println(stackImplUsingArray.toString());
        stackImplUsingArray.pop();
        System.out.println(stackImplUsingArray.toString());
        stackImplUsingArray.pop();
    }

    @Test
    void stackPopEmptyException() throws StructureEmptyException {
        Assertions.assertThrows(StructureEmptyException.class,()->stackPop());
    }
}
