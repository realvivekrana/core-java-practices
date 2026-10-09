package chapter10;

public class string {
    public static void main(String[] args){
        // String name = "Vivek";
        // System.out.println(name);

        // String city = new String("Pune");
        // System.out.println(city);

        // String name = "Vivek";
        // System.out.println(name.length());
        // System.out.println(name.charAt(0));
        // System.out.println(name.charAt(4));
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        

        // String sentence = "I Love Java";
        // System.out.println(sentence.contains("Java"));

        // String language = "   Java Programming   ";
        // System.out.println(language.startsWith("java"));
        // System.out.println(language.endsWith("Programming"));

        // System.out.println(language.replace("Java", "Python"));

        // System.out.println(language.trim());

        // String a = "Java";
        // String b = "Java";

        // System.out.println(a == b);
        // System.out.println(a.equals(b));


        // String a = new String("Java");
        // String b = new String("Java");

        // System.out.println(a == b);
        // System.out.println(a.equals(b));

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(0, "Hello");
        sb.delete(0, 7);
        sb.reverse();
        System.out.println(sb);
    }
}
