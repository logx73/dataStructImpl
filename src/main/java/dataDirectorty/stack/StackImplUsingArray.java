package dataDirectorty.stack;

import java.util.Arrays;

public class StackImplUsingArray {

    private int top;
    private int[] stack;

    public StackImplUsingArray(int size){
        this.top=-1;
        this.stack=new int[size];
    }

    public String push(int value){
        if(!isFull())
            this.stack[++top]=value;
        else
            return "Cannot Add Stack Full";
        return "Added";
    }

    public String pop(){
        if(!isEmpty())
            this.stack[top--]=0;
        else
            return "Stack Empty Cannot Remove";
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
