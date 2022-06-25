Loan = contract to that inherits the given MetaCoin contract. It calculates basic loans and transactions and updates the ledger.
modifier isOwner- checks whether the caller is owner or other and doesnt allow anyone other the owner.
constructor()- initialises the Owner state variable with the address of creator (tx.origin)
mulDiv()- three parameters. calculates and returns basic simple interests. It is called in getcompundinterest() iteratively.
getcompundinterest()- takes principle amount , rate, time as parameters and returns the net amounnt after adding the compund interest.
reqloan()- same parameters as above. returns the loan amount by calling getcompoundinterest() and passing the parameters.it stores the loan amount in toPAy. this function can be called by anyone whoever wants to update debt owners owes to him. it stores the loan amount in the mapping "loans" corresponding to address of the caller and displays the update in the ledger.
getOwnerBalance()- calls the getBalance function of MetaCoin contract and returns the balance.
viewDues()- can be called only by owner. the scope is checked by the modifier isOwner.it has one parameter that stores address of node whose dues are to be checked.returns the loan amount by calling laons mapping.
settleDues()- only accessed by owner by implementing modifier.calls sendCoin() by passing the address of node and owners address and stores the bool value and checsks if proccess was possible. if true the dues are updated to 0 in mapping loans.else false.

how to run?
compile the code in remix ide.
deploy the contract.
in deployed contracts section there will be 8 functions available.
1)reqloan()- in accounts section above change the account and and pass the principle,rate and time,Run. this updates the mapping with diiferent laons that owner owes to various nodes.
2)getOwnerBalance()- can be accessed by any account. returns the balance of the owner.
3)viewDues()- select the original account which deployed the contract. copy the address of other nodes and pass it as parameter. returns the dues .
4)settleDues()- pass the address of the other node as parameter. settles the dues.
