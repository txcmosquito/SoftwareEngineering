import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
class GenerateOTP {

    public static void main(String[] args) {
        int randomPin   =(int)(Math.random()*9000)+1000;
        String otp  =String.valueOf(randomPin);
        final String ACCOUNT_SID = "AC27eccfc293255f6927dbc9e929bce6d5";
        final String AUTH_TOKEN = "4b82234513c3d6a0d88e682d12838941";

            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                            new com.twilio.type.PhoneNumber("whatsapp:+917972886276"),
                            new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                            OTPGeneration.otp)
                    .create();

            System.out.println(message.getSid());
    }
}