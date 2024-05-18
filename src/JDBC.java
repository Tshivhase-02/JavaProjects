import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JDBC {

    static final String url = "jdbc:mysql://localhost:3306/javaprojects";
    static final String user = "root";
    static final String password = "";
   
    static void DBconnection(){
        //

         
      Connection con = null;
    
         try {
               
             con = DriverManager.getConnection(url, user, password);
             PreparedStatement stm = con.prepareStatement("");
                  //stm.setString(1, Fname);
                  //stm.setString(2, Lname);
                  //stm.setInt(3, identity);
              stm.execute();

 
            
              System.out.println("QUERY IS EXECUTED \n");
             con.close();

    
         } catch (Exception e) {
            
           e.printStackTrace();
         
 }


    }

}
