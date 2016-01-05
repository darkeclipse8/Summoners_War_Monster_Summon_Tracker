/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWMonterTracker;

/**
 *
 * @author Busairo
 */
public class Monster 
{
    public String name;
    public int level;
    public int grade;
    public int hp;
    public int atk;
    public int def;
    public int spd;
    public int critr;
    public int critdmg;
    public int resistance;
    public int accuracy;
    public RuneTable runes;
    
    public Monster(String n, int l, int g, int h, int a, int d, int s, int cr, int cd, int r, int ac)
    {
        name = n;
        level = l;
        grade = g;
        hp = h;
        atk = a;
        def = d;
        spd = s;
        critr = cr;
        critdmg = cd;
        resistance = r;
        accuracy = ac;
        runes = new RuneTable();
    }
    
    public String getName()
    {   return name;    }
    
    public void setName(String newName)
    {   name = newName; }
    
    public int getLevel()
    {   return level;   }
    
    public void setLevel(int newLevel)
    {   level = newLevel;   }
    
    public int getGrade()
    {   return grade;   }
    
    public void setGrade(int newGrade)
    {   level = newGrade;   }
    
    public int getHP()
    {   return hp;   }
    
    public void setHP(int newHP)
    {   level = newHP;   }
    
    public int getAttack()
    {   return atk;   }
    
    public void setAttak(int newattk)
    {   level = newattk;   }
    
    public int getDefense()
    {   return def; }
    
    public void setDefense(int newDefense)
    {   def = newDefense;   }
    
    public int getSpeed()
    {   return spd; }
    
    public void setSpeed(int newSpeed)
    {   spd = newSpeed; }
    
    public int getCritRate()
    {   return critr;   }
    
    public void setCritRate(int newCritRate)
    {   critr = newCritRate;    }
    
    public int getCritDamage()
    {   return critdmg;   }
    
    public void setCritDamage(int newCritDmg)
    {   critdmg = newCritDmg;   }
    
    public int getResistance()
    {   return resistance;  }
    
    public void setResistance(int newResistance)
    {   resistance = newResistance; }
    
    public int getAccuracy()
    {   return accuracy;    }
    
    public void setAccuracy(int newAccuracy)
    {   accuracy = newAccuracy; }
    
    
}
