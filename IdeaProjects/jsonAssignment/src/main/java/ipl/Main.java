package ipl;

public class Main {
    public static void main(String[] args) {
        try {
            String iplJsonInput="C:\\Users\\Irshad\\IdeaProjects\\jsonAssignment\\src\\main\\java\\ipl\\ipl.json";
            String iplCsvInput ="C:\\Users\\Irshad\\IdeaProjects\\jsonAssignment\\src\\main\\java\\ipl\\ipl.csv";
            String censoredCsvOuput="C:\\Users\\Irshad\\IdeaProjects\\jsonAssignment\\src\\main\\java\\ipl\\censoredData.csv";
            String censoredJsonOutput="C:\\Users\\Irshad\\IdeaProjects\\jsonAssignment\\src\\main\\java\\ipl\\censoredData.json";
            JSONProcessor.processJSON(iplJsonInput, censoredJsonOutput);
            CSVProcessor.processCSV(iplCsvInput,censoredCsvOuput);
            System.out.println("Censorship completed. Output files generated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
