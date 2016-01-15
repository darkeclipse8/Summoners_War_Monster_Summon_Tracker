/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWMonterTracker;

import java.util.ArrayList;

/**
 *
 * @author Busairo
 */

public class RuneTable 
{
    final int maxRunes = 6;
    int NumOfRunes;
    final public ArrayList<Rune> runes;
    
    public RuneTable()
    {
        runes = new ArrayList<Rune>(maxRunes);
        NumOfRunes = 0;
    }
    
    public RuneTable(int num_of_runes)
    {
        runes = new ArrayList<Rune>(maxRunes);
        NumOfRunes = num_of_runes;
    }
    
    public void addRune(Rune r)
    {
        runes.add(r);
        NumOfRunes++;
    }
    
    public void addRune(int slot, Rune r)
    {
        runes.set(slot, r);
        NumOfRunes++;
    }
    
    public void removeRune(int slot)
    {   runes.remove(slot); }
    
    public Rune getRune(int slot)
    {   return runes.get(slot); }
    
    public int getNumOfRunes()
    {   return NumOfRunes;  }
    
    public String toString()
    {
        String tr = "";
        for(int i = 0; i < runes.size(); i++)
        {   tr.concat(runes.get(i).toString() + "\n");  }
        
        return tr;
    }
}
