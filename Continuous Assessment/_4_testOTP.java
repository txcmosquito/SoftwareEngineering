import java.util.Random;
import java.util.Scanner;

public class _3_testOTP {
    // Declare all the variables
    String systemOTP, userOTP, s = "";
    int ranNo;

    // Use getOTP( ) method to genarate random OTP
    public void getOTP(int len) {
        // Use for loop to iterate 4 times and generate random OTP
        for (int i = 0; i < len; i++) {
            // Generate random digit within 0-9
            ranNo = new Random().nextInt(9);
            s = s.concat(Integer.toString(ranNo));
        }
        // Accept the generated OTP with systemOTP
        systemOTP = s;
        System.out.println("System generated OTP is " + systemOTP);
        Scanner sc = new Scanner(System.in);
        // Accept the user given OTP
        System.out.print("Enter your OTP: ");
        userOTP = sc.nextLine();
        if (systemOTP.equals(userOTP))
            System.out.println("OTP verified successfully");
        else
            System.out.println("Please enter valid OTP!");
    }

    public static void main(String[] args) {
        _3_testOTP otp = new _3_testOTP();
        // Call getOTP( ) method
        otp.getOTP(4);
    }

}