
import java.util.Random;
import java.lang.StringBuilder;

class PasswordGenerator{
    public static void main(String[] args) {
        //Declara a string com os caracteres disponíveis para a montagem da senha
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789/*-+";
        //Instancia a classe Random
        Random rdr = new Random();
        //montar a senha com a classe StringBuilder, instanciando-a no objeto strbuilder
        StringBuilder strbuilder = new StringBuilder();
        
        for(int i = 0; i < 19; i++){
            //Atribuo à variável index o valor resultande da multiplicação do tamanho da string referência de caracteres com um valor escolhido de forma "aleatória"
            int index = (int) (rdr.nextFloat()*str.length());
            strbuilder.append(str.charAt(index));
        }
        
        System.out.println(strbuilder.toString());

    }
}