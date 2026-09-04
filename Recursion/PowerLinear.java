package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int b = sc.nextInt();

        System.out.print("Enter power : ");
        int p = sc.nextInt();

//        int ans = BaseRaiseTopower(b,p);
//        System.out.print(b+" Raised to the power "+p+" is "+ans);

        int result = LogariBaseRaPower(b,p);
        System.out.print(b+" Raised to the power "+p+" is "+result);
    }
    public static int BaseRaiseTopower(int base,int power){
        if(base==0 || power <0) return 0;
        if(power ==0) return 1;
        return base*BaseRaiseTopower(base,power-1);
    }

    public static int LogariBaseRaPower(int Base,int power){

        if(power == 0) return 1;
        int call = LogariBaseRaPower(Base,power/2);
        if(power%2==0) return call*call;
        else return Base*call*call;

    }
}
