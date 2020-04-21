public class GSM06 {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO();
        b1.setTitle("Java");
        b1.setName("Hyunseung");
        b1.setPrice(24000);
        b1.setPage(500);
        System.out.println(b1);

        BookDTO b2 = new BookDTO("Oracle", "YANG", 3209, 133);
        System.out.println(b2);
    }
}
