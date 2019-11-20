import java.sql.*
class FetchCustomerRecords{
    public static void main(String[]args)throws Exception{
        //Registering JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Establishing connection with right driver arguments
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CustomerDataSource","myuser", "password")
        //Disable Auto Commit
        con.setAutoCommit(false);

        //create statement object
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO Customers VALUES ('Daniel Karuri','+254722890345','Sangale Road'). ");

        //committing transaction
        con.commit();
        //closing connection
        con.close();
        
    }
}