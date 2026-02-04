//In java there is nothing like pass by ref only pass by value
//shadowing - the higher level variable will be shadowed

/* 

public class fandm{
    static int c = 10;
    public static void main(String[] args){
        int c = 20;
        System.out.print(c); 
        func();
    }
        static void func(){
            System.out.print(c); //the scope of int c = 20; will only be with main func 
        }
}



*/
//variable length argument
/* 

import java.util.Arrays;
public class fandm {
public static void main(String[] args){
 func( "nithya","shreee","ck","good"); // the len of the varible varies
}
static void func(String ...v)// i can also add 3 args thats my wish
{
    System.out.print(Arrays.toString(v));
}    
}

*/


//func overloading - same func name same type but different args datatype (it decides which function to run while compile time)
/*import java.util.Scanner;
public class fandm{

    /**
     * @param args
     /*
    public static void main(String[] args){
Scanner in = new Scanner(System.in);
int i = 0;
for(i=100;i<=999;i++){
    int temp = i;
int sum = 0;

  boolean arms = arm(temp,sum,i);
  if(arms){
    System.out.println(i);
  }
}
    }
     static boolean arm(int temp,int sum,int i){
        while(temp!=0){
            int rev = temp%10;
            sum += rev*rev*rev;
            temp/=10;
        }
        if(sum==i){
        return true;
        }
        return false;
    }
}*/