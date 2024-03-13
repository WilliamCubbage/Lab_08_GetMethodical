public class PrettyHeader {
    public static void main(String[] args) {

        prettyHeader("Message Centered Here");
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgWidth = msg.length();
        int starsWidth = (totalWidth - msgWidth - 6) / 2;

        for (int i = 0; i < totalWidth; i++) { //Top Row
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        for (int i = 0; i < starsWidth; i++) //Second Row w/ Centered Msg
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < starsWidth; i++) {
            System.out.print(" ");
        }
        if (msgWidth % 2 != 0) {
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();

        for (int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }
        System.out.println();
}

}
