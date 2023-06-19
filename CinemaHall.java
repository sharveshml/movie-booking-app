public class CinemaHall {
    private String movie;
    private int screenNumber;
    private int[][] seats;
    private int numRows;
    private int numCols;

    public CinemaHall(int screenNumber,int numRows, int numCols,String movie) {
        this.screenNumber = screenNumber;
        this.seats = new int[numRows][numCols];
        this.numRows = numRows;
        this.numCols = numCols;
        this.movie=movie;
    }
    public String getMovie(){
        return movie;
    }   
    public int getScreenNumber(){
        return screenNumber;
    }
    public int getNumRows() {
        return numRows;
    }
    public int getNumCols() {
        return numCols;
    }
    public boolean isSeatAvailable(int row,int col){
        return seats[row][col]==0;
    }
    public boolean bookSeat(int row,int col){
        if(isSeatAvailable(row, col)){
            seats[row][col]=1;
            return true;
        }
        else{
            return false;
        }
    }
    public void displaySeats(){
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }
    }

    
}
