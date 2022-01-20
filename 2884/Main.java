import java.util.Scanner;

public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int m = sc.nextInt();
    
    if ( h == 0){
      if (m < 45){
        h = 23;
        m += 15;
      }else{
        m -= 45;
      }
    }else{
      if (m < 45){
        h -= 1;
        m += 15;
      }else{
        m -= 45;
      }
    }
    System.out.printf("%d %d",h,m);
  }
}