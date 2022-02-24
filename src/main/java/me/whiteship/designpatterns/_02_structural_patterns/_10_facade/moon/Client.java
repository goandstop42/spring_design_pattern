package me.whiteship.designpatterns._02_structural_patterns._10_facade.moon;

/* Facade
 * - 기존 소스는 종속적인 class가 많다
 * - EmailSender를 interface로 만들고 java sender를 구현체로 만들어 활용
 * - 서브 시스템 
 */
public class Client {
    public static void main(String[] args) {
     EmailSettings emailSettings = new EmailSettings();
     emailSettings.setHost("127.0.0.1");
     
     EmailSender emailSender = new EmailSender(emailSettings);
     EmailMessage emailMessage = new EmailMessage();
     emailMessage.setFrom("moon");
     emailMessage.setTo("you");
     emailMessage.setSubject("subject");
     emailMessage.setText("contents");
     emailSender.sendEmail(emailMessage);
     
     
    }
}
