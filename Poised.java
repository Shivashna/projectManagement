import javax.swing.*;
public class Poised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Displaying a menu to the user
		int option = menuOption();
		
		// Creating a empty objects for which the values of the fields can be changed later on
		Projects project = new Projects();
		ProjectPeople client = new ProjectPeople(); 
		ProjectPeople contractor = new ProjectPeople();
		ProjectPeople architect = new ProjectPeople();
		
		//The program will run and allow the user to select different options until they choose option 6 (to exit the program)
		while (option != 6) {
			
			if (option == 1) {
				
				//Creating a new project object with values entered by the user
				int projectNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the project number : "));
				String projectName = JOptionPane.showInputDialog("Enter the project name or press 'ok' to create default project name : ");
				String projectType = JOptionPane.showInputDialog("Enter the project type : ");
				String physicalAddress = JOptionPane.showInputDialog("Enter the physical address for the project : ");
				String erfNumber = JOptionPane.showInputDialog("Enter the ERF number for the project : ");
				double totalFee = Double.parseDouble(JOptionPane.showInputDialog("Enter the total fee for the project : R"));
				double totalAmountPaid = Double.parseDouble(JOptionPane.showInputDialog("Enter the total amount paid by the client for the project : R"));
				String deadline = JOptionPane.showInputDialog("Enter the deadline for the project : ");
				boolean finalised = false;
			
				//Creating architect, contractor and client objects
				
				//Client object
				String clientName = JOptionPane.showInputDialog("Enter the first name and last name of the client : ");
				String[] clientNameArray = clientName.split(" ",2);
				String clientSurname = clientNameArray[1];
				String clientTelephoneNumber = JOptionPane.showInputDialog("Enter the client's telephone number : ");
				String clientEmailAddress = JOptionPane.showInputDialog("Enter the client's email address : ");
				String clientPhysicalAddress = JOptionPane.showInputDialog("Enter the client's physical address : ");
				//Changing the default values of the fields in the client object
				client.name = clientName;
				client.telephoneNumber = clientTelephoneNumber;
				client.emailAddress = clientEmailAddress;
				client.physicalAddress = clientPhysicalAddress;
			
				//Contractor object
				String contractorName = JOptionPane.showInputDialog("Enter the first name and last name of the contractor : ");
				String contractorTelephoneNumber = JOptionPane.showInputDialog("Enter the contractor's telephone number : ");
				String contractorEmailAddress = JOptionPane.showInputDialog("Enter the contractor's email address : ");
				String contractorPhysicalAddress = JOptionPane.showInputDialog("Enter the contractor's physical address : ");
				//Changing the values of the fields in the contractor object
				contractor.name = contractorName;
				contractor.telephoneNumber = contractorTelephoneNumber;
				contractor.emailAddress = contractorEmailAddress;
				contractor.physicalAddress = contractorPhysicalAddress;
			
				//Architect object
				String architectName = JOptionPane.showInputDialog("Enter the first name and last name of the architect : ");
				String architectTelephoneNumber = JOptionPane.showInputDialog("Enter the architect's telephone number : ");
				String architectEmailAddress = JOptionPane.showInputDialog("Enter the architect's email address : ");
				String architectPhysicalAddress = JOptionPane.showInputDialog("Enter the architect's physical address : ");
				//Changing the values of the fields in the architect object
				architect.name = architectName;
				architect.telephoneNumber = architectTelephoneNumber;
				architect.emailAddress = architectEmailAddress;
				architect.physicalAddress = architectPhysicalAddress;
			
				// Changing the default values to the values entered by the user
				if (projectName.isEmpty() == true) {
					// This code will execute if the user does not enter a project name
					// If a project name isn't entered, a default project name will be created
					String defaultProjectName = projectType + " " + clientSurname;
					project.projectNumber = projectNumber;
					project.projectName = defaultProjectName;
					project.projectType = projectType;
					project.physicalAddress = physicalAddress;
					project.erfNumber = erfNumber;
					project.totalFee = totalFee;
					project.totalAmountPaid = totalAmountPaid;
					project.deadline = deadline;
					project.finalised = finalised;
					System.out.println("The project has been created.\nProject details :");
					System.out.println(project + "\n");
				
				
				} else if (projectName.isEmpty() == false) {
					// This code will execute if a project name is entered by the user
					project.projectNumber = projectNumber;
					project.projectName = projectName;
					project.projectType = projectType;
					project.physicalAddress = physicalAddress;
					project.erfNumber = erfNumber;
					project.totalFee = totalFee;
					project.totalAmountPaid = totalAmountPaid;
					project.deadline = deadline;
					project.finalised = finalised;
					//Displaying the project details
					System.out.println("The project has been created.\nProject details :");
					System.out.println(project + "\n");
				}
			
				//Displaying the client, contractor and architect details
				System.out.println("Client details :");
				System.out.println(client + "\n");
				System.out.println("Contractor details :");
				System.out.println(contractor + "\n");
				System.out.println("Architect details :");
				System.out.println(architect + "\n");
				option = menuOption();
		
		
		
			} else if (option == 2){
				// Setting a new deadline for the project
			
				if (project.deadline == null) { //Checking if the project has been created or not
					System.out.println("Sorry! The project has not yet been created.");
					option = menuOption();
				}else if(project.deadline != null) {
					String newDeadline = JOptionPane.showInputDialog("Enter the new deadline for the project : ");
					project.deadline = newDeadline;
					System.out.println("\nThe new deadline is : " + project.getDeadline());
					option = menuOption();
				}
		
		
		
		
			} else if (option == 3){
				// Changing the total amount paid by the client
				// This option allows the total amount paid by the client to be updated every time the client pays a partial amount
			
				if (project.totalAmountPaid == 0.0d) { //Checking whether the project has been created yet or not
					System.out.println("Sorry! The project has not yet been created.");
					option = menuOption();
				} else if (project.totalAmountPaid != 0.0d) {
					double amountPaidNow = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount paid by the client : R"));
					project.setNewTotalAmountPaid(amountPaidNow);
					System.out.println("\nThe updated amount paid by the client is : R" + project.getTotalAmountPaid());
					option = menuOption();
				}
		
		
		
		
			}else if (option == 4) {
				//Editing the contractor's contact details
				if (contractor.telephoneNumber == null && contractor.emailAddress == null) { //If this condition is true is means that the project has not been created yet
					System.out.println("Sorry! The project for which this contractor has been assigned has not yet been created yet.");
					option = menuOption();
				} else {
					int contractorOption = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the option you wish to select :\n1\t- Edit contractor's telephone number\n2\t- Edit the contractor's email address\nEnter an option number to continue : "));
					if (contractorOption == 1) {
						String newTelephoneNumber = JOptionPane.showInputDialog("Enter the new telephone number for the contractor : ");
						contractor.setNewTelephoneNumber(newTelephoneNumber);
						System.out.println("\nThe new telephone number for the contractor is : " + contractor.getTelephoneNumber());
						option = menuOption();
					} else if (contractorOption == 2) {
						String newEmailAddress = JOptionPane.showInputDialog("Enter the new email address for the contractor : ");
						contractor.setNewEmailAddress(newEmailAddress);
						System.out.println("\nThe new email address for the contractor is : " + contractor.getEmailAddress());
						option = menuOption();
					}
				}
		
		
		
		
			}else if (option == 5) {
				//Finalizing a project
				if (client.name == null && client.telephoneNumber == null && client.emailAddress == null && client.physicalAddress == null && project.finalised == false) {
					System.out.println("Sorry! The project for this client has not been created yet.");
					option = menuOption();
				}else {
					project.finalised = true;
					double amountPaid = project.getTotalAmountPaid();
					double totalFee = project.totalFee;
					if (amountPaid == totalFee) {
						System.out.println("The client has paid the full fees for the project.");
						option = menuOption();
					
					} else {
						String clientName = client.getName();
						String clientTelephoneNumber = client.getTelephoneNumber();
						String clientEmailAddress = client.getEmailAddress();
						String clientPhysicalAddress = client.getPhysicalAddress();
						String completionDate = JOptionPane.showInputDialog("Enter the completion date of the project : ");
						project.completionDate = completionDate;
						double amountStillToPay = totalFee - amountPaid;
						System.out.println("\nInvoice Number : " + project.getERFNumber());
						System.out.println("\nClient's name : " + clientName + "\nClient's telephone number : " + clientTelephoneNumber + "\nClient's email address : " + clientEmailAddress + "\nClient's physical address : " + clientPhysicalAddress + "\nAmount still outstanding : R" + amountStillToPay);
						option = menuOption();
					}
			
				}
			} else if (option != 6) {
				System.out.print("Goodbye");
			}
		
		}
	}
	
	public static Integer menuOption() {
		int option = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the option you would like to select :\n1\t- Create a new project\n2\t- Change the due date of a project\n3\t- Change the amount still to be paid for a project\n4\t- Update a contractor's contact details\n5\t- Finalise a project\n6\t- Exit\nEnter an option number to continue : "));
		return option;
	}
}