import java.util.ArrayList;

public class MovieTicketBookingSystem{
    private ArrayList<CinemaHall>cinemahalls;
    private ArrayList<Movie>movies;
    private ArrayList<Show>shows;
    private ArrayList<Booking>bookings;

    public MovieTicketBookingSystem() {
        cinemahalls = new ArrayList<CinemaHall>();
        movies = new ArrayList<Movie>();
        shows = new ArrayList<Show>();
        bookings = new ArrayList<Booking>();
    }
    public void addCinemaHall(CinemaHall cinemahall){
        cinemahalls.add(cinemahall);
    }
    public void addMovie(Movie movie){
        movies.add(movie);
    }
    public void addShow(Show show){
        shows.add(show);
    }
    public void makeBooking(Show show, String customerName, int row, int col) {
    CinemaHall cinemaHall = show.getCinemaHall();
    if (shows.contains(show) && cinemaHall.isSeatAvailable(row, col)) {
        Booking booking = findExistingBooking(show, customerName, row, col);
        if (booking != null) {
            booking.setQuantity(booking.getQuantity() + 1);
        } else {
            booking = new Booking(show, customerName, row, col, 1);
            bookings.add(booking);
        }
        cinemaHall.bookSeat(row, col);
        System.out.println("Booking successful!");
    } else {
        System.out.println("Booking failed. The show is not available or the selected seat is already booked.");
    }
}

private Booking findExistingBooking(Show show, String customerName, int row, int col) {
    for (Booking booking : bookings) {
        if (booking.getShow() == show && booking.getCustomerName().equals(customerName)) {
            return booking;
        }
    }
    return null;
}

    public void displayMovies(){
        for(Movie movie:movies){
            System.out.println(movie.getMovie()+" ("+movie.getDirector()+") "+movie.getRuntime()+" min");
        }
    }
    public boolean isShowAvailable(String movie,String date){
        for(Show show:shows){
            System.out.println(show.getMovie()+" "+show.getDate());
        }
        for(Show show:shows){
            System.out.println(show.getMovie()+" "+show.getDate());
            if(show.getMovie().equals(movie) && show.getDate().equals(date)){
                return true;
            }
        }
        return false;
    }
    public void displayBookings(){
        for(Booking booking:bookings){
            System.out.println(booking.getCustomerName()+" "+booking.getShow().getMovie()+" "+booking.getQuantity()+" "+booking.getRow()+" "+booking.getCol());
        }
    }
    public void displayCinemaHalls() {
    for (CinemaHall cinemahall : cinemahalls) {
        System.out.println("Screen : " + cinemahall.getScreenNumber()+ " Movie : " + cinemahall.getMovie());
    }
    }
}
   
