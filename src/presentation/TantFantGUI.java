package presentation;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.lang.Thread;
import java.io.*;
import java.io.ObjectInputFilter.Config;
import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TantFantGUI extends JFrame {

	 private JMenuItem nuevo;
	    private JMenuItem abrir;
	    private JMenuItem salvar;
	    private JMenuItem salir;
	    private JMenuBar menuBar;
	    private JMenu menu;
	    private JFileChooser selecArchivo;
	    private JButton btnCargar;
	    private JButton btnReglas;
	    private JButton btnCargar_1;
	    private JLabel lbl1;
	    private JLabel lbl2;
	    
	    public TantFantGUI(){
	        prepareElements();
	        prepareActions();

	    }

	    public void prepareElements(){
	        this.setTitle("Tant Fant");

	        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	        int height = pantalla.height;
	        int width = pantalla.width;
	        setSize(width/2, height/2);
	        setLocationRelativeTo(null);

	        prepareElementsMain();
	        prepareElementosChooser();

	    }



	    private void prepareActions(){
	        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
	        addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent ev) {
	                exit();
	            }
	        });
	        prepareActionsMain();
	    }
	    
	    private void SetImagelabel(JLabel labelName, String root) {
	    	ImageIcon image =new ImageIcon(root);
	    	Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
	    	labelName.setIcon(icon);
	    	this.repaint();
	    }
	    
	    private void prepareElementsMain(){
	        menuBar = new JMenuBar();
	        menuBar.setBackground(Color.CYAN);
	        setJMenuBar(menuBar);
	        menu = new JMenu("Main");
	        nuevo = new JMenuItem("New");
	        abrir = new JMenuItem("Open");
	        salvar = new JMenuItem("Save");
	        salir = new JMenuItem("Exit");

	        menu.add(nuevo);
	        menu.add(abrir);
	        menu.add(salvar);
	        menu.add(salir);

	        menuBar.add(menu);
	        getContentPane().setLayout(null);
	        
	        JButton btnJugar = new JButton("Jugar");
	        btnJugar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Tablero newframe = new Tablero();
	        		newframe.setVisible(true);
	        		dispose();//elimina la ventana anterior
	        	}
	        });
	        btnJugar.setFont(new Font("Calisto MT", Font.PLAIN, 30));
	        btnJugar.setBackground(new Color(139, 69, 19));
	        btnJugar.setBounds(132, 115, 127, 51);
	        getContentPane().add(btnJugar);
	        
	        btnCargar = new JButton("Cargar");
	        btnCargar.setFont(new Font("Calisto MT", Font.PLAIN, 30));
	        btnCargar.setBackground(new Color(139, 69, 19));
	        btnCargar.setBounds(132, 177, 127, 51);
	        getContentPane().add(btnCargar);
	        
	        btnReglas = new JButton("Reglas");
	        btnReglas.setFont(new Font("Calisto MT", Font.PLAIN, 30));
	        btnReglas.setBackground(new Color(139, 69, 19));
	        btnReglas.setBounds(132, 239, 127, 51);
	        getContentPane().add(btnReglas);
	        
	        btnCargar_1 = new JButton("Salir");
	        btnCargar_1.setFont(new Font("Calisto MT", Font.PLAIN, 30));
	        btnCargar_1.setBackground(new Color(139, 69, 19));
	        btnCargar_1.setBounds(132, 301, 127, 51);
	        getContentPane().add(btnCargar_1);
	        
	        lbl1 = new JLabel("");
	        lbl1.setBounds(404, 149, 439, 255);
	        getContentPane().add(lbl1);
	        
	        lbl2 = new JLabel("");
	        lbl2.setBounds(429, 45, 450, 450);
	        getContentPane().add(lbl2);
	        
	        
	        
	        this.setLocationRelativeTo(this);
	        SetImagelabel(lbl1,"src\\presentation\\Diseño.png" );
	        //SetImagelabel(lbl2,"D:\\Documents\\POOB\\LAB 5\\tantFant\\src\\presentation\\Diseño.png" );
	        

	        prepareActionsMain();

	    }
	    

	    private void prepareActionsMain(){
	        salir.addActionListener(e -> exit());
	        abrir.addActionListener(e -> open());
	        salvar.addActionListener(e -> save());

	    }
	    

	    private void exit() {
	        if (JOptionPane.showConfirmDialog(rootPane, "Esta seguro que desea salir?",
	                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
	            System.exit(0);
	        }
	    }
	    private void open(){
	        selecArchivo.setVisible(true);
	        int action = selecArchivo.showOpenDialog(abrir);
	        if (action == JFileChooser.APPROVE_OPTION) {
	            File archivo = selecArchivo.getSelectedFile();
	            JOptionPane.showMessageDialog(abrir,"El archivo de nombre "+archivo.getName()+" que se trata de abrir en la ruta "+archivo+"\n NO se pudo abrir ya que esta funcion se encuentra en construccion.");
	        }
	        selecArchivo.setVisible(false);
	    }

	    private void save(){
	        selecArchivo.setVisible(true);
	        int action = selecArchivo.showSaveDialog(salvar);
	        if(action == JFileChooser.APPROVE_OPTION){
	            File archivo = selecArchivo.getSelectedFile();
	            JOptionPane.showMessageDialog(abrir,"El archivo de nombre "+archivo.getName()+" que se trata de guardar en la ruta "+archivo+"\n NO se pudo guardar ya que esta funcion se encuentra en construccion.");
	        }
	        selecArchivo.setVisible(false);
	    }

	    private void prepareElementosChooser() {
	        selecArchivo = new JFileChooser();
	    }

	    public static void main(String [] args){
	        TantFantGUI gui = new TantFantGUI();
	        gui.setVisible(true);
	    }
	    
	  
	    
	    
	}
