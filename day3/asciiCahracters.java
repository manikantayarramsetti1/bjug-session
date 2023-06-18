public class asciiCahracters {
    public static void main(String[] args) {
        for (char i = 'A' ; i <= 'Z' ; i++) {
            int asciiValue = (int) i;
            System.out.println("ascii value of: " + i + " is " + asciiValue);
        }
        for (char j = 'a' ; j <= 'z'; j++) {
            int asciiValue = (int) j;
            System.out.println("ascill value of: " + j + " is " + asciiValue);
        }
    }
}
