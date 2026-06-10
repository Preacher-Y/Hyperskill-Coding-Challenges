import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object msg = scanner.nextLine();    

        if (msg instanceof String str){
            if (!str.trim().isEmpty()){
                System.out.println("The variable is not empty, the length is "+str.length());
            }
        }

        // Write your code here
    }
}