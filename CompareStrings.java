public class CompareStrings {

    public static void main(String[] args) {

        String style = new String("saveetha@789");
        String style2 = new String("saveetha@123");

        if(style.equals(style2))
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}
