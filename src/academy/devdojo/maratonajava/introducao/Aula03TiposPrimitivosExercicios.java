package academy.devdojo.maratonajava.introducao;

import java.util.Date;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Gabriel";
        String endereco = "Serra-ES, Rua janes joplin N.14";
        double salario = 5431.12;
        String dataRecebimentoSalario = "20/05/2022";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
