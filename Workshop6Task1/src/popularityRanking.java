import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class popularityRanking {
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
        catch (IOException ex)
        {
            System.out.println("File did not find in the system");
        }
        return num;
    }


}
