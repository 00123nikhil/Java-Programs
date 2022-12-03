public class prepost {
    public static void main(String[] args) {
        // pre increment ++a --> 1.change the value 2.use the value.
        int a = 10;
        int b = 10;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("pre increment");

        // post increment a++ --> 1.use value 2.change the value
        b = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println("post increment");

        // pre decrement --a
        b = --a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("pre decrement");

        // post decrement a--
        b = a--;
        System.out.println(a);
        System.out.println(b);
        System.out.println("post decrement");

        // operators > greater than, <less than, != not equal to
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("both are equal ");
        }

        int a1 = 4;
        int b1 = 4;
        // logical not operator ,logical and OR opeator
        if (!(a1 > b1)) {
            System.out.println("using logical not operator shows opposite of ouptput.");
        }
    }
}
