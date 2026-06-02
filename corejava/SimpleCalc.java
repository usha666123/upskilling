import java.util.*;
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second nuumber:");
        int b=sc.nextInt();
        int ans;
        System.out.println("select operation(+,-,x,/):");
        char c=sc.next().charAt(0);
        switch(c){
            case '+':ans=a+b;
                    System.out.println("result="+ans);
                        break;
            case '-':ans=a-b;
                         System.out.println("result="+ans);
                        break;
            case 'X':ans=a*b;
                         System.out.println("result="+ans);
                        break;
            case '/':ans=a/b;
                             System.out.println("result="+ans);
                        break;
            default:System.out.println("invalid");
        }




    }
}
