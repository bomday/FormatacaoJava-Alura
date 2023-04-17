// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento:
                """ + anoDeLancamento; //técnica Text Block onde se utiliza 3 pares de "" para formatação de texto
        System.out.println(sinopse);

        /*Código feito para praticar:
        1. uso de operadores
        2. formas de impressão*/

        //COMPARAÇÃO DE STRINGS
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        //equalsIgnoreCase() irá nos ajudar a compreender que as String “alura” e “Alura” são iguais de significado, diferente do uso de equals()

        //FORMATAÇÃO DE TEXTOS

        /* %s indica que uma String será inserida no placeholder
        %d indica um valor inteiro
        %f indica um valor decimal*/

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        //no modelo text block:
        String outroNome = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(outroNome, aulas);

        System.out.println(mensagem);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}