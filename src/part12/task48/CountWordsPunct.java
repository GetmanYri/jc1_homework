package part12.task48;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsPunct {
    public static void main(String[] args) {

        String fileName = args[0];  //args[0]="text.txt"
        String text = "A regular expression, specified as a string, must first be compiled into an instance of this class.\n" +
                "The resulting pattern can then be used to create a Matcher object that can match arbitrary\n" +
                "character sequences against the regular expression.\n" +
                "All of the state involved in performing a match resides in the matcher,\n" +
                "so many matchers can share the same pattern.";
        int countOfWords = 0;
        int countOfPunct = 0;

        Pattern pWords = Pattern.compile("\\w+");
        Pattern pPunct = Pattern.compile("\\p{Punct}");

        File file=new File(fileName);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            Writer writer = new FileWriter(file);
            writer.write(text);
            writer.close();

            while (bufferedReader.ready()) {
                String s = bufferedReader.readLine();
                System.out.println(s);

                Matcher mWord = pWords.matcher(s);
                while (mWord.find()) {
                    countOfWords++;
                }
                Matcher mPunct = pPunct.matcher(s);
                while (mPunct.find()) {
                    countOfPunct++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nCount of words = " + countOfWords);
        System.out.println("Count of punctuation marks = " + countOfPunct);
    }
}
