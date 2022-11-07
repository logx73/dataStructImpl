package dataDirectorty.link;

public class DoublyList {
    private DoublyLink first;
    private DoublyLink last;

    public DoublyList(){
        first = new DoublyLink();
    }

    public void insertSingly(int data){
        DoublyLink doublyLink=new DoublyLink(data);
        first.setNext(doublyLink);
        doublyLink.setPrevious(first);
        first = doublyLink ;
    }

    public void deleteSingly(int data){
        DoublyLink nCurrent = first;
        DoublyLink current = first;
        DoublyLink previous = first;
        while(current.getData()!=data && nCurrent!= null){
            current = current.getPrevious();
            previous = current.getNext();
            nCurrent = current.getPrevious();
        }
            if(current.getNext()==null){

                first = first.getPrevious();
                first.setNext(null);

            }else if(nCurrent == null){
                System.out.println("Canot find");
            }
            else{
            previous.setPrevious(nCurrent);
            nCurrent.setNext(previous);
        }
    }

    public void insertFirst(int data){
        DoublyLink frontLink = new DoublyLink(data);
        if(isEmpty()){
            last=frontLink;
        }else{
            first.setNext(frontLink);
        }
        frontLink.setPrevious(first);
        first = frontLink;
    }

    public boolean isEmpty(){
        if(first.getPrevious()==null && first.getNext()==null){
            return true;
        }else{
            return false;
        }
    }

    public void insertLast(int data){
        DoublyLink lastLink = new DoublyLink(data);
        if(isEmpty()){
            first=lastLink;
        }else{
            last.setNext(lastLink);
            lastLink.setPrevious(last);
        }
        last = lastLink;
    }

    public String deleteKey(long key)
    {
        DoublyLink current = first;
        while(current.getData() != key)
        {
            current = current.getPrevious();
            if(current == null)
                return "Not Found";
        }
        if(current==first)
            first = current.getPrevious();
        else
            current.getNext().setPrevious(current.getPrevious());
        if(current==last)
            last = current.getNext();
        else
            current.getPrevious().setNext(current.getNext());

        return "Deleted";
    }
}
