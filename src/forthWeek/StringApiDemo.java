package forthWeek;

public class StringApiDemo {

    public static void main(String[] args) {

        String s = "Hello World !";
        s = s.toUpperCase();
        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());
        // System.out.println(s);

        String[] array = s.split(" ");
        // for (String string : array) {
        //     System.out.println(string);
        // }

       System.out.println( s.substring(6, 11));
       
       System.out.println(s.replaceAll("O", "E"));

       String email = "Test@gmail.com";
       email = email.toLowerCase();
       String[] emailParts = email.split("@");
       for (String string : emailParts) {
           System.out.println(string);
       }
    }
}
