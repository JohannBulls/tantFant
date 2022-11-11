package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Tablero extends JFrame {
	
	public Tablero(){
		this.setTitle("Tant Fant");

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width/2, height/2);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JLabel Player1 = new JLabel("Jugador 1");
        Player1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Player1.setBounds(48, 67, 137, 49);
        getContentPane().add(Player1);
        
        JLabel Player2 = new JLabel("Jugador 2");
        Player2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Player2.setBounds(752, 67, 137, 49);
        getContentPane().add(Player2);
        
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.textHighlight);//Color tablero
        panel.setBounds(234, 22, 450, 450);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JButton Salir_1 = new JButton("X");
        Salir_1.setBounds(64, 72, 91, 43);
        panel.add(Salir_1);
        Salir_1.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        
        JButton Salir_1_1 = new JButton("X");
        Salir_1_1.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        Salir_1_1.setBounds(190, 72, 91, 43);
        panel.add(Salir_1_1);
        
        JButton Salir_1_1_1 = new JButton("X");
        Salir_1_1_1.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        Salir_1_1_1.setBounds(319, 72, 91, 43);
        panel.add(Salir_1_1_1);
        
        JButton Salir_1_2 = new JButton(" ");
        Salir_1_2.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        Salir_1_2.setBounds(64, 179, 91, 43);
        panel.add(Salir_1_2);
        
        JButton Salir_1_3 = new JButton(" ");
        Salir_1_3.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        Salir_1_3.setBounds(190, 179, 91, 43);
        panel.add(Salir_1_3);
        
        JButton Salir_1_4 = new JButton(" ");
        Salir_1_4.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        Salir_1_4.setBounds(319, 179, 91, 43);
        panel.add(Salir_1_4);
        
        JButton Salir_1_5 = new JButton("O");
        Salir_1_5.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        Salir_1_5.setBounds(64, 301, 91, 43);
        panel.add(Salir_1_5);
        
        JButton Salir_1_6 = new JButton("O");
        Salir_1_6.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        Salir_1_6.setBounds(190, 301, 91, 43);
        panel.add(Salir_1_6);
        
        JButton Salir_1_7 = new JButton("O");
        Salir_1_7.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        Salir_1_7.setBounds(319, 301, 91, 43);
        panel.add(Salir_1_7);
        
        JButton Salir = new JButton("Salir");
        Salir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		TantFantGUI newframw1 = new TantFantGUI();
        		newframw1.setVisible(true);
        		dispose();//elimina la ventana anterior
        	}
        });
        Salir.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        Salir.setBounds(48, 386, 127, 51);
        getContentPane().add(Salir);
        
        JButton btnRefresh = new JButton("Refresh");
        btnRefresh.setFont(new Font("Calisto MT", Font.PLAIN, 30));
        btnRefresh.setBounds(747, 386, 157, 51);
        getContentPane().add(btnRefresh);
		
	}
	
	 public static void main(String [] args){
		 Tablero tab = new Tablero();
	        tab.setVisible(true);
	    }
}
