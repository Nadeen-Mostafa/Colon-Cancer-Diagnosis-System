 
package colon_cancer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class TraningAndTesting 
{
     public ArrayList<String> training=new ArrayList<String>(); 
     public ArrayList<String> testing =new ArrayList<String>(); 
     public ArrayList<String> list =new ArrayList<String>();
     public dataset dataset;
     
     
    public TraningAndTesting() throws FileNotFoundException, IOException 
    {
        
         String FileName="colon Cancer Dataset (1).CSV";
    File file=new File(FileName);
        Scanner input=new Scanner(file);
          BufferedReader br = new BufferedReader(new FileReader("colon Cancer Dataset (1).CSV"));
      
    String line = " ";
    br.readLine();
    while((line=br.readLine())!=null)
    {
        list.add(line);
    }
    }
    /*public void display()
    {
        for(int x=0;x<training.size();x++)
      {
            System.out.println(training.get(x));
      }
   
    }*/
     public void trainset() throws IOException
    {
        String FileName="colon Cancer Dataset (1).CSV";
    File file=new File(FileName);
        Scanner input=new Scanner(file);
        
       
      while (input.hasNext())
      {    
          String data=input.next();
                 
        list.add(data);
      }    
      
      System.out.println(list.size());
      int i;
      for( i=0;i<=33;i++)
      {
              training.add(list.get(i));
            
      }
      for(int x=0;x<training.size();x++)
      {
            System.out.println(training.get(x));
      }
      
    /* String[][] array = new String[training.size()][];
    for (int k = 0; k < training.size(); k++)
    {
    ArrayList<String> row = training.get(k);
    
    array[i] = row.toArray(new String[row.size()]);   
    }
      String[][] array2D = new String[training.size()][];
      for (int k = 0; k < array2D.length; k++)
      {    
          String[] row = training.get(k); 
          array2D[k] = row;
      }*/
    }
    public void getTraining() 
    {
        for(int i=0;i<32;i++)
        {
            training.add(list.get(i));
        }
            try {
		File file = new File("training.csv");
        
		if(!file.exists()) 
                {
 		file.createNewFile();	
		}		
		PrintWriter pw = new PrintWriter(file);
                for(int i=0;i<training.size();i++)
                {
		pw.println(training.get(i));
                }
		pw.close();
		System.out.println("Done");
		} 
                  catch (IOException e) 
                  {	
	            e.printStackTrace();
		  }
	}
    //testing set 
public void creat_input_file()
{
    
    ArrayList<String>inputdata=new ArrayList<String>();
    for(int i=32;i<62;i++)
  {
      inputdata.add(list.get(i));
  }
   try {
		File file = new File("inputdata.csv");
        
		if(!file.exists()) 
                {
 		file.createNewFile();	
		}		
		PrintWriter pw = new PrintWriter(file);
                for(int i=0;i<inputdata.size();i++)
                {
		pw.println(inputdata.get(i));
                }
		pw.close();
		System.out.println("");
		} 
                  catch (IOException e) 
                  {	
	            e.printStackTrace();
		  } 
}
}