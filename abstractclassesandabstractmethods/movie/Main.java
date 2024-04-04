package abstractclassesandabstractmethods.movie;


public class Main {
    public static void main(String[] args) {
      
        Movie actionMovie = new ActionMovie("CAPTAIN AMERICA",2011);
        Movie comedyMovie = new ComedyMovie("HOME ALONE",1990);
        actionMovie.getMovieDetails();
        comedyMovie.getMovieDetails();
        
        
    }
}