/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWMonterTracker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Busairo
 */
public class SWMTGui 
{
    public JFrame SWFrame;
    public JPanel MonsterPanel;
    public JPanel MonsterSelectionPanel;
    public JPanel MonsterIconPanel;
    public JLabel MIPIcon1;
    public JLabel MIPIcon2;
    public JPanel MonsterStatsPanel;
    public JPanel MonsterRunesPanel;
    public JTextArea MSPTextArea;
    private JList listOfMonsters;
    final private String monsters[];
    private BufferedImage unawakened_image;
    private BufferedImage awakened_image;
    
    public SWMTGui()
    {
        monsters = new String[]{"Su", "Hwa", "Pang", "Ran", "Yen","Hwahee","Chloe",
        "Carrack","Sigmarus","Orochi","Darius","Belladeon","Bernard", "Lanett", "Delphoi"
        ,"Luers","Jean"};
        unawakened_image = null;
        awakened_image = null;
        SWFrame = new JFrame("Summoners War Monster Tracker");
        MonsterPanel = new JPanel();
        createMonsterSelectionPanel();
        createMonsterStatsPanel();
        createMonsterRunesPanel();
        createMonsterIconPanel();
        MonsterPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        MonsterPanel.add(MonsterSelectionPanel);
        MonsterPanel.add(MonsterIconPanel);
        MonsterPanel.add(MonsterStatsPanel);
        MonsterPanel.add(MonsterRunesPanel);
        SWFrame.setSize(600,600);
        SWFrame.add(MonsterPanel);
        SWFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SWFrame.setResizable(false);
        SWFrame.setVisible(true);
    }
    
    final public void createMonsterSelectionPanel()
    {
        MonsterSelectionPanel = new JPanel();
        listOfMonsters = new JList(monsters);
        listOfMonsters.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listOfMonsters.setLayoutOrientation(JList.VERTICAL);
        listOfMonsters.setVisibleRowCount(-1);
        listOfMonsters.addListSelectionListener( new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String unawakened = "Monster Icons/" + listOfMonsters.getSelectedValue() + "_Unawakened.jpg" ;
                String awakened = "Monster Icons/" + listOfMonsters.getSelectedValue() + ".jpg"; 
                try {
                    setImages(unawakened, awakened);
                } catch (IOException ex) {
                   System.out.println("Can't find path: " + unawakened);
                   System.out.println("Can't find path: " + awakened);
                }
            }});
        JScrollPane LOMlistScroller = new JScrollPane(listOfMonsters);
        LOMlistScroller.setPreferredSize(new Dimension(80, 250));
        MonsterSelectionPanel.add(LOMlistScroller);
        MonsterSelectionPanel.setPreferredSize(new Dimension(80,250));
        MonsterSelectionPanel.setBackground(Color.BLACK);
    }
    
    final public void createMonsterIconPanel()
    {
        MonsterIconPanel = new JPanel();
        MonsterIconPanel.setBackground(Color.GRAY);
        MonsterIconPanel.setPreferredSize(new Dimension(505,250));
        MIPIcon1 = new JLabel(new ImageIcon(""));
        MIPIcon2 = new JLabel(new ImageIcon(""));
        MIPIcon1.setPreferredSize(new Dimension(150,250));
        MIPIcon2.setPreferredSize(new Dimension(150,250));
        MonsterIconPanel.add(MIPIcon1);
        MonsterIconPanel.add(MIPIcon2);
    }
    
    final public void createMonsterStatsPanel()
    {
        MonsterStatsPanel = new JPanel();
        MonsterStatsPanel.setBackground(Color.BLUE);
        MonsterStatsPanel.setPreferredSize(new Dimension(293,315));
    }
    
    final public void createMonsterRunesPanel()
    {
        MonsterRunesPanel = new JPanel();
        MonsterRunesPanel.setBackground(Color.GREEN);
        MonsterRunesPanel.setPreferredSize(new Dimension(293,315));
    }
    
    public void setImages(String i1path, String i2path) throws IOException
    {
        unawakened_image = ImageIO.read(new File(i1path));
        awakened_image = ImageIO.read(new File(i2path));
        ImageIcon uni = new ImageIcon(unawakened_image); 
        ImageIcon awi = new ImageIcon(awakened_image);
        MIPIcon1.setIcon(uni);
        MIPIcon2.setIcon(awi);

      
    }
}
