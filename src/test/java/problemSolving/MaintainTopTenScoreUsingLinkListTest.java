package problemSolving;

import org.junit.jupiter.api.Test;

public class MaintainTopTenScoreUsingLinkListTest {


    @Test
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
}
