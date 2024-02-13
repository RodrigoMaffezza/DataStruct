/*  SistemaFutebol.java - Lista de memória estática
    - O técnico do time de futebol do município pediu para que você
    criasse um pequeno sistema que realizasse o cadastro dos jogadores.

    O técnico precisa saber:
        - O nome completo;
        - A idade;
        - A cidade de onde veio
        - E a posição que o jogador fica em campo

    Dica: todas as estruturas de dados possuem operações em comum que podem ser efetuadas,
    e com as listas não é diferente. Usando listas, podemos:
        - Criar uma lista vazia;
        - Acessar (retornar) o i-ésimo item da lista;
        - Inserir um novo elemento no fim da lista (caso haja espaço);
        - Determinar o número de elementos na lista, entre outros.
*/

public class SistemaFutebol {
    // Definimos arranjos (arrays) estáticos para cada informação
    private String[] nomes;
    private int[] idades;
    private String[] cidades;
    private String[] posicoes;
    private int count;

    // Ao instanciar a classe, criamos listas com base no número de jogadores (no caso, serão 11).
    public SistemaFutebol(int tamanho) {
        nomes = new String[tamanho];
        idades = new int[tamanho];
        cidades = new String[tamanho];
        posicoes = new String[tamanho];
        count = 0;
    }

    // Esta função atribuirá à lista o valor dos parâmetros, se a lista não estiver cheia.
    public void adicionarJogador(String nome, int idade, String cidade, String posicao) {
        if (count < nomes.length) {
            nomes[count] = nome;
            idades[count] = idade;
            cidades[count] = cidade;
            posicoes[count] = posicao;
            count++;
        } else {
            System.out.println("A lista está cheia. Não é possível adicionar mais jogadores.");
        }
    }

    // Percorre os arranjos e exibe no terminal todos os jogadores cadastrados.
    public void exibirJogadores() {
        for (int i = 0; i < count; i++) {
            System.out.println("Nome: " + nomes[i] + ", Idade: " + idades[i] + ", Cidade: " + cidades[i] + ", Posição: " + posicoes[i]);
        }
    }

    public static void main(String[] args) {
        SistemaFutebol time = new SistemaFutebol(20);
        time.adicionarJogador("João", 22, "São Paulo", "Atacante");
        time.adicionarJogador("Pedro", 25, "Rio de Janeiro", "Goleiro");
        time.exibirJogadores();
    }
}