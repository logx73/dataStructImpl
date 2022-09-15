package dataDirectorty.queue;

import exception.StructureEmptyException;
import exception.StructureFullException;

import java.util.Arrays;

public class QueueImplementationUsingArray {
    private int queue[];
    private int front;
    private int rear;
    private int size=0;
    public QueueImplementationUsingArray(int size){
        this.queue=new int[size];
        front=-1;
        rear=0;
    }

    public String insert(int element) throws StructureFullException {
        if(isFull()){
            throw new StructureFullException("Structure Full");
        }else if(rear!=0 && front == queue.length-1){
            front=-1;
            queue[++front]=element;
            size++;
        }
        else {
            queue[++front]=element;
            size++;
        }
        return "Added";
    }

    public String remove() throws StructureEmptyException {
        if(isEmpty()){
            throw new StructureEmptyException("Structure Empty");
        }
        else if(front!=-1 && rear==queue.length-1){
            queue[rear++]=0;
            rear=0;
            size--;
        }
        else {
            queue[rear++]=0;
            size--;
        }
        return "Removed";
    }

    public boolean isFull(){
        if((front == queue.length-1 && rear == 0) || size == queue.length){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty(){
        if((rear == queue.length-1 && front == -1) || size == 0   ){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "QueueImplementationUsingArray{" +
                "queue=" + Arrays.toString(queue) +
                ", front=" + front +
                ", rear=" + rear +
                ", size=" + size +
                '}';
    }
}
