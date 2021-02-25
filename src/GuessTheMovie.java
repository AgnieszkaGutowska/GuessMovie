
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
        String cinema=films[random.nextInt(count)];
        //System.out.println(films[random.nextInt(count)]); //długość nazw
        System.out.println(cinema);
        char[] cinemaArray = cinema.toCharArray();
        System.out.println(cinemaArray);

        System.out.println("System wybrał tytuł filmu: ");
        String zmiana = cinema.replaceAll("[a-z]","_");
        char[] zmianaArray = zmiana.toCharArray();
        System.out.println( "Spróbuj zgadnąć:  ");

        Scanner scanner1 = new Scanner(System.in);
        for (int i=10; i>0; i--){
            System.out.println("Masz " + i + " prób." );
          String guess = scanner1.nextLine();
          int a = cinema.indexOf(guess);
               // System.out.println(a);

                    if(a==-1){
                        System.out.println("brak");
                    }
                    else {
                       System.out.println(a);
                       zmianaArray[a]=guess.charAt(0);
                       System.out.println(zmianaArray);
                    }

        }









    }


}

