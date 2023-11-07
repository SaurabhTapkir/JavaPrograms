class HandleAIOBE {
    public static void main(String[] args) {
        System.out.println("Array Exception Below");
        int[] arr = new int[4];

        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Array Exception Handled ");
    }
}
