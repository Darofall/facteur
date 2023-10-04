package com.daro.facteurs;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int nbre) {

        List<Integer> facteurs = new ArrayList<Integer>();


        /*if (nbre > 1) {
            facteurs.add(nbre);
        }

        return facteurs;
        if (nbre < 3) {
            return facteurs;
        }*/
        if (nbre <=3 && nbre>1) {
            facteurs.add(nbre);

        }
        else {
            int divisor = 2;
            while (nbre > 1) {

                if (nbre % divisor == 0) {
                    facteurs.add(divisor);
                    nbre /= divisor;
                } else {
                    divisor++;
                }
            }
        }
        return facteurs;




    }
}




