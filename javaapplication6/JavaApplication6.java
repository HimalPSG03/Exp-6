/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
public class JavaApplication6
{
    public static void main(String args[]) throws ScoreException
    {
        Scanner sc = new Scanner(System.in);
        int studentId[] = { 100, 200, 300, 400, 500 };
        int scores[] = new int[5];
        int score = 0;
        for(int i = 0;i<studentId.length; i++)
    {
    try
    {
        System.out.print("Enter a numeric test score for the student"+(i+1)+" of Id "+studentId[i]+" : ");
        score = sc.nextInt();
        if(score < 0 || score > 100)
        {
            scores[i] = 0;
            throw new ScoreException();  
        }
        else
        {
            scores[i]=score;
        }
    }
    catch(ScoreException ex)
    {
        System.out.println("\n"+ex.getMessage()+"\n");
    }
    }
        System.out.println("\n\nStudent Id \t Score ");
        for(int i = 0; i < studentId.length; i++)
        {
            System.out.println(studentId[i]+"\t\t"+scores[i]);
        }
    }
public class ScoreException extends Exception
{
    public ScoreException(String msg)
    {
        super(msg);
    }
}
}
    
}
