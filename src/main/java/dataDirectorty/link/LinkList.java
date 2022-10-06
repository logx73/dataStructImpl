package dataDirectorty.link;


import exception.StructureNotFoundException;

public class LinkList {

    Link first;
    public LinkList(){
    }
    //Not Ideally we will expose Link to other classes .Just for Trial Purpose
    public Link get(){
        return first;
    }

    public void insertSorted(int data){
        Link newLink = new Link(data);
        Link previous = null ;
        Link current = first ;
        while (current!=null && data < current.getData()){
            previous = current;
            current = current.getLink();
        }

        if(previous == null){
            first = newLink ;
        }else{
            previous.setLink(newLink);
        }
        newLink.setLink(current);
    }

    public String insert(int data){
        Link newLink = new Link(data);
        newLink.setLink(first);
        first=newLink;
        return "Added Data "+data+" Succesfully";
    }

    public String delete(int data) throws StructureNotFoundException {
        Link temp = first;
        Link prev = first;

        while(temp.getData()!=data){

            if (temp.getLink() == null){
                throw new StructureNotFoundException("No data available to delete");
            }else {
                prev = temp ;
                temp = temp.getLink();
            }

        }
        if(temp==first){
            first=first.getLink();
        }else {
            prev.setLink(temp.getLink());
        }
        return "Data "+data+" deleted Succesfully";
    }

    public void displayList(){
        System.out.println("First --> Last");
        Link temp = first;
        while(temp!=null){
            System.out.println("Data :"+temp.getData()+"\n");
            temp=temp.getLink();
        }
    }
}
