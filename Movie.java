public class Movie {
    private String title;
    private String director;
    private int runtime;

    public Movie(String title, String director, int runtime) {
        this.title = title;
        this.director = director;
        this.runtime = runtime;
    }
    public String getMovie(){
        return title;
    }
    public String getDirector(){
        return director;
    }    
    public int getRuntime(){
        return runtime;
    }
}
