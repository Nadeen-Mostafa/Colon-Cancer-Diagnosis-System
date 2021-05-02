/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colon_cancer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nadeen
 */
 public class dataset {
    ArrayList<String> List=new ArrayList<String>();
    public dataset() throws FileNotFoundException, IOException
    {
        String FileName="colon Cancer Dataset (1).CSV";
    File file=new File(FileName);
        Scanner input=new Scanner(file);
       
      while (input.hasNext())
      {    
          String data=input.next();
                 
        List.add(data);
      }
    }
    public ArrayList<String> data() 
            
    {
        return List;
    }
    
    public  void normal()throws FileNotFoundException, IOException 
    {
        
    };
    public  void Apnormal()throws FileNotFoundException, IOException
    {
        
    };
}
