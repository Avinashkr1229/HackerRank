package practise;

public class DeliveryRouteOptimizer {
    public static int findPosition(int[] distances) {
        int totalDistance = 0;
        for (int distance : distances) {
            totalDistance += distance;
        }

        int leftSum = 0;
        for (int i = 0; i < distances.length; i++) {
            totalDistance -= distances[i];
            if (leftSum == totalDistance) {
                // 1-based index
                return i + 1;
            }
            leftSum += distances[i];
        }

        // No optimal position found
        return -1;
    }

    public static void main(String[] args) {
        int[] distances = {1, 2, 3, 4, 5, 6};
        int optimalPosition = findPosition(distances);

        if (optimalPosition != -1) {
            System.out.println("Optimal position: " + optimalPosition);
        } else {
            System.out.println("No optimal position found.");
        }
    }
}
