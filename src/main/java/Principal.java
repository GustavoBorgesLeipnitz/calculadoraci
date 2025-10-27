/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author 10723112133
 */
public class Principal {
    
    public static void main(String[] args){
        String opcao = "";
        Calculadora calculadora = new Calculadora();
        
        while (!opcao.equals("9")){
            opcao = JOptionPane.showInputDialog("1 - Leitura\n2 - Adição\n3 - Subtração\n" + "4 - Multiplicação\n5 - Divisão\n9 - Sair");
            switch(Integer.parseInt(opcao)){
                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor A")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor B")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getSoma());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Subtração: " + calculadora.getDiferenca());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Quociente: " + calculadora.getQuociente());
                    break;
                    
            }
        }
        
        
    }
    
}
