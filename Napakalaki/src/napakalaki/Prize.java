/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Administrador
 */
public class Prize {
    private int treasures, levels;
    
    Prize(int tesoros, int niveles){
        treasures   = tesoros;
        levels      = niveles;
    }
    int getTreasures(){
        return treasures;
    }
    int getLevels(){
        return levels;
    }
    
    
    
}
