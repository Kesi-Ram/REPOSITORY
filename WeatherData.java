//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
public class WeatherData{
    public static void main(String[] args) {
        double[][] temperatures = {
            // City 1
            {18.5}, // Day 1
            {17.2}, // Day 2
            {18.0}, // Day 3
            {19.5}, // Day 4
            {20.2}, // Day 5
            {21.0}, // Day 6
            {18.3}, // Day 7

            // City 2
            {15.2}, // Day 1
            {16.1}, // Day 2
            {15.9}, // Day 3
            {16.3}, // Day 4
            {17.0}, // Day 5
            {18.5}, // Day 6
            {17.8}, // Day 7

            // City 3
            {20.5}, // Day 1
            {21.2}, // Day 2
            {20.0}, // Day 3
            {21.7}, // Day 4
            {22.5}, // Day 5
            {23.0}, // Day 6
            {22.2}  // Day 7
        };
        String[] cities = {"Baguio", "Urdaneta", "Dagupan"};

        // Display temperature data for each city
        for (int city = 0; city < cities.length; city++) {
            System.out.println("\nTemperature Data for " + cities[city] + ":");
            //display each day
            for (int day = 0; day < 7; day++) {
                System.out.print("\nDay " + (day + 1) + ": ");
                //display temperatures
                for (int time = 0; time < temperatures[0].length; time++) {
                    System.out.print(temperatures[city * 7 + day][time] + " ");
                }
            }
            System.out.println();
        }
        //calculations
        for (int city = 0; city < cities.length; city++) {
            double weeklyTotal = 0;
            int count = 0;
            double highestValue = Double.MIN_VALUE; // Start with the lowest possible value
            double lowestValue = Double.MAX_VALUE; // Start with the highest possible value

            for (int day = 0; day < 7; day++) {
                for (int time = 0; time < temperatures[0].length; time++) {
                    double temp = temperatures[city * 7 + day][time];
                    weeklyTotal += temp;
                    count++;

                    // Update highest and lowest values
                    if (temp > highestValue) {
                        highestValue = temp;
                    }
                    if (temp < lowestValue) {
                        lowestValue = temp;
                    }
                }
            }
            double weeklyAverage = weeklyTotal / count;
            System.out.printf("Weekly Average Temperature for %s: %.2f\n", cities[city], weeklyAverage);
            System.out.println("highest temperature in " + cities[city] + ": " + highestValue);
            System.out.println("lowest temperature in " + cities[city] + ": " + lowestValue + "\n");
        }

    }
}


        
    
