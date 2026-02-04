
import java.util.Scanner;
public class bubble
{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       int[] a = {7,5,9,2,8};
       int n = a.length;
       int i,j,temp=0;
   for(i=n-1;i>=0;i--){
    for(j=0;j<=i-1;j++){
        if(a[j]>a[j+1]){
        temp = a[j+1];
        a[j+1] = a[j];
        a[j] = temp;
        }
    }
   }
for(i=0;i<n;i++){
    System.out.print(a[i]+" ");
}
    }
}
