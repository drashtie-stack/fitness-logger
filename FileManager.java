import java.io.*;

class FileManager {

    static void saveData(String data) {
        try {
            FileWriter fw = new FileWriter("fitness.txt", true);
            fw.write(data + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

    static void readData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("fitness.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}