import java.util.Scanner;
public class  Denominatorcheck{
    public static void main(String args[]){
        System.out.println("numerator of the first fraction:");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
    
        System.out.println(a+"\n");
        System.out.println("denomenator of the first fraction:");
        float b=sc.nextFloat();
        System.out.println(b+"\n");
        System.out.println("numerator of the second fraction:\n");
        float c=sc.nextFloat();
        System.out.println(c+"\n");
        System.out.println("denominator of the second fraction:\n");
        float d=sc.nextFloat();
        System.out.println(d+"\n");
        float firstfraction=a/b;
        float secondfraction=c/d;
        if(b==d){
            System.out.println("both denomitars are same");
        }
        else{
        System.out.println("both denominators are not same");
        }
        }
        
}