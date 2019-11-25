//不用加法计算两个数的加法

import java.util.Scanner;
public class Main1 {
    private static int sub(int a,int b){
        if(b==0){
            return a;
        }
        int r=a^b;
        int l=(a&b)<<1;
        return sub(r,l);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(sub(a,b));
    }
}
