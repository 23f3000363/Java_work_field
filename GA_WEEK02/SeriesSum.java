package GA_WEEK02;
//This code is for Series sum program, that was Questioned by IITM team in there GA week 2 assignment as Question 1.
//Well what this series do is: Assume you input a number whole number 3, So first Step would mulitple all the consecutive number from 0 till the assigned value, and in every step the value decrement by 1, and same porocess repeat adding each value to the other, untill it reach 0 where while loop exit and then it prints the sum value.
import java.util.*;
public class SeriesSum{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum=0;
            int loopn=n;
            while(loopn>0){
                for(int i=0;i<=loopn;i++){
                    sum+=i*i;
                }
                loopn-=1;
            }
            System.out.println(sum);
        }
    }
}