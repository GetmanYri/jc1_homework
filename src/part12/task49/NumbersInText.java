package part12.task49;


import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersInText {

    public static void main(String[] args) {
        String nameOfFile = args[0]; //args[0]="text2.txt"
        String text = "A regular expression, 1 specified 2 as a 10 string, must first 15 be compiled into an 10 instance of this class.\n" +
                "The resulting 3 pattern can then be used to create4 a Matcher 20 object 1 that12 can match arbitrary\n" +
                "character sequences 20 against 20 the regular expres55sion.\n" +
                "All of the state 3 involved in 14 performing a match14 re66sides in the m66atcher,\n" +
                "so many matchers 20 can share the 15 same pattern.";

        int sum = 0;
        StringBuilder str = new StringBuilder();
        List<Integer> numbers = new LinkedList<>();
        Pattern pattern = Pattern.compile("(\\d+)");

        File file = new File(nameOfFile);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            Writer writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            while (bufferedReader.ready()) {
                str.append(bufferedReader.readLine()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Matcher matcher = pattern.matcher(str.toString());

        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            numbers.add(num);
            sum += num;
        }
        System.out.println("Numbers in text - " + numbers);
        System.out.println("The sum of the numbers = " + sum + "\n");

        Iterator<Integer> numbersIterator = numbers.iterator();

        while (numbersIterator.hasNext()) {
            int count = 0;
            int i = numbersIterator.next();
            for (Integer num : numbers) {
                if (num == i) {
                    count++;
                }
            }
            if (count <= 1) {
                numbersIterator.remove();
            }
        }
        numbers.sort(Comparator.reverseOrder());

        for (Integer num : numbers) {
            str.delete(str.indexOf(num.toString()), str.indexOf(num.toString()) + num.toString().length());
        }
        System.out.println("Text after removing duplicate numbers: \n" + str);

        try(Writer writer = new FileWriter(file);) {
            writer.write(str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


