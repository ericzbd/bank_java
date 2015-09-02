/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Eric
 */
public class AccountList {
    
int count = 0;
private Account aList[] = new Account[10];
    
public AccountList(){
    

Account a1 = new Account();

}//end constructor
public void addAccount(Account a1){


aList[count]=a1;    
count++;

}//end addAccount

public void display(){
    
    for(int x=0; x < count; x++){
        
        aList[x].display();
        
    }//end for
    
}//end display

/*

public static void main(String args[]){
    
    AccountList al1 = new AccountList();
    al1.display();
    
}

*/

}//end class


/*

//You will also want to know how many accounts the Customer has:



The alist is the array, AccountList is the whole object.
 
AccountList methods: 

Add - database give us account and we put it in the list (or from gui)

Public addAccount(Accounta1){
Alist[count]=a1;
Count++;
}

Display

Public void display(){

For (int x=0; x<count; x++){

Alist[x].display();

}

}

    
}
*/