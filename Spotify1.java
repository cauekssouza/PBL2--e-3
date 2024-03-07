import java.util.Scanner;

public class Spotify1 {

    private String artist;
    private String albumOrSingle;
    private int duration;
    private String playlist;
    private int artistMerchandise;
    private String eventsAttended;

    // Constantes para opções de merchandise
    private static final String[] MERCHANDISE_OPTIONS = {"Camiseta", "Caneca", "Poster", "CD", "Vinil"};

    public static void main(String[] args) {
        Spotify spotify = new Spotify();
        spotify.run();
    }

    public void run() {
        inputArtist();
        inputAlbumOrSingle();
        inputDuration();
        inputPlaylist();
        inputArtistMerchandise();
        inputEventsAttended();

        displayInfo();
    }

    private String getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    private int getIntInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void inputArtist() {
        artist = getInput("Digite seu artista favorito:");
    }

    public void inputAlbumOrSingle() {
        albumOrSingle = getInput("Digite o álbum ou single que gosta ou foi lançado:");
    }

    public void inputDuration() {
        // Loop até que a entrada seja válida
        while (true) {
            String durationInput = getInput("Digite a duração da música em minutos (ex: 3:30):");

            // Validar e extrair minutos e segundos
            if (durationInput.matches("\\d{1,2}:\\d{2}")) {
                String[] parts = durationInput.split(":");
                int minutes = Integer.parseInt(parts[0]);
                int seconds = Integer.parseInt(parts[1]);
                duration = minutes * 60 + seconds;
                break; // Saia do loop se a entrada for válida
            } else {
                System.out.println("Formato inválido. Use o formato 3:30 para 3 minutos e 30 segundos.");
            }
        }
    }

    public void inputPlaylist() {
        playlist = getInput("Digite o nome da playlist:");
        System.out.println("Uma playlist com suas músicas " + playlist + " foi criada");
    }

    public void inputArtistMerchandise() {
        // Loop para solicitar a entrada do usuário até que seja válida
        while (true) {
            System.out.println("Escolha merchandise do seu artista favorito:");

            // Exibir opções de merchandise
            for (int i = 0; i < MERCHANDISE_OPTIONS.length; i++) {
                System.out.println((i + 1) + ". " + MERCHANDISE_OPTIONS[i]);
            }

            int merchandiseChoice = getIntInput();

            // Verificar se a escolha do usuário é válida
            if (merchandiseChoice >= 1 && merchandiseChoice <= MERCHANDISE_OPTIONS.length) {
                artistMerchandise = merchandiseChoice;
                break;
            } else {
                System.out.println("Opção inválida. Escolha um número entre 1 e " + MERCHANDISE_OPTIONS.length + ".");
            }
        }
    }

    public void inputEventsAttended() {
        // Loop para solicitar a entrada do usuário até que seja válida
        while (true) {
            System.out.println("Digite o número de eventos que você participou com " + artist + ":");
            int event = getIntInput();

            // Verificar se a entrada do usuário é válida
            if (event > 0) {
                eventsAttended = String.valueOf(event);
                break;
            } else {
                System.out.println("Entrada inválida. Digite um número positivo para representar o evento.");
            }
        }
    }

    public void displayInfo() {
        System.out.println("Informações coletadas:");
        System.out.println("Artista Favorito: " + artist);
        System.out.println("Álbum ou Single: " + albumOrSingle);
        System.out.println("Duração da Música: " + duration + " segundos");
        System.out.println("Playlist: " + playlist);
        System.out.println("Merch do Artista: " + MERCHANDISE_OPTIONS[artistMerchandise - 1]); // Ajustado para exibir a opção correta
        System.out.println("Evento que foi: " + eventsAttended);
    }
}