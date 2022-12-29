import java.util.Random;

public class _3_OTPwithOOPDesign {
    // Declare all the variables
    String systemOTP, userOTP;
    static String s = "";
    static int ranNo;

    // Use getOTP( ) method to generate random OTP
    public static String getOTP(int len) {
        // Use for loop to iterate 4 times and generate random OTP
        for (int i = 0; i < len; i++) {
            // Generate random digit within 0-9
            ranNo = new Random().nextInt(9);
            s = s.concat(Integer.toString(ranNo));
        }
        // Return the generated OTP
        return s;
    }

    public static void main(String[] args) {
        // Call getOTP( ) method and display the generated OTP
        System.out.println("System generated OTP is " + getOTP(4));
    }

}