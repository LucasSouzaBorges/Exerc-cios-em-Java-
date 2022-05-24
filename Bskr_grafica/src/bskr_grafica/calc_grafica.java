package bskr_grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Lucas Borges 2°DS
 */
public class calc_grafica extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, exibir, exibir_2, exibir_3;
    JTextField texto1, texto2, texto3, texto4, texto5;
    JButton calcular, Limpar;
    
    public calc_grafica(){
        super("Calculo Bhaskara");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("Valor de 'a'");
        rotulo2 = new JLabel("Valor de 'b'");
        rotulo3 = new JLabel("Valor de 'c'");
        rotulo4 = new JLabel("x'");
        rotulo5 = new JLabel("x''");
        exibir = new JLabel("");
        exibir_2 = new JLabel("");
        exibir_3 = new JLabel("");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        calcular = new JButton("Calcular");
        Limpar = new JButton("Limpar");
        
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50, 60, 100, 20);
        rotulo3.setBounds(50, 100, 100, 20);
        
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);
        texto3.setBounds(120, 100, 200, 20);
        exibir.setBounds(50, 180, 300, 20);
        exibir_2.setBounds(50,220,300,20);
        exibir_3.setBounds(50,260,300,20);
        
        
        
        calcular.setBounds(400, 20, 100, 20);
        Limpar.setBounds(400, 60, 80, 20);
        
        calcular.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                int a, b, c;
                double x1, x2, delta;
                delta = 0;
                a = Integer.parseInt(texto1.getText());
                b = Integer.parseInt(texto2.getText());
                c = Integer.parseInt(texto3.getText());
                
                delta = (b * b) + (-4 * (a * c)); 
                
                x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
                x2 =((-(b) - Math.sqrt(delta)) / 2 * a);
                exibir.setVisible(true);
                exibir.setText("Delta = " +delta);
                exibir_2.setText("x1 = " +x1);
                exibir_3.setText("x2 = " +x2);
                }
            }
        );
        Limpar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                texto1.setText(null);
                texto2.setText(null);
                texto3.setText(null);
                exibir.setText(null);
                exibir_2.setText(null);
                exibir_3.setText(null);
                texto1.requestFocus();
                }
            }
        );
        exibir.setVisible(false);
        
        tela.add(rotulo1); tela.add(rotulo2); 
        tela.add(rotulo3);  tela.add(exibir); tela.add(exibir_2); tela.add(exibir_3); 
        tela.add(texto1); tela.add(texto2);
        tela.add(texto3); 
        tela.add(Limpar); tela.add(calcular);
        
        setSize(720, 400);
        setVisible(true);
    }
}
