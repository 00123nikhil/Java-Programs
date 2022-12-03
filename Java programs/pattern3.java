//half pyramid pattern in java
//inverted pyramid pattern in java

public class pattern3
{
    public static void main(String args[]){
        int n=4;

        //outer loop
        //for(int i=1;i<=n;i++)
        for (int i=n;i>=1;i--)//for inverted pattern in java
        {
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}