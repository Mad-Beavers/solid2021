package pl.zzpj2021.solid.isp.contactbook.solution;

class InterfaceSegregationPrincipleGood {
	
	SendEmail emailer;
	MakeCall dialler;
	
	public InterfaceSegregationPrincipleGood() {
		emailer = new Emailer();
		dialler = new Dialler();
	}
	
	public static void main(String[] args) {
		
		InterfaceSegregationPrincipleGood interfaceSegregationPrinciple = new InterfaceSegregationPrincipleGood();
		interfaceSegregationPrinciple.contactPeople();
		
	}
	
	public void contactPeople() {
		
		Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");
		emailer.sendMessage(contact, "promocja", "tanio dzisiaj!");
		dialler.makeCall(contact);
	}
	

}
