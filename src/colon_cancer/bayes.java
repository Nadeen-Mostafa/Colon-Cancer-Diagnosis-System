/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colon_cancer;
public  class Calculate_Bayes 
{
   Normal n = new Normal();
   Abnormal b = new Abnormal();
   
   public double [] Normal2_X = new double[30];
   public double [] Abnormal2_X = new double[30];
   public double []Total = new double[30];
   public double []B_Normal = new double[30];
   public double []B_Abnormal = new double[30];
   public String []Result = new String[30];
   public Test t = new Test();
    public String [][]test2 = new String[30][201];
    public double [][]test3 = new double[30][201];
    public double counter=0;
    public double accuracy=0;
    public Calculate_Bayes()
    {
        
        n.return_arr();
        Normal2_X=n.Normal_X;
       
        b.return_arr(); 
        Abnormal2_X=b.Abnormal_X;
        
        t.testint();
        test2=t.test;
        
    }
    
    
    public void Prob_X()
    {
        for(int i=0;i<Normal2_X.length;i++)
        {
           Total[i]=Normal2_X[i]+Abnormal2_X[i];
           
        }    
    }
    
    
    public void Calc_Bayes_for_Normal()
    {
        for(int i=0;i<Normal2_X.length;i++)
        {
            B_Normal[i]=Normal2_X[i]/Total[i];
        }
        
        
    }
    
    public void Calc_Bayes_for_Abnormal()
    {
        for(int i=0;i<Abnormal2_X.length;i++)
        {
            B_Abnormal[i]=Abnormal2_X[i]/Total[i];
        }
        
    }
    
    public void compare()
    {
        for(int i=0;i<Abnormal2_X.length;i++)
        {
            if(B_Abnormal[i]>B_Normal[i])
            {
                Result[i]="Abnormal";
                
            }
            else
                Result[i]="Normal";
            
        }
    }
    
    public void accuracy()
    {
        for(int i=0;i<test2.length;i++)
        {
            if(test2[i][201].equals(Result[i]))
                
                counter++;
        }
        accuracy=(counter/test2.length)*100;
        
        System.out.println(accuracy);
    }
    
    
    
    
    
    
    
    
    
}
        
