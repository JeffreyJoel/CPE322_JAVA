import java.util.* ;

public class App {
    public static double distanceBetween(int x1, int x2, int y1, int y2  ){
        // Scanner input1 = new Scanner(System.in);
        //  System.out.println("Enter your age grade:");
        //     String distance1 = input1.nextLine();
       return Math.sqrt((x2 - x1)^2 - (y2 -y1)^2) ;
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1 = input.nextInt();

        System.out.println("Enter x2:");
        int x2 = input.nextInt();

        System.out.println("Enter y1:");
        int y1 = input.nextInt();

        System.out.println("Enter y2:");
        int y2 = input.nextInt();
        System.out.println("distance between is:" + distanceBetween(x1, x2, y1, y2));
       
    }
}
