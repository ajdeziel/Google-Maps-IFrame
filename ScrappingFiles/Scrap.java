import java.util.*;
import java.io.*;
import java.util.regex.*;

public class Scrap{


    public static String ReadFile(String name){
        Scanner console;
        File file;
        PrintStream output;
        String out="";
        try{
            console = new Scanner(file = new File(name));
            output = new PrintStream("locations.txt");
        }catch(FileNotFoundException fnfe){
            System.out.println("file not found");
            return "";
        }

        console.useDelimiter("\\);");
        Pattern pat = Pattern.compile(".*\\{lat: (.*), lng: (.*)\\}.*icon: (.*(\\w)\\..*'),.*title: (.*').*", Pattern.DOTALL);
        Scanner stripString;
        while(console.hasNext()){
            String str = console.next();
            stripString = new Scanner(str);
            Matcher m = pat.matcher(str);
            if(!m.find()){
                System.out.println("Error with data at " + str);
                continue;
            }
            out = out + "\n\t\t\t\t{\n\t\t\t\t\t\"lat\" : \'"+m.group(1)+"\'"+",\n\t\t\t\t\t\"lng\" : \'"+m.group(2) + "\',\n\t\t\t\t\t\"icon\" : "+m.group(3) + ",\n\t\t\t\t\t\"image\" : "+"\'IMAGES/"+m.group(4)+".png\'" + ",\n\t\t\t\t\t\"title\" : "+m.group(5) +"\n\t\t\t\t},";
               
            
        }
            output.print(out);
            return out;

    }


}
