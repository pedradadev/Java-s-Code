package academy.devdojo.maratonajava.javacore.Qstring.test;

public class SpringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // Letra na posição (X)
        System.out.println(nome.length());  // Tamanho...
        System.out.println(nome.replace("f","l")); // Troca todos os ( F ) por ( L )
        System.out.println(nome.toLowerCase()); // Trocar todas as letras para minúsculas
        System.out.println(nome.toUpperCase()); // Trocar todas as letras para maiúsculas
        System.out.println(numeros.length());   // Tamanho...
        System.out.println(numeros.substring(0));   // Amostrar do índice ( X ) até índice ( Y )
        System.out.println(nome.trim());    // Apaga todos espaços em braco no inicio ou fim da string
    }
}
