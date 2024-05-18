import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Practice {

     private String password;

  void setStudent_info(String StudentEmail ,String Student_password, int Year){
       
    this.password = Student_password;
    
    // Regular Exp will verify if Student password is valid or not
    Pattern pt_EMAIL = Pattern.compile("\\d{8}@\\w+\\.\\w+\\.\\w+\\.\\w+");
    Pattern pt_PASSWORD = Pattern.compile("[A-Z][a-z0-9]*\\W+[a-z0-9]*");
    //
    Matcher Student_email = pt_EMAIL.matcher(StudentEmail);
    
    Matcher Student_pass = pt_PASSWORD.matcher(Student_password);
    
    
     boolean Email_valid = Student_email.matches();
     boolean Pass_valid  = Student_pass.matches();

     //if the Email and Password are  valid then the student will have access to Exam Past Question Papers 

if (Email_valid && Pass_valid) {

    System.out.println( "YOU CAN NOW DOWNLOAD EXAM PAST QUESTION PAPERS\n");

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


                    switch (Year) {

                      //database management
                        case 2016:
                        System.out.println(Question_Paper.get(0)+"downloading......");
                       break;

                       //imperative programming
                    
                       case 2017:
                       System.out.println(entry.getValue()+"downloading......");
                      break;

                      //system analysis and design


                      case 2018:
                      System.out.println(entry.getValue()+"downloading......");
                     break;

                     //object oriented programming

                     case 2019:
                     System.out.println(entry.getValue()+"downloading......");
                    break;
                    case 2020:
                    System.out.println(entry.getValue()+"downloading......");
                   break;

                   // networking

                   case 2021:
                   System.out.println(entry.getValue()+"downloading......");
                  break;

                  //artificial intelligence

                  case 2022:
                  System.out.println(entry.getValue()+"downloading......");
                 break;

                 //data structure and algorithm

                        default:
                            break;
                    }
                    
                 }

              
                    
                 
                 

    
} else {
          System.out.println( "===PLEASE RE_ENTRE YOUR EMAIL/PASSWORD===");
}

}

     String getStudent_no(String getStudent_Pass){

        return password;
    }






public static void main(String[] args, int year) {

    //initializng String variables
       
    String getStudent_Email ,getStudent_Pass;


        // invoke a void method
    Regex_Practice get_set = new Regex_Practice();

    //Scanner object to get values from student

    Scanner input = new Scanner(System.in);

       //get student email as \^(d{8}@mvula.univen.ac.za)$

    System.out.print("ENTRE YOUR STUDENT Email _ ");
    getStudent_Email = input.nextLine();

    //get student password with Upper&&smallercase,Non word char,digit and word char 

    System.out.print("ENTRE YOUR PASSWORD_ ");
      getStudent_Pass = input.nextLine();

      //
      
      System.out.println("ENTRE THE YEAR OF THE QUESTION PAPER YOU WANT TO DOWNLOAD_ ");

        int year_ = input.nextInt();
         

              //myMethod
              get_set.setStudent_info(getStudent_Email,getStudent_Pass,year_);
              get_set.getStudent_no(getStudent_Pass);



          
         input.close();
}


}
