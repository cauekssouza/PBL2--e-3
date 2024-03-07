public class netflix {

    public static void main(String[] args) {
        System.out.println("---Bem-Vindo ao Netflix---");

        // Exemplo de utilização de classes fictícias
        Filme filme = new Filme("Inception", 148);
        Serie serie = new Serie("Stranger Things", 3);

        filme.imprimirInformacoes();
        serie.imprimirInformacoes();
    }
}

class Conteudo {
    protected String titulo;

    // Construtor sem parâmetros
    public Conteudo() {
        this.titulo = "Sem título";
    }

    // Construtor com parâmetros
    public Conteudo(String titulo) {
        this.titulo = titulo;
    }

    // Getter e Setter para o título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

class Filme extends Conteudo {
    private int duracao;

    // Construtor sem parâmetros
    public Filme() {
        super(); // Chama o construtor da classe pai
        this.duracao = 0;
    }

    // Construtor com parâmetros
    public Filme(String titulo, int duracao) {
        super(titulo); // Chama o construtor da classe pai
        this.duracao = duracao;
    }

    // Getter e Setter para a duração
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // Método adicional para imprimir informações do filme
    public void imprimirInformacoes() {
        System.out.println("Filme - Título: " + titulo + ", Duração: " + duracao + " minutos");
    }
}

class Serie extends Conteudo {
    private int numeroTemporadas;

    // Construtor sem parâmetros
    public Serie() {
        super(); // Chama o construtor da classe pai
        this.numeroTemporadas = 0;
    }

    // Construtor com parâmetros
    public Serie(String titulo, int numeroTemporadas) {
        super(titulo); // Chama o construtor da classe pai
        this.numeroTemporadas = numeroTemporadas;
    }

    // Getter e Setter para o número de temporadas
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    // Método adicional para imprimir informações da série
    public void imprimirInformacoes() {
        System.out.println("Série - Título: " + titulo + ", Número de Temporadas: " + numeroTemporadas);
    }
}




