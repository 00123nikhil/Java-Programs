class operator{
    public static void main(String args[])
    {
        //Opeartor: is a symbol that used to perform operations according to users requirement
        //operator in java :Realational operator == != > < >= <= 
        int a=10; int b=20;
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println("End Relational Opeartor....");
        

        //Opeartor in java:Logical operator && || !
        System.out.println(a==b && a!=b);
        System.out.println(a==b || a!=b);
        System.out.println(!(a>b));
        System.out.println("End Logical Operator.....");

        //Increament decrement operator:pre/post increment +pre/post decrement
        System.out.println(a--);//10 -->9
        System.out.println(--a);//8
        System.out.println(a++);//8 --> 9
        System.out.println(++a);//10
        System.out.println("End of operators......");

        //assignment operator : = +=
        a+=10;//a=a+10;
        System.out.println(a);
        System.out.println("end of operator......");

        //conditional operator :
        int c=50;
        int r=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(r);
        System.out.println("end of operator.....");

    }
}
