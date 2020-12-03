import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class ListListener implements MouseListener
{





private JList<String> listColor;
private JPanel panAfficheColor;
private Map<String,Color> keyColor = new HashMap<>();

public ListListener(JList couleur,JPanel affichage,Map keyColor)
{
	this.listColor = couleur;
	this.panAfficheColor = affichage;
	this.keyColor = keyColor;


}



@Override
public void mouseClicked(MouseEvent e)
{
				System.out.println(listColor.getSelectedValue());
                panAfficheColor.setBackground(keyColor.get(listColor.getSelectedValue()));
                panAfficheColor.repaint();

}

@Override
public void mousePressed(MouseEvent e){}

@Override
public void mouseExited(MouseEvent e){}

@Override
public void mouseEntered(MouseEvent e){}

@Override
public void mouseReleased(MouseEvent e){}




}