/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rawancalculator;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Staff
 */
public class gradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ed = new Scanner(System.in);
String name;
int marks, javaScore, mathScore, webTechScore, cnScore, seScore;/* int missed t cappital*/
double avg;
System.out.print("Enter name of Student = ");
name = ed.next();
System.out.println("Now, Number Out of 100 in following subject :- ");
System.out.print("Java : ");
javaScore = ed.nextInt();
 if (javaScore >= 100){

            System.out.print("you entered invalid value");

            System.exit(1);        

        }        

        else if (javaScore <= 0){

            System.out.print("you entered invalid value");

            System.exit(1);

        }


System.out.print("Maths : ");
mathScore = ed.nextInt();
System.out.print("Web Technologies : ");
webTechScore = ed.nextInt();
System.out.print("Computer Network : ");
cnScore = ed.nextInt();
System.out.print("Software Engineering : "); /* this is error mised ".print"*/
seScore = ed.nextInt();
marks = javaScore + mathScore + cnScore + seScore + webTechScore;
avg = ((double) marks) / 500; /* this is error mised ";" */
System.out.println("Name = " + name);
System.out.println("total marks " + marks);
if (avg > 0.8 && avg <= 1) /* there is error of mised " )"*/
{
System.out.println("Grade = A");
}
else if (avg > 0.6 && avg <= 0.8) {
System.out.println("Grade = B"); /* error the code mised";"*/}
else if (avg > 0.3 && avg <= 0.6)
{
System.out.println("Grade = C");
}
else if (avg >= 0 && avg <= 0.3) {/*The code missedthe closed by “)”*/
System.out.println("Grade = D");
}
}

    }
