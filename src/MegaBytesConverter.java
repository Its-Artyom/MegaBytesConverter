public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes < 1024) {
            System.out.println(kiloBytes + " KB = " + 0 + " MB and " + kiloBytes + "KB");
        } else {
            int remainder = kiloBytes % 1024;
            int megabytes = Math.round(kiloBytes / 1024);
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + "KB");
        }
    }

    public static void main(String[] args) {
        // Testing
        printMegaBytesAndKiloBytes(2048); //Output: 2048 KB = 2 MB and 0KB
        printMegaBytesAndKiloBytes(3248); //Output: 3248 KB = 3 MB and 176KB
        printMegaBytesAndKiloBytes(533_248); //Output: 533_248 KB = 520 MB and 768KB
    }
}
