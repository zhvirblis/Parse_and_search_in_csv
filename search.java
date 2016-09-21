import java.util.ArrayList;
import java.util.List;

/**
 * Created by Destr on 19.09.2016.
 */
public class search {

    public static String search(ArrayList<String[]> ale, String author) {
        char forsearcauthor[] = author.toCharArray();
        for(int j=0;j<ale.size();j++) {
            boolean f_society=false;
            for(int i=0;i<forsearcauthor.length;i++){
                f_society = forsearcauthor[i] == ale.get(j)[0].split(" ")[0].replace("[", "").replace(",", "").replace(".","").toCharArray()[i];
                if(!f_society) break;
            }
            if(f_society)
            {
                String out="";
                for(int i=0;i<ale.get(j).length;i++){
                    out+=ale.get(j)[i]+" ";
                }
                System.out.println(out);
            }
        }
        return "";
    }
}

