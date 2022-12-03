import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // how to declare string in java
        // String name="Tony Stack";

        // Scanner sc = new Scanner(System.in);
        // String name=sc.next();
        // String name = sc.nextLine();

        // next() is used only print one single word
        // System.out.println("Your name is :" + name);

        // concetantion
        String firstname = "Nikhil";
        String lastname = "Borse";
        String Fullname = firstname + "" + lastname;
        System.out.println(Fullname);
        System.out.println(Fullname.length());// to count string length

        // charAt()
        for (int i = 0; i < Fullname.length(); i++) {
            System.out.println(Fullname.charAt(i));
        }

        // compare = compareTo()
        String n1 = "Tony";
        String n2 = "stack";
        // 1 case s1>s2 -->+vlaue
        // 2 case s1==s2 -->0
        // 3 case s1<s2 -->-ve value
        if (n1.compareTo(n2) == 0) {
            System.out.println("string are equal");
        } else
            System.out.println("string are not equal");
    }

    //substring(beginning index, ending index)
    String sentence="tonystack";
    String name2=sentence.substring(4);
    system.out.println(name2);
}
