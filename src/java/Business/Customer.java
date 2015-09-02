package Business;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric
 */
public class Customer {
    
 public int custId;
    public String custPassword;
    public String custFirstName;
    public String custLastName;
    public String custEmail;
    public String custAddress;
    public double custBalance;
    public int acctNo;
    public String type;
    AccountList aList;
    public int numberOfAccounts;
    
    public Customer(){   
        
        custId = 0;
        custPassword = "";
        custFirstName = "";
        custLastName = "";
        custEmail = "";
        custAddress = "";
        custBalance = 0.0;
        numberOfAccounts = 0;
        
        
    
    }
    
       public void selectDB(int custId){

    	this.custId=custId;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c1 = DriverManager.getConnection("jdbc:odbc:ChattDB");
                System.out.println("Database connected");
                
                Statement statement = c1.createStatement();
                
                String sql = "Select * from Customers where CustID='"+custId+"'";
                
                System.out.println(sql);
                
                
                ResultSet rs = statement.executeQuery(sql);
                
                rs.next();
                //custId=rs.getInt(1);
                custPassword=rs.getString(2);
                custFirstName=rs.getString(3);
                custLastName=rs.getString(4);
                custAddress=rs.getString(5);
                custEmail=rs.getString(6);

            		    					
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foiled/Hogtied"+e); }
        
        /***************************************************************/
        
    	                      getAccountList();
         
        /********************************************************************/
        
        
    }//end selectDB
       
       public void getAccountList() {
           
           try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c1 = DriverManager.getConnection("jdbc:odbc:ChattDB");
                System.out.println("Database connected");
                
                Statement statement = c1.createStatement();
                
                String sql = "Select AcctNo from Accounts where Cid='"+custId+"'";
                
                System.out.println(sql);
                
                
                ResultSet rs = statement.executeQuery(sql);
                
              
                 String an;
                Account a1;
                int acctNo;
                
                while (rs.next()){
                    
               an=rs.getString(1);
               acctNo=Integer.parseInt(an);
               a1=new Account();
               a1.selectDB(acctNo);
               aList.addAccount(a1);
                }//end while

         }//end try
                   
         catch(Exception e)
              {System.out.println("Foiled/Hogtied"+e); }
       
       }
       
           public void insertDB(int newCustId, String newCustPassword, String newCustFirstName, String newCustLastName, String newCustAddress, 
                   String newCustEmail){
    	
        custId = newCustId;           
    
        custPassword = newCustPassword;
        
        custFirstName = newCustFirstName;
                
        custLastName = newCustLastName;
        
        custAddress = newCustAddress;
        
        custEmail = newCustEmail;     
        
      
      
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
    		System.out.println("Driver loaded");
    		
            Connection c1 = DriverManager.getConnection("jdbc:odbc:ChattDB");
    			
    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
          String sql = "INSERT into Customers VALUES('" + newCustId + "', '" + newCustPassword + "', '" + newCustFirstName + "', '" + newCustLastName + "', '" + 
                    newCustAddress + "', '" + newCustEmail + "')";
          
          System.out.println(sql);
          
    		
    		 int n = statement.executeUpdate(sql);
          
          if (n==1) 
          
            System.out.println("Successful");
            
         else
            
            System.out.println("Fail");
          
    			c1.close();
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foilage"+e); }
    	
    }//end insertDB
           
    public void updateDB(){
    	
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    		System.out.println("Driver loaded");
    		
    		Connection c1= DriverManager.getConnection
    			("jdbc:odbc:JavaDB");
    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
          String sql = "Update Accounts set Balance='" + custBalance + "', " + 
          
          " where ID = " + custId ;
          
          
          System.out.println(sql);
          
    		
    		int n = statement.executeUpdate(sql);
          
         if (n==1) 
          
            System.out.println("Successful");
            
         else
            
            System.out.println("Fail"); 
          
          
                   
    			c1.close();
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foilage"); }
    	
    }//end updateDB

	
               public void deleteDB(){
    	
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    		System.out.println("Driver loaded");
    		
            Connection c1 = DriverManager.getConnection("jdbc:odbc:ChattDB");

    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
          String sql = "Delete * from Customers where CustID='" + custId+"'";
          
          System.out.println(sql);
          
    		int n = statement.executeUpdate(sql);
          
         if (n==1) 
          
            System.out.println("Successful");
            
         else
            
            System.out.println("Fail");                    
    			c1.close();
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foilage"); }
    	
    }//end deleteDB
               
//      GETTERS AND SETTERS

            public int getCustId(){

            return custId;
            
            }   
            
            public void setCustId(int newCustId){

            custId = newCustId;

            }
            
            public String getCustPassword(){

            return custPassword;
            
            }
            
            public void setCustPassword(String newCustPassword){

            custPassword = newCustPassword;

            }
        
                    public String getCustFirstName(){

            return custFirstName;
        }    
        public void setCustFirstName(String newCustFirstName){

            custFirstName = newCustFirstName;

        }
        
        public String getCustLastName(){

            return custLastName;
        }    
        public void setCustLastName(String newCustLastName){

            custLastName = newCustLastName;

        }
        
        public String getCustAddress(){

            return custAddress;
        }    
        public void setCustAddress(String newCustAddress){

            custAddress = newCustAddress;

        }
        
        public double getCustBalance(){
            
            return custBalance;
            
        }
        
        public void setCustBalance(double newCustBalance){

            custBalance = newCustBalance;

        }
        


        public String getCustEmail(){

            return custEmail;
        }    
        public void setCustEmail(String newCustEmail){

            custEmail = newCustEmail;

        }

    public boolean login (String guipw){
        
        String pwdb = getCustPassword();
        if (guipw.equals(pwdb)){
            
            return true;
            
        }
        
        else {
         return false;   
        }//end if
  
        
    }//end login
    
       public void display() {
        System.out.println("Cust ID = "+this.getCustId());
        
        System.out.println("Cust First Name = "+this.getCustFirstName());

        System.out.println("Cust Last Name = "+this.getCustLastName());

        System.out.println("Cust Address = "+this.getCustAddress());
        
        System.out.println("Cust Email = "+this.getCustEmail());
                
        aList.display();
    }
    
    
    
    public static void main(String args[]) {
        
        Customer c1 = new Customer();
        Account a1 = new Account();
        c1.selectDB(3001);
        c1.display();
        a1.display();
        
    
    }
    
    
    
    
}//end class
         