package pl.sda.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Parser0
{
    private Path file = Paths.get("ceesfal.csv");
    public void readFile() throws IOException
    {
        List<String> data = Files.readAllLines(file);
      //  System.out.println(data);
      //  String convertData = new String(data);
//        String[] dataArray = convertData.split("\\r");
        int i=0;
        RealEstate[] realEstates = new RealEstate[data.size()];
        for(String s: data)
        {
            String[] tab = s.split(",");
            realEstates[i] = new RealEstate(tab[0],tab[1],Integer.valueOf(tab[2]), tab[3],
                    Integer.valueOf(tab[4]), Integer.valueOf(tab[5]),Integer.valueOf(tab[6]),
                    tab[7], tab[8], Integer.valueOf(tab[9]),Double.valueOf(tab[10]),Double.valueOf(tab[11]));
            i++;
        }
        System.out.println(realEstates[7]);

      /*  int i=0;
        RealEstate[] realEstates = new RealEstate[dataArray.length];
           for(String s :
                dataArray)
        {
            String[] tab = s.split(",");        //teraz masz w tablicy tablica 12 elementow do skonstruowania realEstate
            //System.out.println(tablica[1]); //wiec zamiast tego konstruuj RealEstate'y
            realEstates[i] = new RealEstate(tab[0],tab[1],Integer.valueOf(tab[2]), tab[3],
                    Integer.valueOf(tab[4]), Integer.valueOf(tab[5]),Integer.valueOf(tab[6]),
                    tab[7], tab[8], Integer.valueOf(tab[9]),Double.valueOf(tab[10]),Double.valueOf(tab[11]));
            i++;
        }*/
        System.out.println();
    }
}
