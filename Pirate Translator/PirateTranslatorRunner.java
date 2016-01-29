import java.util.Scanner;
/**
 * Write a description of class PirateTranslatorRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PirateTranslatorRunner
{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println();
//       String input = in.nextLine();
//        PirateString ps = new PirateString(input);
//        
//        System.out.print(ps.equals("hello"));
//   
//    }
     
    public static void TranslatePirateToEnglish(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Pirate phrase to translate:");
        String input = in.nextLine();
        PirateString ps = new PirateString(input);
        System.out.println("Phrase translated to English:");
        System.out.println(ps.translate().phrase);
    }
    
    public static void TranslateEnglishToPirate(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter English phrase to translate:");
        String input = in.nextLine();
        EnglishString es = new EnglishString(input);
        System.out.println("Phrase translated to Pirate:");
        System.out.println(es.translate().phrase);
    }
    
    public static void CheckEquality(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter and English and a Pirate phrase to check if they are equal.");
        System.out.print("phrase 1: ");
        String input1 = in.nextLine();
        System.out.print("phrase 2: ");
        String input2 = in.nextLine();
        PirateString ps1 = new PirateString(input1);
        EnglishString es1 = new EnglishString(input1);
        PirateString ps2 = new PirateString(input2);
        EnglishString es2 = new EnglishString(input2);
        if (ps1.equals(ps2) || es1.equals(es2))
            System.out.println("The two phrases are equal.");
        else
            System.out.println("The two phrases are not equal.");
        
    }
}
