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






this project is CENTRALISED . It works independently . Every part from taking input to producing corresponding output is carried out by this project. It is not distributed over a network where several nodes are involved to perform a part of calculation as in decentralised system.







Difference between Centralised and decentralised database:
centralised- there is a common point through which every data must paas.
Advantagaes-

1. defined command chain- every member of an organisation associated with the centralised command chain know the command and course of duty they have to 			   carry out.
2. reduced cots- less cost to maintain.
3. quick decision implementation - since there are less people and less level of authorities involved so any change can be implemented faster.

Disadvantage-

1. trust issues
2. secuirity issue
3. less scalable

DECENTRALISED-decentralized internet connection relies on a peer-to-peer network built on a community of users whereby no one single entity is ever in control.Implementation of blockchain would aid tremendously.

Advantages-

1. full control-it gives full control to its user over a transaction.
2. data cannot be altered or deleted- blockchain technology is append only. so data is immutable once it is stored.
3. secure- due to cryptography
4. less censorship
5. open development

Disadvantage-
1. cost
2. crime
3. volatile cryptocurrency
4. conflict among users
