package Day08;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Use a HashMap to track the highest runs scored against each country
        Map<String, Integer> countryScores = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter Data");without this program does not accept

        
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break; // Stop reading on empty line

            String[] parts = line.split(":");
            if (parts.length != 2) {
                System.out.println("Invalid input format. Expected format: Country: Runs");
                continue;
            }

            String country = parts[0].trim();
            int runs;
            try {
                runs = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid runs value. Skipping entry.");
                continue; // to ignore invalid number
            }

          
            countryScores.put(country, Math.max(countryScores.getOrDefault(country, 0), runs));
        }

        
        int noCenturiesCount = 0;
        for (int score : countryScores.values()) {
            if (score < 100) {
                noCenturiesCount++;
            }
        }

        //to print the Output
        System.out.println("Number of countries with no centuries: " + noCenturiesCount);

        sc.close(); // Close the resource
    }
}