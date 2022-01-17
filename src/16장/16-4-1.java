import java.util.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      if(n>m){
          System.out.println(0);
      }
      else{
          long a[] = new long[n];
          for(int i=0;i<n;i++){
              a[i]=sc.nextLong();
          }
          long ans=1;
          for(int i=0;i<n;i++){
              for(int j=i+1;j<n;j++){
                  ans = ((ans%m)*(Math.abs(a[j]-a[i]))%m)%m;
              }
          }
          System.out.println(ans);
      }
    }
}