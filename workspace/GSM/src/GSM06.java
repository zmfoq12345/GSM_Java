public class GSM06 {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO();
        b1.setTitle("Java");
        b1.setName("Hyunseung");
        b1.setPrice(24000);
        b1.setPage(500);
        System.out.println(b1.getTitle());
        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        System.out.println(b1.getPage());
    }
}
