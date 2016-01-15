/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWMonterTracker;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Busairo
 */
public class SWMonterTracker {

    /**
     * @param args the command line arguments
     */
    
    public static void SOP(String s)
    {   System.out.println(s);  }
    
    public static void main(String[] args) throws MalformedURLException, IOException {
        /*
        Monster Su = new Monster("Su",40,6, 9885,769,549,104,56,150,40,12);
        SOP("Name: " + Su.getName());
        SOP("Level: " + Su.getLevel());
        SOP("Grade: " + Su.getGrade());
        SOP("HP: " + Su.getHP());
        SOP("Attack: " + Su.getAttack());
        SOP("Defense: " + Su.getDefense());
        SOP("Speed: " + Su.getSpeed());
        SOP("Critical Rate: " + Su.getCritRate() + "%");
        SOP("Critical Damage: " + Su.getCritDamage() + "%");
        SOP("Resistance: " + Su.getResistance() + "%");
        SOP("Accuracy: " + Su.getAccuracy() + "%");
        */
        
       SWMTGui swmtgui = new SWMTGui();
        /*RuneStat rs1 = new RuneStat("ATK",10,false);
        RuneStat rs2 = new RuneStat("DEF",9,false);
        RuneStat rs3 = new RuneStat("RES",17,false);
        RuneStat rs4 = new RuneStat("ATK",8,false);
        RuneStat rs5 = new RuneStat("DEF",5,false);
        RuneStat rs6 = new RuneStat("RES",3,false);
        
        Rune rune1 = new Rune("Energy", 1);
        rune1.addStat(rs1);
        rune1.addStat(rs2);
        rune1.addStat(rs3);
        rune1.addStat(rs4);
        rune1.addStat(rs5);
        rune1.addStat(rs6);
        
        System.out.println("Rune 1: \n" + rune1.toString());
        
        RuneStat replacerStat = new RuneStat("CRITD", 20, false);
        
        rune1.replaceStat(1, replacerStat);
        
        System.out.println("After replacing a stat.....the 2nd stat...");
        System.out.println("Rune 1: \n" + rune1.toString());
        
        rune1.removeStat(2);
        
        System.out.println("After removing a stat..the 3rd stat...\n" + rune1.toString());
        
        System.out.println("Testing upgrading runes...stats for test will not be affected ");
        
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        rune1.upgradeRune();
        
        rune1.setGrade(6);
        
        System.out.println("After testing upgrade rune..... should be now be +12 before type and legendary....and surprise make it a 6 star\n" + rune1.toString());*/
        
        
        /* 
        
        //code to pull pictures 
        
        URL url = new URL("http://vignette1.wikia.nocookie.net/summoners-war-sky-arena/images/9/96/Su_Icon.png/revision/latest?cb=20141213074909");
        InputStream in = new BufferedInputStream(url.openStream());
        OutputStream out = new BufferedOutputStream(new FileOutputStream("Su.jpg"));

        for ( int i; (i = in.read()) != -1; ) {
            out.write(i);
        }
        in.close();
        out.close();
        
        */
        
    }
    
}
