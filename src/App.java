import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner com = new Scanner(System.in);

        String result = "";
        String fromFile;
        while (true) {
            try {
                System.out.println("Type in the file name:");
                String command = com.nextLine();
                fromFile = Reader.read(command);
                break;
            } catch (Exception e) {
                System.out.println("Wrong Filename!");

            }
        }
        System.out.println(fromFile);

        for (int k = 2; k < fromFile.length(); k+=3){
            result += fromFile.charAt(k);



        }
        System.out.print(result);


    }
}