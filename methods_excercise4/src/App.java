public class App {

    public static double convertToRad(int deg){
        return Math.toRadians(deg);
    };

    public static void main(String[] args) throws Exception {
        double result  = convertToRad(54);
        System.out.println(result);
    }
}
