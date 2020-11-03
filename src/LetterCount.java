import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LetterCount {


    /*
            Given one String
            Get an each char from String return the count of the each char

            For Example

            String = aabbbcccc

            return should be a , 2
                             b , 3
                             c , 4

            Note: There could be any char in the String.

     */


    /*

            Girdiğiniz String parametresinin herbir karakterinin(char) sayısını
            döndüren charCount methodunu yazın


            Örnek:

            String = aabbbcccc

            return     a , 2     olmalı
                       b , 3
                       c , 4

            Not: Stringde herhangi bir char olabilir.

     */


    public LinkedHashMap<Character, Integer> charCount(String myStr){

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        String[] strDizi= myStr.split("");

        int sayac;

        for (int i = 0; i <strDizi.length ; i++) {
            sayac=0;

            for (int j = 0; j <strDizi.length ; j++) {

                if(strDizi[i].contains(strDizi[j]))
                     sayac++;

            }
            result.put(strDizi[i].charAt(0),sayac);

        }


        return  result;
    }


}









