class pen {
    String color;
    String type;

    // function
    public void write() {
        System.out.println("write something using pen");
    }

    // function
    public void PrintColor() {
        System.out.println(this.color);
    }
}

public class oops {

    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        // pen1.write();
        pen1.PrintColor();
        pen2.PrintColor();
    }
}