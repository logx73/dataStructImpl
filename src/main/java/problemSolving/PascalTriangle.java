package problemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {

    PascalTriangle(){

    }

    public ArrayList<ArrayList<Long>> printPascal(int n) {
        //1.create a loop for n test cases

        //4.create a list for string array of pascal triangle by row
        ArrayList<ArrayList<Long>> pascalMeta1=new ArrayList<>();
        for(int i=0;i<n;i++){
            //2.accept the row number to create pascal of that length
            Scanner scn=new Scanner(System.in);
            int row= 2;

            //5.create a PascalRow array for storing pascal tree
            ArrayList<ArrayList<Long>> pascalMeta=new ArrayList<>();
            //3.After accepting row loop it for row times
            for(int j=0;j<row;j++){
                ArrayList<Long> pascalRow=new ArrayList<>();
                for(int z=0;z<=j;z++){
                    if(j==0){
                        pascalRow.add(1l);
                    }else{
                        long in=pascalMeta.get(j-1).get(z-1) + pascalMeta.get(j-1).get(z);
                        pascalRow.add(in);
                    }
                }
                pascalMeta.add(pascalRow);
            }

        }
        return pascalMeta1;
    }

}
