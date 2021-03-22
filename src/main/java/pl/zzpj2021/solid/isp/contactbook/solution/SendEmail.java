package pl.zzpj2021.solid.isp.contactbook.solution;

public interface SendEmail {
    public void sendMessage(Contact emailable, String subject, String body) ;
}
