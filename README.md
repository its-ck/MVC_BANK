# MVC_BANK
It is a simple MVC_BANK in Java language based on Model, View, Controller Architecture.


To Run This Simple MVC Bank Web Application You Need Following Files;

1.	Eclipse(Mars Or Neon)
2.	Tomcat 8.0 or Above.
3.	Oracle DB (11g Express Edition).
4.	ojdbc14.jar file Which is included in Project 
	WebContent/WEB-INF/lib/ojdbc14.jar
	
	

STEPS TO RUN :

STEP 1:

 Copy and Paste Project in Eclipse IDE.

STEP 2:

Create a Database Table in Oracle DB With Following Attributes :

Create table Customer
(
	Actno number(20),
	Name varchar2(50),
	Amount number(10,2)
);

It Should Show table Created in Oracle Database.

Then insert Few Records/ Entries

insert into Customer values(123,'Developer',****.**);
insert into Customer values(124,'Developer1',****.**);
insert into Customer values(125,'Developer2',****.**);
insert into Customer values(126,'Developer3',****.**);
insert into Customer values(127,'Developer4',****.**);
insert into Customer values(128,'Developer5',****.**);
insert into Customer values(129,'Developer6',****.**);
insert into Customer values(130,'Developer7',****.**);
insert into Customer values(131,'Developer8',****.**);
insert into Customer values(132,'Developer9',****.**);

STEP 3 :

Go to WebContent Folder in Eclipse and run index.html File in Web Browser


STEP 4 :

Give Valid Account No and Update it in Data Base, It would Give you Message Updated Successfully,
Give InValid Account No and Update it in Data Base, It would Give you Message Acount not Exists,


Enjoy....



