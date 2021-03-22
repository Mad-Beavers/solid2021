package pl.zzpj2021.solid.isp.contactbook.solution;

class Emailer implements SendEmail {
	
	
	public void sendMessage(Contact emailable, String subject, String body) {
		
		String emailAddress = emailable.getEmailAddress();
		
		sendEmail(emailAddress, subject, body);
	}

	
	
	
	
	private void sendEmail(String emailAddress, String subject, String body) {
		// TODO Auto-generated method stub
		
	}
}