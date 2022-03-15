package br.ulbra.classe;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Vendedor {
    
    private String nome;
    private double meta;
    private double totalVendido;
    
    public Vendedor(){   
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
        
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }
   
    
    public double calcularComissao(){
        double valorVendido;
        double comissaoVendedor = (totalVendido / meta);
        
	 if (comissaoVendedor < 0.5) {
            valorVendido = totalVendido * 0.01;
        } else if(comissaoVendedor <= 0.75 ) {
            valorVendido = totalVendido * 0.025;
        } else if(comissaoVendedor <= 1.0 ) {
            valorVendido = totalVendido * 0.035;
        } else {
            valorVendido = totalVendido * 0.05;
        }
        return valorVendido; 
    }
    
    public String toString(){
        return " Vendedor: " +nome + 
        " \nMeta de Venda: R$ " +meta +
         "\nComissão a receber: R$ " +String.format("%.2f", + calcularComissao());   
    } 
       
        
    
}
