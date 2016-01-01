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
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

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
    public JPanel MonsterStatsPanel;
    public JPanel MonsterRunesPanel;
    public JTextArea MSPTextArea;
    private JList listOfMonsters;
    final private String monsters[];
    
    public SWMTGui()
    {
        monsters = new String[]{"Su", "Hwa", "Pang", "Ran", "Yen","Hwahee","Chloe",
        "Carrack","Sigmarus","Orochi","Darius","Belladeon","Bernard", "Lanett", "Delphoi"
        ,"Luers","Jean"};
        SWFrame = new JFrame("Summoners War Monster Tracker");
        MonsterPanel = new JPanel();
        MonsterPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        MonsterSelectionPanel = new JPanel();
        MonsterIconPanel = new JPanel();
        MonsterStatsPanel = new JPanel();
        MonsterRunesPanel = new JPanel();
        listOfMonsters = new JList(monsters);
        listOfMonsters.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listOfMonsters.setLayoutOrientation(JList.VERTICAL);
        listOfMonsters.setVisibleRowCount(-1);
        JScrollPane LOMlistScroller = new JScrollPane(listOfMonsters);
        LOMlistScroller.setPreferredSize(new Dimension(80, 250));
        MonsterSelectionPanel.add(LOMlistScroller);
        MonsterSelectionPanel.setPreferredSize(new Dimension(80,250));
        MonsterSelectionPanel.setBackground(Color.BLACK);
        MonsterIconPanel.setBackground(Color.GRAY);
        MonsterIconPanel.setPreferredSize(new Dimension(505,250));
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
}
