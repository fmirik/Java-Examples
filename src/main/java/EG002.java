public class EG002 {
    //Find ASCII value of a character
    public static void main(String[] args) {
        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
