import java.util.Scanner;

public class WasteManagement {

    // 3c) Method to calculate total waste from two collection points
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // 3a) Data Types - Store and display vehicle details
        // ==========================================
        System.out.println("--- 3a) Vehicle Details ---");
        int vehicleNumber = 1001;            // Integer
        double wasteCollected = 125.5;        // Decimal (double)
        int collectionPoints = 8;             // Integer
        char vehicleStatus = 'A';             // Character ('A' for Active)

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println();

        // ==========================================
        // 3b) If-Else Condition - Check waste collection status
        // ==========================================
        System.out.println("--- 3b) Collection Status Check ---");
        System.out.print("Enter waste collected in kg: ");
        double inputWaste = scanner.nextDouble();

        if (inputWaste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
        System.out.println();

        // ==========================================
        // 3c) Methods - Calculate total waste using a method
        // ==========================================
        System.out.println("--- 3c) Total Waste Calculation (Method Call) ---");
        System.out.print("Enter waste collected at Point 1 (kg): ");
        double point1Waste = scanner.nextDouble();

        System.out.print("Enter waste collected at Point 2 (kg): ");
        double point2Waste = scanner.nextDouble();

        // Calling the method
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total Waste Collected from both points: " + totalWaste + " kg");

        scanner.close();
    }
}