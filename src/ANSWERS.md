1)nextId needs to be static because it needs to keep a value, it creates a new account to give it a new Id
2)it would have stayed everytime as the same value and each BankAccount would have the same Id
3)because you want deposit to only be accessible by the account itself
4)no because an instance field belongs to the specific object
5)any regular function can access and get the value of a static variable 
6)by making it private you can make the proper checks to check that what you are putting in is ok for example deposit negative money is not allowed
7)by making it public you allow anyone to set the amount of money they want into the account including negative money or just adding millions without a proper deposit
8)yes always because nextId is a static field so they all share its value
9)the difference is the access that returning a bankAccount gives you to its fields while a string is just what it has in it without you being able to make the proper functions on it