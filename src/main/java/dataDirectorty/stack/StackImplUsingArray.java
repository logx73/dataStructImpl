package dataDirectorty.stack;

import exception.StructureEmptyException;
import exception.StructureFullException;

import java.util.Arrays;

public class StackImplUsingArray {

    private int top;
    private int[] stack;

    public StackImplUsingArray(int size){
        this.top=-1;
        this.stack=new int[size];
    }

    public String push(int value) throws StructureFullException {
        if(!isFull())
            this.stack[++top]=value;
        else
            throw new StructureFullException("Stack Full");
        return "Added";
    }

    public String pop() throws StructureEmptyException{
        if(!isEmpty())
            this.stack[top--]=0;
        else
            throw new StructureEmptyException("Stack Empty");
        return "Removed";
    }

    boolean isEmpty(){
        if(this.top == -1)
            return true;
        else
            return false;
    }

    boolean isFull(){
        if(this.top == (this.stack.length-1))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "StackImplUsingArray{" +
                "index=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }
}
