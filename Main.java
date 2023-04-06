import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        File file = new File("filename.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){   
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        file.delete();
        
        


        
    }
}