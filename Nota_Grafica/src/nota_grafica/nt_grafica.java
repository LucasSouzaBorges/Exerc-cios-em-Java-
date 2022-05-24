package nota_grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Lucas Borges 2°DS
 */
public class nt_grafica extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, exibir;
    JTextField texto1, texto2, texto3, texto4;
    JButton calcular, Limpar;
    
    public nt_grafica(){
        super("Calculo Média");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("1ª Nota");
        rotulo2 = new JLabel("2ª Nota");
        rotulo3 = new JLabel("3ª Nota");
        rotulo4 = new JLabel("4ª Nota");
        exibir = new JLabel("");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);
        
        calcular = new JButton("Calcular");
        Limpar = new JButton("Limpar");
        
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50, 60, 100, 20);
        rotulo3.setBounds(50, 100, 100, 20);
        rotulo4.setBounds(50, 140, 100, 20);
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);
        texto3.setBounds(120, 100, 200, 20);
        texto4.setBounds(120, 140, 200, 20);
        exibir.setBounds(50, 180, 300, 20);
        
        calcular.setBounds(400, 20, 100, 20);
        Limpar.setBounds(400, 60, 80, 20);
        
        calcular.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                double n1, n2, n3, n4, md;
                md = 0;
                n1 = Integer.parseInt(texto1.getText());
                n2 = Integer.parseInt(texto2.getText());
                n3 = Integer.parseInt(texto3.getText());
                n4 = Integer.parseInt(texto4.getText());
                md = (n1 + n2 + n3 + n4)/4;
                exibir.setVisible(true);
                exibir.setText("Sua média é: " +md+ " parabéns aluno(a)");
                }
            }
        );
        Limpar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                texto1.setText(null);
                texto2.setText(null);
                texto3.setText(null);
                texto4.setText(null);
                exibir.setText(null);
                texto1.requestFocus();
                }
            }
        );
        exibir.setVisible(false);
        
        tela.add(rotulo1); tela.add(rotulo2); 
        tela.add(rotulo3); tela.add(rotulo4); tela.add(exibir);
        tela.add(texto1); tela.add(texto2);
        tela.add(texto3); tela.add(texto4);
        tela.add(Limpar); tela.add(calcular);
        
        setSize(720, 400);
        setVisible(true);
    }
}