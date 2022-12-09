package com.company.entities;

import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocation;

/**
 * Hlavní interface pro vytváření dalších entit
 * @author Me
 * @version 0.1a
 * @since Java 16
 */
public interface Entity {

    /**
     * Metoda pro boj
     */
    void fight();
    /**
     * Metoda pro obranu
     */
    void defend();
    /**
     * Metoda pro úhyb
     */
    void dodge();
    /**
     * Metoda pro vzdání
     */
    void escape();
    /**
     * Metoda pro léčení
     * @param potion potion, kterým se vyléčíš
     */
    void heal(Potion potion);
    /**
     * Metoda pro jezení
     * @param food jídlo, které můžeš sníst
     */
    void eat(Food food);
    /**
     * Metoda pro pohyb
     * @param gameLocation dostupná lokace
     */
    void moveTo(GameLocation gameLocation);
    /**
     * Metoda pro mluvení
     * @param entity entita, se kterou se dá komunikovat
     */
    void talkTo (Entity entity);


}
