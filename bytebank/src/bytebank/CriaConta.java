package bytebank;

public class CriaConta {

    public static void main(String[] args) {
    	Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        
        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;
        segundaConta.agencia = 45;
        
        	
        System.out.println("O valor do saldo da primeira conta é " + primeiraConta.saldo);
        System.out.println("E a agencia é  " + segundaConta.agencia);
       
        if(primeiraConta == segundaConta) {
        	System.out.println("mesma conta");
        }else {
        	System.out.println("conta diferentes");
        }
        	
        	
    }
   
}

