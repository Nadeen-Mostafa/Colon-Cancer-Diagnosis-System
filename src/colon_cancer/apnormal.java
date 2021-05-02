package colon_cancer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

  public class apnormal extends dataset 
{   
   public apnormal() throws FileNotFoundException, IOException
    {
        super();
    }
    public void Apnormal()throws FileNotFoundException, IOException
    {
        String FileName="colon Cancer Dataset (1).CSV";
           List<String> cases = Arrays.asList("Abnormal");
        Stream<String> lines = Files.lines(Paths.get("colon Cancer Dataset (1).CSV"));

        //loop through stream line by line, pick up those that match
        List<String> readCases = lines.filter(line -> containsAll(line, cases)).collect(Collectors.toList());

        lines.close();
        System.out.println("The APNORMAL IS **********");
        for(int i=0;i<readCases.size();i++)
        {
            System.out.println(readCases.get(i));
        }
      }
    public boolean containsAll(String line, List<String> cases) {
        for (String s : cases) {
            if (line.contains(s)) {
                return true;
            }
        }
        return false;
    }
 }