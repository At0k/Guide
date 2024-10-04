import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class FileProcessor{

    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output.txt");
            String str = "";
            int i;
            while((i = fr.read()) != -1){
                str += (char)i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();

            System.out.println("File reading and writing both done");
        }

        catch (IOException e){
            System.out.println(" There are some IOException");
        }
    }
}

    //--------------------------------------------------------------------
    // public static void main(String[] args) throws IOException {
        
    //     FileReader aFile = new FileReader("input.txt");
    //     BufferedReader br =  new BufferedReader(aFile);
    //     StringTokenizer st = new StringTokenizer(" ");

    //     String line = br.readLine();

    //     while (line != null){
    //         String word = st.nextToken();
    //         line = br.readLine();
    //     }

    //     br.close;

    //     System.out.println("This file contains " + counter + "integers");

        //------------------------------------------------------------------
        // int[] array = new int[40];
        // int i = 0;
        // File file = new File("input.txt");
        // if (file.exists()){
        //     Scanner input = new Scanner(file);
        //     System.out.println("File found");

        //     while (input.hasNext() && i < args.length) {
        //         array [i] =  input.nextInt();
        //         i++;           
        //     }
        //     input.close();

        //     for (int l : array){
        //         System.out.println(array[l]);
        //     }
        // }
        // else
        // {
        //     System.out.println("File not found");
        // }
        //----------------------------------------------------------------
        // //Block of code to try
        // try{
        // FileReader file = new FileReader("input.txt");
        // }
        // //Code to handle exception must be inside catch
        // //block
        // catch (Exception exp){

        //     System.out.println("Error occured" + exp.getMessage());
        // }

        // finally{

        //     System.out.println("Finally");
        // }
    //}

