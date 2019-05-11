public class Main {
    public static void main(String[] args) {
        String moviesPath = "movies.txt";
        MyMoviesCollection myMoviesCollection = new MyMoviesCollection();
        myMoviesCollection.readMoviesFromFile(moviesPath);
        myMoviesCollection.showMovies();
        System.out.println("Sort by score: ");
        myMoviesCollection.sortMoviesByScore();
        myMoviesCollection.showMovies();
        System.out.println("Sort by year: ");
        myMoviesCollection.sortMoviesByYear();
        myMoviesCollection.showMovies();
        System.out.println("Sort by duration: ");
        myMoviesCollection.sortMoviesByDuration();
        myMoviesCollection.showMovies();

    }
}
