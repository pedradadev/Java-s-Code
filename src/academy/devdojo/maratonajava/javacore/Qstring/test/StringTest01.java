package academy.devdojo.maratonajava.javacore.Qstring.test;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class StringTest01 {
    public static void main(String[] args) {
        String n = "Gabriel"; //String constant pool
        String n2 = "Gabriel";
//        nome.concat(" Pedrada"); // não funciona, pois é imutavel
        n = n.concat(" Pedrada"); // nome += " Pedrada"               Teria que chamar a variavel de referencia, e aí sim concatenar (Exatamente feito nessa linha)
        System.out.println(n);
        System.out.println(n == n2);
        String n3 = new String("Gabriel"); // 1- Criando uma variavel de referência, 2- Um objeto do tipo String, 3- Uma String no pool de String
        System.out.println(n2 == n3);
        System.out.println(n2 == n3.intern());
    }
}
