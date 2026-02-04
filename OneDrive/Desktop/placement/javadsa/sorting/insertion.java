
import java.util.Scanner;
public class insertion{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       int[] a = {13,46,24,52,20,9};
       int n = a.length;
       int i,j,temp=0;
  for(i=1;i<n;i++){
    for(j=i;j>=1;j--)
        if(a[j]<a[j-1]){
           temp = a[j-1];
           a[j-1] = a[j];
           a[j] = temp;
        }
    }
for(i=0;i<n;i++){
    System.out.print(a[i]+" ");
}
    }
}
