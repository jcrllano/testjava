class location {
    String text = "hello";
    public static void main(String[] args) {
        location message = new location();
        System.out.println(message.text);
        System.out.println(test(3));
    }

    public static String test(int l) {
        int x = 1;
        int y = 2;
        int sum = x + y;
        String message = "the sum of this is";
        return message+sum+" "+l;
    }
}