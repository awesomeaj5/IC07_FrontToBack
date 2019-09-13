package edu.miracosta.cs112.aort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("Input.txt"));
            PrintWriter outFile = new PrintWriter("output.txt");
            String line, reverse;
            String[] words;
            while(inFile.hasNextLine())
            {

                line = inFile.nextLine();
                words = line.split(" ");
                for(int i = 1; i< words.length; i++)
                {
                    outFile.print(words[i] + " ");

                }
                outFile.println(words[0]);
                System.out.println(line);
                outFile.println(line);
            }
            inFile.close();
            outFile.close();
        }catch(FileNotFoundException e){
            System.err.println("File cannot be found");

        }
    }
}
