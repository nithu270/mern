import java.util.Scanner;
public class selectionsort{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       int[] a = {7,5,9,2,8};
       int n = a.length;
       int i,j,min;
       for(i=0;i<n-1;i++){
        min = i;
        for(j=i+1;j<n;j++){
           if(a[min]>a[j]){
min = j;
           }
        }
        int temp = a[min];
        a[min] = a[i];
        a[i] = temp;
       }
       for(i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }

    }
}