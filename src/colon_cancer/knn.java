/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colon_cancer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

 public class knn {
   
    protected double sum1=0;
    protected double sum2=0;
    protected double total=0;
    private static double counter=0;
    public double inputdata[][];

 
    public knn() {
        inputdata=new double[30][203];
    }

    public static double getCounter() {
        return counter;
    }

    public static void setCounter(double counter) {
        knn.counter = counter;
    }

    public final double getSum1() {
        return sum1;
    }

    public  double getSum2() {
        return sum2;
    }

    public double getTotal() {
        return total;
    }

    public double[][] getInputdata() {
        return inputdata;
    }

    public final void setSum1(double sum1) {
        this.sum1 = sum1;
    }

    public void setSum2(double sum2) {
        this.sum2 = sum2;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setInputdata(double[][] inputdata) {
        this.inputdata = inputdata;
    }

    
    public final void calc_distance() throws FileNotFoundException, IOException
    {
        Vector<String> v = new Vector <String>();
        double result=0;
        //double counter=0.0;
        double accuracy=0.0;
        //training set
        double[][]arr=new double[32][203];
	String [][] data = new String [32][203];     
        File file = new File("training.csv");
        int row = 0;   int col = 0;
        
        BufferedReader bufRdr  = new BufferedReader(new FileReader(file));
        String line=null;
     
        //read each line of text file
        while((line = bufRdr.readLine()) != null && row < 32)
        {   
            StringTokenizer st = new StringTokenizer(line,",");
        while (st.hasMoreTokens())
        {
            //get next token and store it in the array
            data[row][col] = st.nextToken();
            col++;
            
        }
           col = 0;
           row++;
        }
       
        
        for (int i = 0; i < 32; i++)
         {
            for (int j = 0; j < 203 ; j++)
            {
                //add data to vector
              v.add(data[i][j]);
            }
         }
       /* String str1="Abnormal";
        for (int i = 0; i < 32; i++) {
           // System.out.println(arr[i][202]);
            if(arr[i][203]==1)
            {
                data[i][202]="0";
            }
            else
                data[i][202]="1";
        }*/
        //System.out.println(v);
          /* for(int y=0;y<v.size();y++)
             
           {
               for (int i = 0; i < 32; i++) {
               arr[i][y]=Double.parseDouble(v.get(y));
               //System.out.println(arr[i][y]);
           }
           }*/
        
       /* for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 203; j++) {
                System.out.println(arr[i][j]);
            }
        }*/   
      String str="Abnormal";
        for (int i = 0; i < 32; i++) {
           // System.out.println(arr[i][202]);
            if(data[i][202].equals(str))
            {
                data[i][202]="0";
            }
            else
                data[i][202]="1";
        }
           double maximum_distance=1000000000.0;
           int current_row=0;
           //input data from testing set
           String input[][]=inputdata();
           
           for (int k = 0; k < 30; k++) {
           for(int i=0;i<32;i++)
           {
               
               for (int j = 0; j < 203; j++) {
               sum1+=arr[i][j];
               sum2+=inputdata[k][j];
               }
                total = Math.pow((sum1-sum2),2.0);   
                result=Math.sqrt(total);
                if(result>maximum_distance)
                {
                    maximum_distance=result;
                    current_row=i;
                    
                }
            }
           
            if(input[k][202]==data[current_row][202])
            {
      
                counter++;
            }
           }
    
            System.out.println("the accuracy of knn classifier is");   
           accuracy=(counter/30)*100;
           System.out.println(accuracy);
           }

    public String[][] inputdata () throws FileNotFoundException, IOException
    {
        
        ArrayList<String>v2=new ArrayList<String>();
        
        String [][] data = new String [30][203];     
        File file = new File("inputdata.csv");
        int row = 0;   int col = 0;
        
        BufferedReader bufRdr  = new BufferedReader(new FileReader(file));
        String line=null;
    
        //read each line of text file
        while((line = bufRdr.readLine()) != null && row < 30)
        {   
            //System.out.println(line);
            StringTokenizer st = new StringTokenizer(line,",");
        while (st.hasMoreTokens())
        {
            //get next token and store it in the array
            data[row][col] = st.nextToken();
            col++;
            //System.out.println(data[row][col]);
        }
           col = 0;
           row++;
        }
        String str="Abnormal";
        for (int i = 0; i < 30; i++) {
            //System.out.println(data[i][202]);
            if(data[i][202].equals(str))
            {
                data[i][202]="0";
            }
            else
                data[i][202]="1";
            
        }
        /*
        for (int i = 0; i < 30; i++)
         {
            for (int j = 0; j < 203 ; j++)
            {
                // put data in the array list
                v2.add(data[i][j]);
                //System.out.print(data[i][j]);
                //break;
            }
        }
       // System.out.println(v2.size());
        //System.out.println(inputdata.length);
                //columns
                for (int j = 0,i=-1; j < v2.size(); j++) {
                    //check if the row was ended
                    if(j%202==0)
                {
                    //if true create new row
                    i++;
                }
                    //converting strings to double
                // inputdata[i][j]=data[i][j];
                    data[i][j]=Double.parseDouble(v2.get(j));
                    //double test[i][j]=Double.longBitsToDouble(inputdata[i][j]);
                }*/
         for (int i = 0; i < 1; i++)
         {
            for (int j = 1; j < 203 ; j++)
            {
              v2.add(data[i][j]);
            }
         }
           for(int y=0;y<v2.size();y++)
           {
               for (int i = 0; i < 30; i++) {
               inputdata[i][y]=Double.parseDouble(v2.get(y));
               //System.out.println(arr[i][y]);
           }
           }
   
         return data;
    
    
}
}