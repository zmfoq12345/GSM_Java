public class GSM07 {
    public static void main(String[] args) {
        BookDTO[] book = new BookDTO[3];

        book[0] = new BookDTO("Java", "Hyun", 2555, 541);
        book[1] = new BookDTO("Oracle", "YANG", 3209, 133);
        book[2] = new BookDTO("DB", "KIM", 1244, 1535);

        System.out.println("    제목  이름  가격  페이지\n--------------------------------");
        for (int i = 0; i<book.length; i++) {
            System.out.printf("%7s %4s %5d %4d",
                    book[i].getTitle(),
                    book[i].getName(),
                    book[i].getPrice(),
                    book[i].getPage());
            System.out.println();
        }

    }
}
