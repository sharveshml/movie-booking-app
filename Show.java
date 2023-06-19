public class Show {
    private CinemaHall screenNumber;
    private Movie movie;
    private String time;
    private int ticketPrice;
    private String date;

    public Show(CinemaHall screenNumber, Movie movie, String time, int ticketPrice,String date) {
        this.screenNumber = screenNumber;
        this.movie = movie;
        this.time = time;
        this.ticketPrice = ticketPrice;
        this.date=date;
    }
    public CinemaHall getCinemaHall() {
        return screenNumber;
    }
    public String getDate(){
        return date;
    }
    public String getMovie() {
        return movie.getMovie();
    }
    public String getTime() {
        return time;
    }
    public int getTicketPrice() {
        return ticketPrice;
    }
}
