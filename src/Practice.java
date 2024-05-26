import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;





public class Practice {

static void listOfIntegers(Integer a, Integer b, Integer c, Integer d, Integer e){

  LinkedList<Integer> list = new LinkedList<>();

     list.add(a);
     list.add(b);
     list.add(c);
     list.add(d);
     list.add(e);

   System.out.print("list with DUPLICATION "+ list+" \n");

      HashSet<Integer> withNOduplicates = new HashSet<>();

 //System.out.println("list with NO DUPLICATION"+ withNOduplicates +"\n"); 

 
 

   
     
          
            for (int x :list ) {

               if(!withNOduplicates.add(x)){
                      
               System.out.println(  "\n" +x + " is duplicating ");
             
             }
              

              }

       


          
              new HashSet<>(list);
              
                         
 
         System.out.print("Linked_List with NO DUPLICATION " +   new HashSet<>(list) ); 



            }






    public static void main(String[] args) {

      

            Scanner input = new Scanner(System.in);

            int First, Second, Third, Fourth, FiFth; 
  
       System.out.println("\nENTRE FIVE NUMBERS OF YOUR CHOICE\n");

         System.out.print("ENTRE FIRST DIGIT = ");
           First = input.nextInt();

           System.out.print("ENTRE SECOND DIGIT = ");
               Second = input.nextInt();

               System.out.print("ENTRE THIRD DIGIT = ");
              Third = input.nextInt();

              System.out.print("ENTRE FOURTH DIGIT = ");
              Fourth = input.nextInt();

              System.out.print("ENTRE FIFTH DIGIT FIFTH= ");
              FiFth = input.nextInt();


 
               






         listOfIntegers(First, Second, Third, Fourth, FiFth);
        


       input.close();
    }




    
}
