package assessment_20_11_2022;

import java.util.Scanner;
public class TwoPoints{

    public static int computePointOfInterception(int X, int Y) {
    //TODO Add your implementation here
    if(X==Y){
        return X;
    }
    else if(X==0 && Y==0){
        return 12;
    }
    else{
        return computePointOfInterception(((X+2)%12),((Y+1)%12));
    }
    }

    public static void main(String[] args) {
        Scanner UserInput=new Scanner(System.in);
        System.out.println("Enter the position(1 to 12) of the node X");
        int X=UserInput.nextInt();
        System.out.println("Enter the position(1 to 12) of the node Y");
        int Y=UserInput.nextInt();
        if((X>0 && X<=12) && (Y>0 && Y<=12)){
            System.out.println("The nodes X and Y meet each other at point "+computePointOfInterception(X,Y));
        }
        else{
            System.out.println("\nEnter valid positions for nodes X and Y");
        }
        
        
        System.out.println("\nThe nodes X (X=2) and Y (Y=4) meet each other at point "+computePointOfInterception(2, 4)+ "\n");
        }

}
