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
public class RuneStat 
{
    private int amount;
    private String stat;
    private boolean flat_stat;
    
    public RuneStat(String st, int amt, boolean flat_yon)
    {
        stat = st;
        amount = amt;
        flat_stat = flat_yon;
    }
    
    public String getStat()
    {   return stat;    }
    
    public void setStat(String newStat)
    {   stat = newStat; }
    
    public int getAmount()
    {   return amount;  }
    
    public void setAmount(int newAmount)
    {   amount = newAmount; }
    
    public boolean isFlatStat()
    {   return flat_stat;   }
 
    public String toString()
    {
        String str;
        
        if(flat_stat)
            str = stat + " +" + amount;  
        else
            str = stat + " +" + amount + "%";
        
        return str;
    }
}
