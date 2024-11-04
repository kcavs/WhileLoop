import java.util.*;
public class prime{
    public static void main(String[]args){
        System.out.print("enter a int: ");
        Scanner input= new Scanner(System.in);
        int x=input.nextInt();
        System.out.println(countFactors(x));
        System.out.println(countPrime(x));
    }
    public static int countFactors(int n){
        int fact=0;
        for(int i=n;i>0;i--){
            if((n%i)==0){
                fact+=1;
            }
        }
        return fact;
    }
    public static boolean isPrime(int n){
        boolean prime=(countFactors(n)==2);
        return prime;
    }
    public static int countPrime(int n){
        int num=0;
        while(n>0){
            if(isPrime(n)){
                num+=1;
            }
            n-=1;
        }
        return num;
    }
}