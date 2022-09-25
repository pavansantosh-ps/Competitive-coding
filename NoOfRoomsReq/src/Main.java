import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of guests");
        int n = sc.nextInt();
        int ArrivalTime[] = new int[n];
        int BurstTime[] = new int[n];

        System.out.println("Enter the arrival times of each guests");
        for(int i = 0;i < n;i++){
            ArrivalTime[i] = sc.nextInt();
        }
        System.out.println("Enter the  Duration of each guests");
        for(int i = 0;i < n;i++){
            BurstTime[i] = sc.nextInt();
        }
        System.out.println("No of rooms required : "+ noOfRooms(ArrivalTime,BurstTime,n));

        sc.close();
    }

    static int MAX = 100001;

    private static int noOfRooms(int[] arrivalTime, int[] burstTime, int n) {
        int sumArray[] = new int[MAX];
        for (int i = 0; i < n; i++){
            sumArray[arrivalTime[i]]++;
            sumArray[arrivalTime[i] + burstTime[i]]--;
        }
        int rooms = sumArray[0];
        for (int i = 1; i < MAX; i++){
            sumArray[i] += sumArray[i - 1];
            rooms = Math.max(rooms, sumArray[i]);
        }
        return rooms;
    }
}
