                    project detail

Loancalc- this class is for calculating the loan.
			it contains a constructor and a compound() to find compound interest and simple() to find simple interest.


Account- this class is for reading basic bank details of borrower.
			it contains acc-detail() to read basic info.


Scheme- this class displays all the loan schemes. It inherits the account class.
			it has details() that displays the schemes and allows the user to select desired one.


Execute- this class creates the necessary objects of required classes in a sequence to carry out the 
			function of loan provision.
			it contains an execute() that has ‘a’ object of scheme class . This calls the acc-details() and details() . Then ‘object’ object of loancalc class to calculate the corresponding simple interest or compound interest.

            
Main-      this is main which contains the main() function. 
			in this class we can create a array of objects of execute class to carry out loan service for a number of customers.
			to run this project we have to run the main class.

