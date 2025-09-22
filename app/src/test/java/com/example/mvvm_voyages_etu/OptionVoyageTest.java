package com.example.mvvm_voyages_etu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.mvvm_voyages_etu.data.model.OptionVoyage;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class OptionVoyageTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void optionVoyageprixNonReduit() {
        OptionVoyage option = new OptionVoyage("null", 10.0);
        assertEquals(5.0, option.getPrix(), 0.001);
    }

}

//exemple de test :
// import static org.junit.Assert.assertEquals;
// import org.junit.Test;
// public class SourisTest {
// @Test
// public void vieillirShouldIncreaseMouseAgeFromFiveToSixMonths() {
// Souris s1 = new Souris(50, "blanche", 5);
// s1.vieillir();
// assertEquals(6, s1.getAge());
// }
// }
