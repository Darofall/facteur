package com.daro.facteurs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {
    private List<Integer> expectedFacteurs;
    private List<Integer> actualFacteurs;

    private PrimeFactors primeFactors;

    @BeforeEach
    void montage(){
        expectedFacteurs = new ArrayList<Integer>();
        actualFacteurs = new ArrayList<Integer>();
    }
    @Test
    public void generate_1_devrait_produire_la_liste_vide() {
        // GIVEN


        // WHEN
        actualFacteurs = primeFactors.generate(1);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
        System.out.println(PrimeFactors.generate(1));

    }


    @Test
    public void generate_2_devrait_produire_la_liste_2() {
        // GIVEN
        expectedFacteurs.add(2);

        // WHEN
        actualFacteurs = PrimeFactors.generate(2);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
        System.out.println(PrimeFactors.generate(2));

    }


    @Test
    public void generate_3_devrait_produire_la_liste_3() {
        // GIVEN
        expectedFacteurs.add(3);

        // WHEN
        actualFacteurs = PrimeFactors.generate(3);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
        System.out.println(PrimeFactors.generate(3));
    }


    @Test
    public void generate_4_devrait_produire_la_liste_4() {
        // GIVEN
        ArrayList<Integer> expectedFacteurs= new ArrayList<Integer>(Arrays.asList(2,2));

        // WHEN
        actualFacteurs = PrimeFactors.generate(4);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
        System.out.println(PrimeFactors.generate(4));

    }

   @Test
    public void generate_6_devrait_produire_la_liste_6() {
        // GIVEN

 ArrayList<Integer> expectedFacteurs= new ArrayList<Integer>(Arrays.asList(2,3));
        // WHEN
        actualFacteurs = PrimeFactors.generate(6);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
        System.out.println(PrimeFactors.generate(6));
    }

   @Test
    public void generate_8_devrait_produire_la_liste_8() {
        // GIVEN
         ArrayList<Integer> expectedFacteurs= new ArrayList<Integer>(Arrays.asList(2,2,2));

        // WHEN
        actualFacteurs = PrimeFactors.generate(8);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
        System.out.println(PrimeFactors.generate(8));
    }
    @Test
    public void generate_9_devrait_produire_la_liste_9() {
        // GIVEN
       ArrayList<Integer> expectedFacteurs= new ArrayList<Integer>(Arrays.asList(3,3));

        // WHEN
        actualFacteurs = PrimeFactors.generate(9);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
        System.out.println(PrimeFactors.generate(9));
    }


}
