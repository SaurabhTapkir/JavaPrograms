class Car {
    public static void buy(String ModelNo) throws ModelException
     {
        if (ModelNo == "Gt-100X") {
            System.out.println("Car is Booked ");
        } else {
            // System.out.println("Booking Cancel");
            throw new ModelException("Booking Cancel");

        }
    }

    public static void main(String[] args) {
        try {
            buy("Gt-s");
        } catch (ModelException m) {
            System.out.println(m);
        }

    }
}
