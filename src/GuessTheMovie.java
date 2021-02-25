
import java.io.File;
import java.util.Random;
import java.util.Scanner;


public class GuessTheMovie {

    public static void main(String [] args ) throws Exception{
        File file=new File ("movies.txt");
        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file);

        int count=0;
        while(scanner.hasNextLine()){
            scanner.nextLine();
            count++;
        }
        System.out.println(count);// wyświetli listę

        String films[] = new String[count];

        count = 0;
        while(scanner2.hasNextLine()){
            String line = scanner2.nextLine();
            films[count] = line;
            count++;
           // System.out.println(line.split("").length); //długość nazw
        }

        Random random= new Random();

        System.out.println(films[random.nextInt(count)]); //długość nazw


    }


}

