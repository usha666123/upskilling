import java.util.*;
public class GradeCalc {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks:");
        int a=sc.nextInt();
        a=a/10;
        switch(a){
            case 10:System.out.println("Grade:B");
                    break;
            case 9:System.out.println("Grade:A");
                    break;
            case 8:System.out.println("Grade:B");
                    break;
            case 7:System.out.println("Grade:C");
                    break;
            case 6:System.out.println("Grade:D");
                    break;
            default:System.out.println("Fail");
                    break;
        }
    }
}
