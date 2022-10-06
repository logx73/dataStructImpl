package problemSolving;

import dataDirectorty.link.LinkList;
import org.junit.jupiter.api.Test;

public class MaintainTopTenScoreUsingLinkListTest {


    @Test//Not Ideal Test Case
    void verifymaintainTopTenTestScore(){
        MaintainTopTenScoreUsingLinkList maintainTopTenScoreUsingLinkList=new MaintainTopTenScoreUsingLinkList();
        maintainTopTenScoreUsingLinkList.addScore(20);
        maintainTopTenScoreUsingLinkList.addScore(10);
        maintainTopTenScoreUsingLinkList.addScore(-30);
        maintainTopTenScoreUsingLinkList.addScore(100);
        maintainTopTenScoreUsingLinkList.addScore(-100);
        maintainTopTenScoreUsingLinkList.addScore(50);
        maintainTopTenScoreUsingLinkList.toString();
    }
    @Test
    void verifymaintainTopTenTestScoreUsingSortedList(){
        MaintainTopTenScoreUsingLinkList maintainTopTenScoreUsingLinkList=new MaintainTopTenScoreUsingLinkList();
        maintainTopTenScoreUsingLinkList.addSortedListScore(20);
        maintainTopTenScoreUsingLinkList.addSortedListScore(10);
        maintainTopTenScoreUsingLinkList.addSortedListScore(-30);
        maintainTopTenScoreUsingLinkList.addSortedListScore(100);
        maintainTopTenScoreUsingLinkList.addSortedListScore(-100);
        maintainTopTenScoreUsingLinkList.addSortedListScore(50);
        maintainTopTenScoreUsingLinkList.toString();
    }
}
