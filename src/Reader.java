import java.io.File;
import java.util.Scanner;
public class Reader {

    public static String read(String fileName) throws Exception {

            File curFile = new File (fileName);
            Scanner rdr = new Scanner(curFile);
            StringBuilder sb = new StringBuilder();
            while(rdr.hasNext()) {
                sb.append(rdr.next());
            }
            rdr.close();
            String outString = sb.toString();
            return outString;


        }

    }