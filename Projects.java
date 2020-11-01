class Projects {
	
	// Attributes
	int projectNumber ;
	String projectName ;
	String projectType ;
	String physicalAddress ;
	String erfNumber ;
	double totalFee ;
	double totalAmountPaid ;
	String deadline ;
	boolean finalised ;
	String completionDate ;
	
	
	// Methods
	
	//Constructor
	public Projects() {
		
		
	}
	
	
	
	//Setter
	// This will be used to set a new deadline for the project
	public void setNewDeadline (String newDeadline) {
		this.deadline = newDeadline;
	}
	
	
	
	//Setter
	// This will be used to update the total amount paid by the client
	public void setNewTotalAmountPaid(double amountPaidNow) {
		this.totalAmountPaid += amountPaidNow;
	}
	
	

	//Getter
	public int getProjectNumber() {
		return projectNumber;
	}
	
	
	
	//Getter
	public String getProjectName() {
		return projectName;
	}
	
	
	
	//Getter
	public String getProjectType() {
		return projectType;
	}
	
	
	
	//Getter
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	
	
	
	//Getter
	public String getERFNumber() {
		return erfNumber;
	}
	
	
	
	//Getter
	public double getTotalFee() {
		return totalFee;
	}
	
	
	
	//Getter
	public double getTotalAmountPaid() {
		return totalAmountPaid;
	}
	
	
	
	//Getter
	public String getDeadline() {
		return deadline;
	}
	
	
	
	//Getter
	public boolean getFinalised() {
		return finalised;
	}
	
	
	
	//Getter
	public String getCompletionDate() {
		return completionDate;
	}
	
	
	//toString 
		public String toString() {
		    String output = "\nProject number: " + projectNumber;
		    output += "\nProject Name: " + projectName;
		    output += "\nProject type: " + projectType;
		    output += "\nPhysical address for the project: " + physicalAddress;
		    output += "\nERF number: " + erfNumber;
		    output += "\nTotal fee: R" + totalFee;
		    output += "\nTotal amount paid: R" + totalAmountPaid;
		    output += "\nDeadline for project: " + deadline;
		   
		    return output;
		}

}
