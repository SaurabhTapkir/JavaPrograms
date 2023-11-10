class Bank {

    public static void balance(float MinBal) throws AccountBalanceException {
        if (MinBal >= 500.0f) {
            System.out.println("You Continue Your Transaction");
        } else {
            throw new AccountBalanceException("Your A/c is Temperary Blocked due to Insuffiecient bal.");
            // AccountBalanceException a= new AccountBalanceException();
            // System.out.println(a);
        }
    }

    public static void main(String[] args) {
        try {
            balance(60.0f);
        } catch (AccountBalanceException e) {
            System.out.println(e);
        }
    }
}