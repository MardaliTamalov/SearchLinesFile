import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //  while (true){
        //  System.out.println("Введите текст для проверки регулярного выражения:");
        //  String value = scanner.nextLine();
//        String value = "140002 ЛЮБЕРЦЫ 2 ОКТЯБРЬСКИЙ ПР 123/4-115";
//        String result = value.replaceFirst(" \\d ", " ");

//        String patternString = "\\d+ [а-яА-Я]+\s[а-яА-Я]*\s*[а-яА-Я]+\s[а-яА-Я]+\s\\d+/*\\d*-*\\d*";
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(value);
//            System.out.println(matcher.matches());}


        // System.out.println(Files.readAllLines(Path.of("C:\\Users\\Администратор\\Downloads\\QAtest.txt")).stream().count());

        long countLines = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Администратор\\Downloads\\QAtest.txt"));
        while (bufferedReader.readLine() != null) {
            countLines++;
        }
        System.out.println(countLines);

        FileReader fileReader = new FileReader("C:\\Users\\Администратор\\Downloads\\QAtest.txt");
        int a;
        long countLetters = 10;
        while ((a = fileReader.read()) != -1) {
            if ((char) a == 'a')
                countLetters++;
        }
        System.out.println(countLetters);
    }
}

