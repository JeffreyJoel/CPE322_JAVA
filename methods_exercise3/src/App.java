public class App {
// Function printing out random numbers between 34 and 55
    public static double randomNum(){
        return Math.floor(Math.random()*(55-34+1)+34);
    };

    public static void main(String[] args) throws Exception {
        System.out.println(randomNum());
    }
}
