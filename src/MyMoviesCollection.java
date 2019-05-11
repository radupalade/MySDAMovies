import java.io.File;
import java.util.Scanner;

public class MyMoviesCollection {

    public static final Integer DEFAULT_SEGMENT_SIZE = 16;

    public Movie[] movies;

    public int size;

    public void readMoviesFromFile(String filePath) {
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] split = line.split("[,]");

                Movie movie = new Movie();
                movie.id = Long.valueOf(split[0]);
                movie.name = split[1];
                movie.duration = Integer.valueOf(split[2]);
                movie.type = split[3];
                movie.genre = split[4];
                movie.score = Double.valueOf(split[5]);
                movie.year = Integer.valueOf(split[6]);

                add(movie);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MyMoviesCollection() {
        movies = new Movie[DEFAULT_SEGMENT_SIZE];
        size = 0;
    }

    public void add(Movie movie) {
        this.movies[size] = movie;
        size++;
    }

    public void showMovies() {

        for (int i = 0; i < size; i++) {
            System.out.println(movies[i]);
        }

    }

    //Bubble sort
    public void sortMoviesByYear() {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < size - 1; i++) {
                if (movies[i].year > movies[i + 1].year) {
                    Movie aux = movies[i];
                    movies[i] = movies[i + 1];
                    movies[i + 1] = aux;
                    sorted = false;
                }

            }

        }
    }

    //Select sort
    public void sortMoviesByDuration() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i; j < size; j++) {
                if (movies[j].duration < movies[minIndex].duration) {
                    minIndex = j;
                }
            }
            Movie aux = movies[i];
            movies[i] = movies[minIndex];
            movies[minIndex] = aux;
        }

    }

    //Insert sort
    public void sortMoviesByScore() {

        for (int i = 1; i < size; i++) {
            Movie aux = movies[i];
            int j = i - 1;
            while (j >= 0 && movies[j].score > aux.score) {
                movies[j + 1] = movies[j];
                j--;
            }
            movies[j + 1] = aux;

        }

    }
}
