package dataDirectorty.link;

public class DoublyLink {
    private int data;
    private DoublyLink next;
    private DoublyLink previous;

    public DoublyLink(){

    }

    public int getData(){
        return data;
    }
    public DoublyLink(int data){
        this.data=data;
    }

    public DoublyLink getNext(){
        return this.next;
    }

    public DoublyLink getPrevious(){
        return this.previous;
    }

    public void setNext(DoublyLink next){
        this.next = next;
    }

    public void setPrevious(DoublyLink previous){
        this.previous = previous;
    }

}
