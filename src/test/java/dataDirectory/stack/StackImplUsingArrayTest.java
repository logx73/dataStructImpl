package dataDirectory.stack;

import dataDirectorty.stack.StackImplUsingArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackImplUsingArrayTest {

    StackImplUsingArray stackImplUsingArray;

    @BeforeEach
    void InitialRun(){

        stackImplUsingArray=new StackImplUsingArray(5);
        stackImplUsingArray.push(101);
        stackImplUsingArray.push(102);
        stackImplUsingArray.push(103);
        stackImplUsingArray.push(104);
        stackImplUsingArray.push(105);
    }

    @Test
    void stackPushOverloadException(){
        Assertions.assertEquals("Cannot Add Stack Full",stackImplUsingArray.push(106));
    }

    void stackPop(){
        stackImplUsingArray.pop();
        stackImplUsingArray.pop();
        stackImplUsingArray.pop();
        stackImplUsingArray.pop();
        stackImplUsingArray.pop();
        stackImplUsingArray.pop();
    }

    @Test
    void stackPopEmptyException(){
        stackPop();
        Assertions.assertEquals("Stack Empty Cannot Remove",stackImplUsingArray.pop());
    }
}
