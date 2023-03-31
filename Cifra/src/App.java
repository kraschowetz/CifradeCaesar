import javax.swing.JOptionPane;

public class App {

    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray(); //array do alfabeto e numeros

    public static void main(String[] args) throws Exception {
        String texto = JOptionPane.showInputDialog("insira um texto para codificar!", null); //coletar texto
        char[] caracteres = texto.toCharArray(); //guardar cada caractere do texto separadamente
        char[] cifra = caracteres; // criar variavel pra cifra
        String textoCodificado = ""; // criar variavel pra guardar o texto

        for(int i = 0; i < caracteres.length; i++){ //codificar cada caractere do texto
            cifra[i] = converter(caracteres[i]);
        }

        for(int i = 0; i < cifra.length; i++){ //colocar cada caractere codificado na variavel de texto
            textoCodificado += cifra[i];
        }
        // mostrar o texto codificado
        JOptionPane.showMessageDialog(null, textoCodificado, "resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    //função de codificar caracteres
    public static char converter(char c){
        // definir um id do caractere e se ele esta no alfabeto
        boolean isInAlphabet = false;
        int id = 0;

        //verificar se o caractere esta no alfabeto
        for(int i = 0; i < alphabet.length; i++){
            if(c == alphabet[i]){
                //se o caractere estiver no alfabeto ele coleta o id do caractere
                isInAlphabet = true;
                id = i;
                break;
            }
        }

        if(!isInAlphabet){ return c; } // caso o caractere n esteja no alfabeto ele não é mudado
        
        //codificar o caractere
        if(id > 32){
            id = id - 33;
        }
        else{
            id += 3; 
        }

        //retornar o caractere dps de codificar
        return alphabet[id]; 
    }
}    

