/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Alumno
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class trabajito extends JFrame implements ActionListener{
    
    Scanner teclitas = new Scanner(System.in);
    ArrayList<String> fabonH=new ArrayList<String>();

    private int valor1;
    private int valor2;
    private int valor3;    
    
    public int total1=1;
    public String fabb = "";
    
    private int facto;
    private JLabel pediNum, fact, fabon;    
    private JButton calcula;
    private JTextField num;
    
    public trabajito(){
        setTitle("Calculador");
        setLocationRelativeTo(null);
        fondo1 ja = new fondo1();
        setContentPane(ja);
        setLayout(null);
        setBounds(100, 100, 700, 400);       
        
        pediNum = new JLabel("Ingresa el número a calcular");
        pediNum.setBounds(60, 20, 200, 50);
        add(pediNum);
        
        num = new JTextField();
        num.setBounds(300, 40, 150, 30);
        add(num);
        
        calcula = new JButton("Calcular");
        calcula.setBounds(300, 140, 150, 30);
        add(calcula);
        calcula.addActionListener(this);
        
        fact= new JLabel();
        fact.setBounds(460, 20, 200, 50);
        add(fact);
        
        setVisible(true);
    }
    
    public int calcular(){
        int valor = Integer.parseInt(num.getText());
        int facto=0;            
        int fibo=0;       
        for (int i = 1; i < valor+1; i++) {
            total1 *=i;
        }
        
        return total1;
    }
    public String calcc(){
        int valor = Integer.parseInt(num.getText());
        int total2 =0;
        int regla = 0;
        int cad1, cad2;        
        
        do{
            if(regla == 0 || regla == 1){
                fabonH.add(String.valueOf(regla));                
            }else{
                cad1 = Integer.parseInt(fabonH.get(regla-2));
                cad2 = Integer.parseInt(fabonH.get(regla-1));
                total2 = cad1 + cad2;
                fabonH.add(String.valueOf(total2));
            }
            regla ++;
        }while(regla<valor);   
        for (int i = 0; i < fabonH.size(); i++) {
            fabb = fabb + fabonH.get(i) + ", ";
        }
        return fabb;
    }
    public void clean(){
        fabb = " ";
        total1 = 1;
        fabonH.clear();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == calcula){
            calcular();
            calcc();
            JOptionPane.showMessageDialog(null, "Factorial: "+ total1+ "\n FabonH: "+ fabb);
            clean();
        }
    }
    
}
