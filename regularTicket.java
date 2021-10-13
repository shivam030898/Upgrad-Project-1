public class regularTicket extends Tickets {
    //Attributes
    private boolean food;
    private boolean water;
    private boolean snacks;

    //Constructor
    regularTicket(){
    }
    //Getter for food
    boolean food() {
        return food;
    }
    // Setter for food
    void setfood(Boolean food) {
        this.food = food;
    }
      //Getter for water
      boolean water() {
        return water;
    }
    // Setter for food
    void setwater(Boolean water) {
        this.water = water;
    }
        //Getter for snacks
        boolean snacks() {
            return snacks;
        }
        // Setter for food
        void setsnacks(Boolean snacks) {
            this.snacks = snacks;
        }
}
