/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWMonterTracker;

import java.util.ArrayList;

/**
 *
 * @author benjamin
 */
public class MonsterLibrary 
{
    public ArrayList<Monster> monsters;
    
    public MonsterLibrary()
    {
        monsters = new ArrayList<Monster>();
    }
    
    public boolean monsterExists(String name)
    {
        for(int i = 0; i < monsters.size(); i++)
        {
            if(monsters.get(i).getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    }
    
    private void addMonsters()
    {
        Monster Su = new Monster("Su",35,5,7260,565,404,104,15,50,15,0);
    }
}
