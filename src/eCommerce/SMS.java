package eCommerce;

public class SMS extends Notification {
    String phone;

    @Override
    String sendNotification(String phone, String content) {
        return super.sendNotification(phone, content);
    }
}
