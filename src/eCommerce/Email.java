package eCommerce;

public class Email extends Notification {
    String email;

    @Override
    String sendNotification(String email, String content) {
        return super.sendNotification(email, content);
    }

}
