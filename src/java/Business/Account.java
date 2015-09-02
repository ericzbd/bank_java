package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric
 */
public class Account {
    
    public int acctNo;
    public int custId;
    public String type;
    public double custBalance;
    public double deduction;
    public double thismuchshort;
    public String custPassword;
    public String custFirstName;
    public String custLastName;
    public String custEmail;
    public String custAddress;
    
           public void selectDB(int acctNo){

    	int an = acctNo;
        
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c1 = DriverManager.getConnection("jdbc:odbc:ChattDB");
                System.out.println("Database connected");
                
                Statement statement = c1.createStatement();
                
                String sql = "Select * from Accounts where AcctNo='"+an+"'";
                
                System.out.println(sql);
                
                
                ResultSet rs = statement.executeQuery(sql);
                
                rs.next();
                //custId=rs.getInt(1);
                custId=rs.getInt(2);
                type=rs.getString(3);
                custBalance=rs.getDouble(4);
        

            		    					
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foiled/Hogtied"+e); }
    	
    }//end selectDB
       
           public void insertDB(int newAcctNo, int newCustId, String newType, double newBalance){
    	
        acctNo = newAcctNo;           
    
        custId = newCustId;
                       
        type = newType;
        
        custBalance = newBalance;
        
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
    		System.out.println("Driver loaded");
    		
            Connection c1 = DriverManager.getConnection("jdbc:odbc:ChattDB");
    			
    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
          String sql = "INSERT into Accounts VALUES('" + newAcctNo + "', '" + newCustId + "', '" + newType + "', '" + newBalance + "')";
          
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

    public void updateDB(double custBalance){
    	
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
          
          String sql = "Delete * from Accounts where CustID='" + custId+"'";
          
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
               
    public void deposit(double credit){
         
    custBalance = custBalance + credit;
    
    updateDB(custBalance);
    
    }
        
    public void withdraw(double deduction)/* throws InsufficientFundsException */{
   
      if( custBalance >= deduction ){
      
         custBalance -= deduction;
      }
      else {
      
         double thisMuchShort = deduction - custBalance;
		 
         /*throw new InsufficientFundsException(thisMuchShort); */
      }
   }//end withdraw
    
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
    
        public void display() {
            
            System.out.println("Cust ID = "+this.getCustId());
            
            System.out.println("Cust Balance = "+this.getCustBalance());
            
            
            /*
        System.out.println("Cust ID = "+this.getCustId());
        
        System.out.println("Cust First Name = "+this.getCustFirstName());

        System.out.println("Cust Last Name = "+this.getCustLastName());

        System.out.println("Cust Address = "+this.getCustAddress());
        
        System.out.println("Cust Email = "+this.getCustEmail());
        
      //  System.out.println("Cust Balance = "+this.getCustBalance());
        */
    }
    
   /*    public void display(){
    

      
      System.out.println( "Your custBalance is: "+ getCustBalance());
            
      
   }//end display
       


    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
        
}
    

