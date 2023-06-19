import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicketBookingSystem bookingSystem = new MovieTicketBookingSystem();

        // create cinema halls
        CinemaHall cinemaHall1 = new CinemaHall(1, 10, 10, "The Matrix");
        bookingSystem.addCinemaHall(cinemaHall1);

        // create movies
        Movie movie1 = new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", 136);
        bookingSystem.addMovie(movie1);

        // create shows
        Show show1 = new Show(cinemaHall1, movie1, "20:00", 190, "2023-06-15");
        bookingSystem.addShow(show1);

        // display menu
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Display cinema halls");
            System.out.println("2. Display movies");
            System.out.println("3. Make a booking");
            System.out.println("4. Display bookings");
            System.out.println("5. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    bookingSystem.displayCinemaHalls();
                    break;
                case 2:
                    bookingSystem.displayMovies();
                    break;
                case 3:
                    System.out.println("Enter the movie name");
                    String movieName = scanner.nextLine();
                    movieName = scanner.nextLine();
                    System.out.println("Enter the date");
                    String date = scanner.nextLine();

                    if (bookingSystem.isShowAvailable(movieName, date)) {
                        System.out.println("The show is available");

                        System.out.println("The available seats in the cinema hall are:");
                        cinemaHall1.displaySeats();

                        System.out.println("Enter the customer name");
                        String customerName = scanner.next();
                        System.out.print("Enter the number of seats to be booked: ");
                        int numberOfSeats = scanner.nextInt();

                        for(int i=0;i<numberOfSeats;i++){
                            System.out.println("Enter the row");
                            int row = scanner.nextInt();
                            System.out.println("Enter the column");
                            int col = scanner.nextInt();
                            bookingSystem.makeBooking(show1, customerName, row, col);
                        }
                    } else {
                        System.out.println("The show is not available");
                    }
                    break;
                case 4:
                    bookingSystem.displayBookings();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
