package exception;

class newClass{
    public int type(){
        try{
            System.out.println("Is this printing");
            int num = 1/0;
            return 1;
        }catch (Exception exception){
            System.out.println("Error is executing");
            return 2;
        }finally {
            return 3;
        }
    }
}

public class ExcptionTrial {
    public static void main(String[] args) {
        System.out.println(new newClass().type());
    }
}
