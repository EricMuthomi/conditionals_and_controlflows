    public class Conditionals {
        int guestCount;
        int restaurantCapacity;
        boolean isRestaurantOpen;
        boolean isConfirmed;

        public Conditionals (int guestCount, int restaurantCapacity, boolean isRestaurantOpen) {
            if (guestCount < 1 || guestCount > 8) {
                System.out.println("Invalid reservation!");
            }
           this.guestCount = guestCount;
            this.restaurantCapacity = restaurantCapacity;
            this.isRestaurantOpen = isRestaurantOpen;
        }

        public void confirmReservation() {
            if (restaurantCapacity >= guestCount && isRestaurantOpen) {
                System.out.println("Reservation confirmed");
                isConfirmed = true;
            } else {
                System.out.println("Reservation denied");
                isConfirmed = false;
            }
        }

        public void informUser() {
            if (!isConfirmed) {
                System.out.println("Unable to confirm reservation, please contact restaurant.");
            } else {
                System.out.println("Please enjoy your meal!");
            }
        }

        public static void main(String[] args) {
            // Create instances here
            Conditionals restaurant= new Conditionals(5, 7, true);
            restaurant.confirmReservation();
            restaurant.informUser();
        }
    }

