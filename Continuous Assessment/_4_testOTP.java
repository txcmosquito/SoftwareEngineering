import java.util.Random;
import java.util.Scanner;

public class _3_testOTP {
    String systemOTP, userOTP, s = "";
    int ranNo;

    public void getOTP(int len) {
        
        for (int i = 0; i < len; i++) {
           
            ranNo = new Random().nextInt(9);
            s = s.concat(Integer.toString(ranNo));
        }
        
        systemOTP = s;
        System.out.println("System generated OTP is " + systemOTP);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your OTP: ");
        userOTP = sc.nextLine();
        if (systemOTP.equals(userOTP))
            System.out.println("OTP verified successfully");
        else
            System.out.println("Please enter valid OTP!");
    }

    public static void main(String[] args) {
        _3_testOTP otp = new _3_testOTP();
        
        otp.getOTP(4);
    }

}
