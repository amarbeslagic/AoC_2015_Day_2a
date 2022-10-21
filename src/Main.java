import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_2a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfStrings.add(s);
        }

        int wrappingPaper = 0;

        for (String g : listOfStrings){
            String [] stringList;

            stringList = g.split("x");

            int l = parseInt(stringList[0]);
            int w = parseInt(stringList[1]);
            int h = parseInt(stringList[2]);

            int sizeOfOneBox = 2*l*w + 2*l*h + 2*w*h;

            if(l >= w && l >= h)
                sizeOfOneBox += w*h;
            else if(w >= l && w >= h)
                sizeOfOneBox += l*h;
            else if(h >= l && h >= w)
                sizeOfOneBox += l*w;

            wrappingPaper += sizeOfOneBox;
        }
        System.out.println(wrappingPaper);
    }
}