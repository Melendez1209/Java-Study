
import java.util.*;
public class TestWork {
 public static void main(String[] args) {
  boolean isPrime = true;
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  if (num > 0) {
   int k = (int) Math.sqrt(num);//正平方根求解
   for (int i = 2; i <= k; i++) {
    if (num % i == 0) {
     isPrime = false;
     break;
    }
   }
  }
  if (isPrime) {
   System.out.println(num + "是素数");
  } else {
   System.out.println(num + "不是素数");
  }
 }
}