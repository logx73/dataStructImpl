package dataDirectorty.link;

public class Link {
    private int data ;
    private Link link;
    public Link(int data){
        this.data = data ;
    }
    public void display(){
        System.out.println("Data :"+ data);
    }
    public int getData(){
        return data;
    }
    public Link getLink(){
        return link;
    }
    public void setLink(Link link){
        this.link = link;
    }
}
