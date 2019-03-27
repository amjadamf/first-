/* 
Q1/
static
-method name
3-method overloading
4-without creating an instance of the class in which main is declared
5-int[] n = { 1, 2, 3, 4, 5 };
6-Incrementing the value stored in each element of the array.
7-equals
8-ArrayList



q4/
We have 1 cars, Car ID is 0
We have 2 cars, Car ID is 1
We have 3 cars, Car ID is 2
 */
package assignment1.amjad.farhat.pkg438051568;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1AmjadFarhat438051568 {

 
    public static void main(String[] args) {
    Scanner  m= new Scanner (System.in);
    
    
    
        System.out.println(" 30 salaries");
    double salaries []= new double [30];
    
    
    for(int i=0;i<salaries.length;i++)
        
        salaries[i]= m.nextInt();
    
    

   Arrays.sort(salaries);
        System.out.println("inter the salaries for search");
          int search =  m.nextInt();
        
         if(Arrays.binarySearch(salaries,search )>=0)
             System.out.println("found");
         else
             System.out.println("not found");
         
        double array[]=new double [10];
        
        
        
       System.arraycopy(salaries,0,array,0,array.length);
       
       
       
       
       for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
           
           
           
       }
       ArrayList<String>s =new ArrayList<String>(50);
        System.out.println("enter 10 student name ");
        for(int i=0;i<10;i++){
          String f =  m.next();
         s.add(6, f);
        }
        
        
        
    
       s.add("raed");
       s.remove(8);
       s.add(6,"maher");
       
       
       
       
        System.out.println("enter student name ");
      String studnt2 =  m.next();
        if(s.contains(studnt2))
            System.out.println("exist");
        
        
        
        
        else
            System.out.println("non exist");
        
        s.trimToSize();
        
        for(String u :s){
            
            
            System.out.println(u);
        }
        
        
         
    }
    
}
class Lol{
    private int x ;
    private  String y;
    
    public Lol (int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    

    public  String getY(int x) {
        return y;
    }
    public  String getY(){
        return y;
    }
    
}

