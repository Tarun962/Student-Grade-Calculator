import java.util.*;
public class  gradecalculator{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter marks of physics : ");
        int phy=sc.nextInt();

        System.out.print("Enter marks of chemistry : ");
        int chem=sc.nextInt();

        System.out.print("Enter marks of maths : ");
        int maths=sc.nextInt();

        int total=phy+chem+maths;
        System.out.println("Total Marks :"+total+ " out of 300");

        int avg=(phy + chem + maths)/3;
        System.out.println("The Average of numbers = "+ avg);

        int percentage= (total*100)/300;
        System.out.println("The Percentage of numbers = "+ percentage +" %");

        System.out.println("Criteria for grade calculation is \n A -> 100% to 85%\n B -> 85% to 75% \n C -> 75% to 60% \n D -> 60% to 45% \n Fail -> less than 45% ");

        if(percentage>=85){
            System.out.println("Your Grade is A");
        }else if(percentage>=75){
            System.out.println("Your Grade is B ");
        }else if(percentage>=60){
            System.out.println("Your Grade is C ");
        }else if(percentage>=45){
            System.out.println("Your Grade is D");
        }else{
            System.out.println("Result -> FAIL \nBest Of Luck For Next Time ");
        }

    }
}
