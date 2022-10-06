package problemSolving;

import dataDirectorty.link.Link;
import dataDirectorty.link.LinkList;

public class MaintainTopTenScoreUsingLinkList {
    private LinkList linkList=new LinkList();
    private int size;
    public MaintainTopTenScoreUsingLinkList(){
    }

    public void addScore(int score){
        linkList.insert(score);
        size++;
        sort(linkList);
    }

    void sort(LinkList linkList){
        Link tempLink=linkList.get();
        for (int i=0;i<size;i++){
                if(tempLink.getLink()==null){
                    break;
                }
                else if (tempLink.getData() < tempLink.getLink().getData()){
                    int temp= tempLink.getLink().getData();
                    tempLink.getLink().setData(tempLink.getData());
                    tempLink.setData(temp);
                }
                tempLink = tempLink.getLink();
        }
    }

    @Override
    public String toString() {
        linkList.displayList();
        return "MaintainTopTenScoreUsingLinkList{" +
                "linkList=" + linkList +
                ", size=" + size +
                '}';
    }
}
