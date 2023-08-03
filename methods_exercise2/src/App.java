public class App {
// Function printing out random numbers between 0 and 999
    public static double randomNum(){
        return Math.floor( Math.random()*1000);
    };

    public static void main(String[] args) throws Exception {
        System.out.println(randomNum());
    }
}
