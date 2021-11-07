import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner com = new Scanner(System.in);

        String result;
        while (true) {
            try {
                System.out.println("Type in the file name:");
                String command = com.nextLine();
                result = Reader.read(command);
                break;
            } catch (Exception e) {
                System.out.println("Wrong Filename!");
                
            }
        }
        System.out.println(result);
        int counter = 0;
        for (int k = 0; k < result.length(); k++){
            if(counter == 2) {System.out.print(result.charAt(k)); counter = 0;}
            else counter++;

        }


    }
}