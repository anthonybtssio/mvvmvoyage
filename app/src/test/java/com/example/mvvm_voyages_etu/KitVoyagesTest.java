package com.example.mvvm_voyages_etu;

import static org.junit.Assert.assertEquals;

import com.example.mvvm_voyages_etu.data.model.KitVoyage;
import com.example.mvvm_voyages_etu.data.model.OptionVoyage;
import org.junit.Test;

public class KitVoyagesTest {

    @Test
    public void ajouterOption_et_prix_total() {
        // 1️⃣ Préparation : création d’un KitVoyage
        KitVoyage kit = new KitVoyage("Paris", "Londres");

        // 2️⃣ Création d’options
        OptionVoyage hotel = new OptionVoyage("Hotel", 200);
        OptionVoyage avion = new OptionVoyage("Avion", 300);

        // 3️⃣ Action : on ajoute les options au kit
        kit.ajouterOption(hotel);
        kit.ajouterOption(avion);

        // 4️⃣ Vérification : assertions pour contrôler que le test fonctionne
        assertEquals(500, kit.prix(), 0.01); // prix total = 200 + 300
        assertEquals(2, kit.getLesOptions().size()); // il y a bien 2 options dans la liste
    }
}
