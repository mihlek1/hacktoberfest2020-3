import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count=0;
    
    //write your code here
    while(n!=0){
    int rsbm= n& -n;
    count++;
    n=n-rsbm;
    }
    System.out.println(count);
  }

}