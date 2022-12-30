import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
public class Send {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "*";
    public static final String AUTH_TOKEN = "*";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:+917972886276"),
                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        OTPGeneration.GOTP())
                .create();

        System.out.println(message.getSid());
    }
}
