package abstractclassesandabstractmethods.movie;

public class ActionMovie extends Movie {
  
    public ActionMovie(String title, int year) {
        super(title, year);
    }

    public String getGenre() {
        return "Action";
    }

   
}
