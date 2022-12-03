
//stringbuilder class 
public class strbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        // char at index
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // sb.insert()
        sb.insert(2, 'n');
        System.out.println(sb);

        // to delete extra n
        sb.delete(2, 3);
        System.out.println(sb);

        // append
        sb.append("s");
        sb.append("t");
        sb.append("a");
        sb.append("c");
        sb.append("k");
        System.out.println(sb);

        // lecture12 not completed watch complete now
    }
}
