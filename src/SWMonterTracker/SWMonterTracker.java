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
        
       // SWMTGui swmtgui = new SWMTGui();
        RuneStat rs = new RuneStat("ATK",10,false);
        System.out.println(rs.toString());
        
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
