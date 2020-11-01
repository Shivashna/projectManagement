# Project Management

## What Is The Purpose Of This Program And Who Can Use It?

This program is a project management system for a small structural engineering firm. It was originally named 'Poised' as that was the company that it was designed for. This program allows the user to create a new project by allowing them to enter all the details for the project itself and the details for all the people involved with the project such as the client, contractor and architect. It also allows the user to edit certain details of the project. This program can be used by any connstruction company or other structural engineering firms and can be modified to meet their requirements.

## Describing the code 

When the user runs the code, a menu with options will be displayed. The user must enter the number of the option they wish to select. The following options are displayed to the user :

1. Create a new project
2. Change the due date of the project
3. Change the total amount paid for the project
4. Update a contractor's contact details
5. Finalise a project
6. Exit


## Option 1 - Creating A New Project

When the user selects this option, he/she will be prompted to enter the following information :

* Project number
* Project name (If the user does not enter a project name a default one will be created using the **project type** and **client's surname** )
* Project type
* Physical address for the project
* ERF number
* Total fee for the project
* Total amount paid by the client
* Deadline for the project
* Client details :
  * Name
  * Telephone number
  * Email address
  * Physical address
* Contractor details :
  * Name
  * Telephone number
  * Email address
  * Physical address
* Architect details :
  * Name
  * Telephone number
  * Email address
  * Physical address

The project will be created with the above details and the main menu will be displayed again.


## Option 2 - Changing The Due Date Of The Project

When this option is selected the program will prompt the user to enter a new deadline for the project and the original deadline will then be changed to the new deadline entered by the user and the main menu will be displayed again.


## Option 3 - Changing The Total Amount Paid For The Project

If the user selects this option, he/she will be prompted to enter an amount paid by the client. The total amount paid will then be updated by adding this amount to it and the main menu will be displayed again.


## Option 4 - Updating The Contractor's Details

When this option is selected, a menu will be displayed with the following options :

1. Edit contractor's telephone number
2. Edit contractor's email address

The user must enter the number of the option they wish to select to continue. If option 1 is chosen, the user will be prompted to enter the contractor's new telephone number and the old telephone number will be overwritten with the new one, else if option 2 is chosen, the user will be prompted to enter the contractor's new email address and the old email address will be overwritten by the new one.

## Option 5 - Finalising A Project

When this option is selected, the program marks a project as *finalised*. The program the checks if the full fees has been paid by the client or not. If the full fees have been paid by the client the program outputs a suitable message to the user stating that the full fees have been paid. if there is still an outstanding amount to be paid, the program will generate and output an invoice with the following details :

- Client's name 
- Client's telephone number
- Client's email address
- Client's physical address
- Amount still to be paid

Thereafter the main menu will be displayed again.


## Option 6 - Exiting The Program

The program will run and the main menu will be displayed until this option is selected(user chooses to exit the program).


## How To Get This Program To Work

Simply install Java the Development Kit(JDK) version appropriate for your computer. If you do not already have it installed you can find a tutorial of how to do it here : 

https://www3.ntu.edu.sg/ehchua/programming/howto/JDK_HowTo.html#jdk-install. 

Use the following site to download and install Eclipse for Java Developers : 

https://www.eclipse.org/downloads/ 

Then simply run the code.
