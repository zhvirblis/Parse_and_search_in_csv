import java.io.*;
import java .util.ArrayList;


/**
 * Created by Destr on 16.09.2016.
 */
public class main {
    public static void main(String[] args) throws IOException {
        //Здесь был Юрец
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("E:\\parselib.csv");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String author;
        String line;
        ArrayList<String[]> Lines = new ArrayList<String[]>();
        while ((line = fin.readLine()) != null)
            Lines.add(line.split(";"));
        author = br.readLine();
        PrintStream outrus  = new PrintStream(System.out, false, "Cp866");
        outrus.println(search.search(Lines,author));

    }
}
