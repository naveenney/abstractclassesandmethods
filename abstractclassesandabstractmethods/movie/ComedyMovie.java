package abstractclassesandabstractmethods.movie;

public class ComedyMovie extends Movie {
   
    public ComedyMovie(String title, int year) {
        super(title, year);
    }
   
    public String getGenre() {
        return "Comedy";
    }

 
}

