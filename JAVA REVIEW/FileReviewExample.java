import java.util.Scanner;
import java.io.*;

public class FileReviewExample {
    private Scanner keyboard = new Scanner(System.in);

    public void introduction() {
        System.out.println("Do you have an existing file? [Yes/No]");
        String fileAsk = keyboard.nextLine();
        if (fileAsk.toLowerCase().equals("yes")) {
            System.out.println("Enter in a path to file : ");
            String path = keyboard.nextLine();
            path = path.replace("\\", "\\\\");
            this.accessFile(path);
        } else if (fileAsk.toLowerCase().equals("no")) {
            System.out.println("Please enter directory path: ");
            String path = keyboard.nextLine();
            path = path.replace("\\", "\\\\");
            System.out.println("Please enter what you want to name the file: ");
            String fileName = keyboard.nextLine();
            this.createFileFromScratch(path, fileName);
        }

    }

    public void createFileFromScratch(String path, String fileName) {
        try {
            File file = new File(path + "\\" + fileName + ".txt");
            file.createNewFile();
            String operationAsk = "";
            while (!(operationAsk.toLowerCase().equals("close"))) {
                System.out.println("What would you like to do to the file?");
                System.out.println("[Print to screen] [Print to new file] [Write] [Close] [Delete]");
                operationAsk = keyboard.nextLine();
                if (operationAsk.toLowerCase().equals("write")) {
                    this.write(file);
                } else if (operationAsk.toLowerCase().equals("print to screen")) {
                    this.printToScreen(file);
                } else if (operationAsk.toLowerCase().equals("delete")) {
                    this.deleteFile(file);
                } else if (operationAsk.toLowerCase().equals("print to new file")) {
                    this.report(file);
                }
            }

        } catch (FileNotFoundException s) {
            System.out.println("File does Not Exist Please Try Again: ");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void accessFile(String path) {
        /*
         * try {
         * File file = new File(path);
         * String operationAsk = "";
         * while (!(operationAsk.toLowerCase().equals("close"))) {
         * System.out.println("What would you like to do to the file?");
         * System.out.
         * println("[Print to screen] [Print to new file] [Write] [Close] [Delete]");
         * operationAsk = keyboard.nextLine();
         * if (operationAsk.toLowerCase().equals("write")) {
         * this.write(file);
         * } else if (operationAsk.toLowerCase().equals("print")) {
         * this.printToScreen(file);
         * } else if (operationAsk.toLowerCase().equals("delete")) {
         * this.deleteFile(file);
         * } else if (operationAsk.toLowerCase().equals("report")) {
         * this.report(file);
         * }
         * }
         * } catch (FileNotFoundException s) {
         * System.out.println("File does Not Exist Please Try Again: ");
         * } catch (IOException e) {
         * System.out.println(e.toString());
         * }
         */
    }

    public void write(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String prevText = "";
            while ((br.readLine()) != null) {
                prevText = prevText + "\n" + br.readLine();
            }
            br.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            System.out.println("Go ahead and start typing: ");
            writer.append(keyboard.nextLine());
            writer.close();
        } catch (FileNotFoundException s) {
            System.out.println("File does Not Exist Please Try Again: ");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void printToScreen(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();
        } catch (FileNotFoundException s) {
            System.out.println("File does Not Exist Please Try Again: ");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void report(File file) {

    }

    public void deleteFile(File file) {
        file.delete();
    }

    public static void main(String[] args) {
        FileReviewExample fileRev = new FileReviewExample();
        fileRev.introduction();
        System.out.println("Ba-Bye!");

    }
}
