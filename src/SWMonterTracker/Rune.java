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
public class Rune 
{
    private String type_of_rune = "";
    private String rarity = "Normal";
    private int times_upgraded = 0;
    private int rune_number;
    private int grade = 1;
    private final int maxStats = 6;
    private ArrayList<RuneStat> stats;
    
    public Rune(String type,int rn)
    {
        times_upgraded = 0;
        type_of_rune = type;
        rune_number = rn;
        stats = new ArrayList<RuneStat>(maxStats);
    }
    
    public String getRarity()
    {   return rarity;  }
    
    public int getGrade()
    {   return grade;   }
    
    public void setGrade(int newGrade)
    {   grade = newGrade;   }
    
    public int getRuneNumber()
    {   return rune_number; }
    
    public void setRuneNumber(int new_rune_number)
    {   rune_number = new_rune_number;  }
    
    public String getType()
    {   return type_of_rune;    }
    
    public void setTypeOfRune(String new_type)
    {   type_of_rune = new_type;    }
    
    public ArrayList<RuneStat> getRuneStats()
    {   return stats;   }
    
    public void addStat(RuneStat rs)
    {   stats.add(rs);  }
    
    public void addStat(String stat, int amount, boolean FoN)
    {
        RuneStat s = new RuneStat(stat, amount, FoN);
        stats.add(s);
    }
    
    public void addStat(int stat_num, RuneStat rs)
    {   stats.set(stat_num, rs);    }
    
    public void addStat(int stat_num, String stat, int amount, boolean FoN)
    {
        RuneStat s = new RuneStat(stat,amount,FoN);
        stats.set(stat_num, s);
    }
    
    public void replaceStat(int stat_num, RuneStat rs)
    {   stats.set(stat_num,rs); }
    
    public void replaceStat(int stat_num, String stat, int amount, boolean FoN)
    {
        RuneStat s = new RuneStat(stat, amount, FoN);
        stats.set(stat_num, s);
    }
    
    public void removeStat(int stat_num)
    {   stats.remove(stat_num); }
    
    public void upgradeRune()
    {   
        times_upgraded++;   
        if(times_upgraded == 3)
            rarity = "Magic";
        else if(times_upgraded == 6)
            rarity = "Rare";
        else if(times_upgraded == 9)
            rarity = "Hero";
        else if(times_upgraded == 12)
            rarity = "Legendary";
    }
    
    
    public String toString()
    {
        String rune_stats = "";
        if(times_upgraded == 0)
            rune_stats = grade + " Star\n" + type_of_rune +"(" + rune_number + ")" + " - " + rarity + "\n";
        else
            rune_stats = grade + " Star\n" + "+" + times_upgraded + " " + type_of_rune +"(" + rune_number + ")" + " - " + rarity + "\n";
        for(int i = 0; i < stats.size(); i++)
        {   
            String getStat = stats.get(i).toString();
            rune_stats = rune_stats.concat(getStat + "\n");
        }    
        return rune_stats;
    }
}
