/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colon_cancer;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 *
 * @author Nadeen
 */
public  class Colon_cancer {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws java.io.FileNotFoundException, IOException{
        // TODO code application logic here
        
        
        knn n=new knn();
        n.calc_distance();
        
        
        }
    }
        