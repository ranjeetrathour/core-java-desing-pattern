package abstractpattern.object.pool;

public class UserService {
    public static void main(String[] args) {
        // Create an instance of the EmailClientManager.
        EmailClientManager emailClientManager = new EmailClientManager();

       for (int i=0; i<7; i++){
           EmailClient emailClient = emailClientManager.getEmailClientConnectionFromManager();
           if (emailClientManager.currentlyUsesEmailClient.size()>5){
               emailClientManager.releasedEmailClient(emailClient);
           }
           if (emailClient!=null){
               System.out.println("got object "+emailClientManager.currentlyUsesEmailClient.size());
           }else {
               System.out.println("Could not get EmailClient " + i + " because the pool is at max capacity.");
           }
       }
    }
}
