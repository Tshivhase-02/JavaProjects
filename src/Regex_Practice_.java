
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Practice_ {

     private String password ;

  void setStudent_info(String StudentEmail ,String Student_password){
       
    
    this.password = Student_password;
    
    // Regular Exp will verify if Student password is valid or not
    Pattern pt_EMAIL = Pattern.compile("\\d{8}@\\w+\\.\\w+\\.\\w+\\.\\w+");
    Pattern pt_PASSWORD = Pattern.compile("[A-Z][a-z0-9]*\\W+[a-z0-9]*");
    //
    Matcher Student_email = pt_EMAIL.matcher(StudentEmail);
    
    Matcher Student_pass = pt_PASSWORD.matcher(Student_password);
    
    
     boolean Email_valid = Student_email.matches();
     boolean Pass_valid  = Student_pass.matches();

     //if the Email and Password are  valid then the student loop ForEach   in the HashMap

if (Email_valid && Pass_valid) {

    System.out.println( "\nYOU CAN NOW DOWNLOAD EXAM PAST QUESTION PAPERS\n");

                 HashMap<Integer,String> Question_Paper = new HashMap<>();

                 Question_Paper.put(2016,"Database management");
                 Question_Paper.put(2017,"Imperative Programming");
                 Question_Paper.put(2018,"System Analyses and Design");
                 Question_Paper.put(2019,"Object Oriented programming");
                 Question_Paper.put(2020,"Networking");
                 Question_Paper.put(2021,"Artificial Intelligence");
                 Question_Paper.put(2022,"Algorithm and Data Structure");
                 Question_Paper.put(2023,"Reasoning About Programming");


                 for (Map.Entry<Integer,String>entry : Question_Paper.entrySet()) {

                    System.out.println(entry.getKey()+" "+entry.getValue()+"\n");



                 
                 }

              
                    
                 
                 

    
} else {
          System.out.println( "===PLEASE ENTRE CORRECT EMAIL OR PASSWORD ===\n");

          System.exit(0);
          
            
}

}

// This function will display selected key in the Hashmap using switch state...

   static int getYear(int year){

      HashMap<Integer,String> Question_Paper = new HashMap<>();

      Question_Paper.put(2016,"Database management");
      Question_Paper.put(2017,"Imperative Programming");
      Question_Paper.put(2018,"System Analyses and Design");
      Question_Paper.put(2019,"Object Oriented programming");
      Question_Paper.put(2020,"Networking");
      Question_Paper.put(2021,"Artificial Intelligence");
      Question_Paper.put(2022,"Algorithm and Data Structure");
      Question_Paper.put(2023,"Reasoning About Programming");


     


      

      //
      switch (year) {

        //database management
          case 2016:
          System.out.println(Question_Paper.get(2016)+" PDF downloading.......");
         break;

         //imperative programming
      
         case 2017:
         System.out.println(Question_Paper.get(2017)+" PDF downloading.......");
        break;

        //system analysis and design


        case 2018:
        System.out.println(Question_Paper.get(2018)+" PDF downloading.......");
       break;

       //object oriented programming

       case 2019:
       System.out.println(Question_Paper.get(2019)+" PDF downloading.......");
      break;
      case 2020:
      System.out.println(Question_Paper.get(2020)+" PDF downloading.......");
     break;

     // networking

     case 2021:
     System.out.println(Question_Paper.get(2021)+" PDF downloading.......");
    break;

    //artificial intelligence

    case 2022:
    System.out.println(Question_Paper.get(2022)+" PDF downloading.......");
   break;

   //data structure and algorithm

          default:
              break;
      }
      
          System.out.println("\n");
        return 0;
    }


    String get_Password(String password){

      this.password =  password;
      return password;
    }
   


public static void main(String[] args) {

    //initializng String variables
       
    String getStudent_Email ,getStudent_Pass;


        // invoke a void method
    Regex_Practice_ get_set = new Regex_Practice_();

    //Scanner object to get values from student

    Scanner input = new Scanner(System.in);

       //get student email as \^(d{8}@mvula.univen.ac.za)$

    System.out.print("ENTRE YOUR STUDENT Email _ ");
    getStudent_Email = input.nextLine();

    //get student password with Upper&&smallercase,Non word char,digit and word char 

    System.out.print("ENTRE YOUR PASSWORD_ ");
      getStudent_Pass = input.nextLine();

      //
      

              
              //myMethod
              get_set.setStudent_info(getStudent_Email,getStudent_Pass);
            


              System.out.print("ENTRE THE YEAR OF THE QUESTION PAPER YOU WANT TO DOWNLOAD_ ");

              int year_ = input.nextInt();
                getYear(year_);
               
      
                System.out.println("\n..GOOD DAY!.. ");
          
         input.close();
}


}
