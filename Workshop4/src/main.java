import java.util.ArrayList;
import java.util.Scanner;

/**********************************************
 Workshop 4
 Course:<subject type> - JAC444
 Last Name: Prajapati
 First Name:Akashkumar
 ID:129122206
 Section:NEE
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date:03/02/2022
 **********************************************/
/*import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a filename: ");
            String nameOfFile = sc.next();
            FileInputStream in = new FileInputStream(nameOfFile);// binary streams
            char record;
            int info = 26;
            int[] capital = new int[info];
            int[] small = new int[info];
            while (in.available() > 0)
            {
                record = (char) in.read();
                if(record >= 'a' && record <= 'z')
                    small[record-97]++;
                if(record >= 'A' && record <= 'Z')
                    capital[record-65]++;
            }

            for(int i=0; i<26; i++)
            {
                System.out.printf("Number of %c's: %d\n", 65 + i, capital[i]);
                System.out.printf("Number of %c's: %d\n", 97 + i, small[i]);
            }
        }
        catch (IOException e)
        {
            System.out.println("Given file name is not found in the system");
            e.printStackTrace();
        }
    }
}*/

/*import java.util.*;

public class main {
    /** Main method */
  /*  public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Store 50 states and their capitals
        Map<String, String> statesAndCapitals = getData();

        // Prompt the user to enter a state
        System.out.print("Enter a state: ");
        String state = input.nextLine();

        // Display the capital for the state
        if (statesAndCapitals.get(state) != null) {
            System.out.println("The capital of " + state + " is "
                    + statesAndCapitals.get(state));
        }
    }

    // Method getData stores the 50 states and their capitals in a map
    public static Map<String, String> getData() {
        Map<String, String> map = new HashMap<>();
        String[][] data = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};

        for (int i = 0; i < data.length; i++) {
            map.put(data[i][0], data[i][1]);
        }

        return map;
    }
}*/

import java.util.*;
/*import java.io.*;

public class main {
    // Main method
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);

        System.out.print("Enter the year: ");
        String year = out.nextLine();
        System.out.print("Enter the gender: ");
        String gender = out.nextLine();
        System.out.print("Enter the name: ");
        String nameOfBaby = out.nextLine();
        String rank;
        rank = ranked(year, nameOfBaby, gender);

        if(rank == null)
        {
            System.out.println("In year" + year + ", name of the baby " + nameOfBaby + " is not ranked");
        }
        else {
            System.out.println(nameOfBaby + " is ranked #" + rank + " in year " + year);
        }

    }

    // Returns the index for the corresponding gender
    public static int gender(String gender) {
        if (gender.equals("M"))
            return 1;
        else
            return 3;
    }

    public static String ranked(String year, String nameOfBaby, String gender) {
        ArrayList<String> arrayName = new ArrayList<>();
        String num = null;
        try
        {
            String fileLocation = "babynamesranking" + year + ".txt";
            Scanner in = new Scanner(new File(fileLocation));


            while (in.hasNext()) {
                for (int i = 0; i < 5; i++)
                {
                    arrayName.add(i, in.next());
                }

                if (arrayName.get(gender(gender)).equals(nameOfBaby))
                {
                    num = arrayName.get(0);
                    return num;
                }
                arrayName.clear();
            }
        }
        catch (java.io.IOException ex)
        {
            System.out.println("File did not find in the system");
        }
        return num;
    }
}*/

public class main {

        public static final ArrayProcessor maximumValue = arrayName -> {
            double maximum = arrayName[0];
            for (int i = 0; i < arrayName.length; i++) {
                if (arrayName[i] > maximum)
                    maximum = arrayName[i];
            }
            return maximum;
        };

        public static final ArrayProcessor minimumValue = arrayName -> {
            double minimum = arrayName[0];
            for (int i = 0; i < arrayName.length; i++) {
                if (arrayName[i] < minimum)
                    minimum = arrayName[i];
            }
            return minimum;
        };

        public static final ArrayProcessor sumValue = arrayName -> {
            double sum = 0;
            for (int i = 0; i < arrayName.length; i++) {
                sum = sum + arrayName[i];
            }
            return sum;
        };

        public static final ArrayProcessor averageValue =
                arrayName -> sumValue.apply(arrayName) / arrayName.length;

        public static ArrayProcessor countValue(double value) {
            return arrayName -> {
                int count = 0;
                for (int i = 0; i < arrayName.length; i++) {
                    if (arrayName[i] == value)
                        count++;
                }
                return count;
            };
        }

        public static void main(String[] args) {

            double[] array1 = {11, 21, 45, 74, 3, 52, 41, 65, 46, 46, 46, 21, 11, 21};

            System.out.printf("Maximum value in the array: "
                    + maximumValue.apply(array1));
            System.out.printf("\nMinimum value in the array: "
                    + minimumValue.apply(array1));
            System.out.printf("\nSum of the values in the array: "
                    + sumValue.apply(array1));
            System.out.printf("\nAverage of the values in the array: "
                    + averageValue.apply(array1));
            System.out.printf("\nNumber of times the value 46 occurred in the array is: "
                    + countValue(46.0).apply(array1));

        }

}
