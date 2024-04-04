package abstractclassesandabstractmethods.movie;

abstract class Movie {
    private String title;
    private int year;
    
    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
    public abstract String getGenre();

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
    
    public void getMovieDetails()
    {
    	System.out.println("MOVIE NAME:"+title+"\nRELEASED YEAR:"+year);
    }
}
