
import java.util.Scanner;
public class quick{

  public static void quicksort(int[] a,int low,int high){
     if(low<high){ 
  int pind = qs(a, low, high);
  quicksort(a,low,pind-1);
  quicksort(a,pind+1,high);
 
  }
  }

  public static int qs(int[] a,int low,int high){
    int i = low;
    int j = high;
    int p = a[low];
    while(i<j){
      while(a[i]<=p&&i<=high-1){
        i++;
      }
      while(a[j]>p&&j>=low+1){
        j--;
      }
      if(i<j){
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      }
    }
    
    int temp = a[low];
     a[low] = a[j];
     a[j]  = temp;
    
     return j;
  }

    public static void main(String[] args){
      int[] a = {9,7,5,14,6,2,3,10};
      int i;
      quicksort(a,0,a.length-1);
      for(i=0;i<a.length;i++){
        System.out.print(a[i]);
      }

      }
    }
