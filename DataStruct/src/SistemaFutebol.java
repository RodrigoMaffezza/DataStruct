public class SistemaFutebol {
    private static final int MAX_JOGADORES = 11; // Número de jogadores máximo por time
    private String[] nomes;
    private int[] idades;
    private String[] cidades;
    private String[] posicoes;
    private int count;

    public SistemaFutebol() {
        // Instancia as listas com 11 espaços cada
        nomes = new String[MAX_JOGADORES];
        idades = new int[MAX_JOGADORES];
        cidades = new String[MAX_JOGADORES];
        posicoes = new String[MAX_JOGADORES];
        count = 0;
    }

    public void adicionarJogador(String nome, int idade, String cidade, String posicao) {
        // Adiciona um registro apenas se houver espaço
        if (count < nomes.length) {
            nomes[count] = nome;
            idades[count] = idade;
            cidades[count] = cidade;
            posicoes[count] = posicao;
            count++;
            System.out.println("Jogador " + nome + " adicionado com sucesso.");
        } else {
            System.out.println("A lista está cheia. Não é possível adicionar mais jogadores.");
        }
    }

    public void removerJogador(int indice) {
        // Remove um jogador se o índice estiver entre 0 e a soma de jogadores
        if (indice >= 0 && indice < count) {
            for (int i = indice; i < count - 1; i++) {
                nomes[i] = nomes[i + 1];
                idades[i] = idades[i + 1];
                cidades[i] = cidades[i + 1];
                posicoes[i] = posicoes[i + 1];
            }
            nomes[count - 1] = null;
            idades[count - 1] = 0;
            cidades[count - 1] = null;
            posicoes[count - 1] = null;
            count--;
            System.out.println("Jogador removido com sucesso.");
        } else {
            System.out.println("Índice inválido. Por favor, forneça um índice válido para remover um jogador.");
        }
    }

    public void exibirJogadores() {
        // Exibe todos os jogadores cadastrados
        if (count == 0) {
            System.out.println("Não há jogadores cadastrados.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Nome: " + nomes[i] + ", Idade: " + idades[i] + ", Cidade: " + cidades[i] + ", Posição: " + posicoes[i]);
        }
    }

    public void mostraTopo() {
        // Mostra o último jogador cadastrado.
        System.out.println("Nome: " + nomes[count - 1] + ", Idade: " + idades[count - 1] + ", Cidade: " + cidades[count - 1]
+ ", Posicao: " + posicoes[count - 1]);
    }

    public static void main(String[] args) {
        // Utilização da classe
        SistemaFutebol time = new SistemaFutebol();
        time.adicionarJogador("João", 22, "São Paulo", "Atacante");
        time.adicionarJogador("Pedro", 25, "Rio de Janeiro", "Goleiro");
        time.adicionarJogador("Rubens", 25, "Rio de Janeiro", "Goleiro");
        time.mostraTopo();
        time.exibirJogadores();
        time.removerJogador(2);
        time.removerJogador(2);
        time.removerJogador(1);
        time.exibirJogadores();
    }
}
