package CollegeAssignment;

import java.util.Scanner;

public class PersonalityNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Date of Birth: ");
        String dob = sc.nextLine();

        int sum = 0;

       
        for (int i = 0; i < dob.length(); i++) {
            char ch = dob.charAt(i);

            if (Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }

        
        while (sum > 9) {
            int temp = 0;

            while (sum > 0) {
                temp += sum % 10;
                sum = sum / 10;
            }

            sum = temp;
        }

        System.out.println("Your Personality Number is: " + sum);

        
        switch (sum) {
            case 1:
                System.out.println("Personality Type: The Leader");
                break;
            case 2:
                System.out.println("Personality Type: The Peacemaker");
                break;
            case 3:
                System.out.println("Personality Type: The Creative Communicator");
                break;
            case 4:
                System.out.println("Personality Type: The Builder");
                break;
            case 5:
                System.out.println("Personality Type: The Free Soul");
                break;
            case 6:
                System.out.println("Personality Type: The Nurturer");
                break;
            case 7:
                System.out.println("Personality Type: The Seeker");
                break;
            case 8:
                System.out.println("Personality Type: The Powerhouse");
                break;
            case 9:
                System.out.println("Personality Type: The Humanitarian");
                break;
        }

        sc.close();
    
}
}
