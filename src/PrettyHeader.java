public class PrettyHeader {
    public static void main(String[] args) {
        SafeInput safeInput = new SafeInput();
        String msg = safeInput.getNonEmptyString("Enter a message to display in the header: ");
        prettyHeader(msg);
    }

    public static void prettyHeader(String msg) {
        int headerWidth = 60;
        int msgWidth = msg.length();
        int leftWidth = (headerWidth - msgWidth) / 2 - 3;
        int rightWidth = headerWidth - leftWidth - msgWidth - 6;
        String left = "";
        String right = "";
        for (int i = 0; i < leftWidth; i++) {
            left += "*";
        }
        for (int i = 0; i < rightWidth; i++) {
            right += "*";
        }
        System.out.printf("%s***%s %s ***%s\n", "*", left, msg, right, "*");
        for (int i = 0; i < headerWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
