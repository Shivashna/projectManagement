 class ProjectPeople {
	
	// Attributes
	String name ;
	String telephoneNumber ;
	String emailAddress ;
	String physicalAddress ;
	
	// Methods
	// Constructor
	public ProjectPeople() {
		
	}
	
	//Setter
	// This will be used to set a new telephone number for the contractor
	public void setNewTelephoneNumber(String newTelephoneNumber) {
		this.telephoneNumber = newTelephoneNumber;
	}
	
	
	//Setter
	// This will be used to set a new email address for the contractor
	public void setNewEmailAddress(String newEmailAddress) {
		this.emailAddress = newEmailAddress;
	}
	
	
	//Getter
	public String getName() {
		return name;
	}
	
	
	//Getter
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	
	//Getter
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	//Getter
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	
	//toString method
	public String toString() {
	    String output = "\nName: " + name;
	    output += "\nTelephone number: " + telephoneNumber;
	    output += "\nEmail address: " + emailAddress;
	    output += "\nPhysical address: " + physicalAddress;
	    
	    return output;
	}
	
	

}
