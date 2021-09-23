public class Run {
    public static void main(String[] args) {
        ProgrammingBook b1 = new ProgrammingBook("TH", "ok", 14000, "thai", "vietnam", 214);
        System.out.println(b1);
        FictionBook b2 = new FictionBook("VV", "ok2", 13000, "ko biet", "kinh di");
        System.out.println(b2);

        ProgrammingBook[] books = new ProgrammingBook[5];
        books[0] = new ProgrammingBook("B01", "S1", 12, "A1", "Java", 200);
        books[1] = new ProgrammingBook("B02", "S2", 12, "A2", "Java", 200);
        books[2] = new ProgrammingBook("B03", "S3", 12, "A3", "Java1", 200);
        books[3] = new ProgrammingBook("B04", "S4", 12, "A4", "Java", 200);
        books[4] = new ProgrammingBook("B05", "S5", 12, "A5", "Java2", 200);

        FictionBook[] books1 = new FictionBook[5];
        books1[0] = new FictionBook("VV", "ok2", 13, "ko biet", "kinh di");
        books1[1] = new FictionBook("VV", "ok2", 13, "ko biet", "kinh di");
        books1[2] = new FictionBook("VV", "ok2", 13, "ko biet", "kinh di");
        books1[3] = new FictionBook("VV", "ok2", 13, "ko biet", "kinh di");
        books1[4] = new FictionBook("VV", "ok2", 13, "ko biet", "kinh di");

        int s = 0;
        for (int i = 0; i < 5; i++) {
            s += books[i].getPrice();
        }
//        System.out.println(s);
        int s2 = 0;
        for (int i = 0; i < 5; i++) {
            s2 += books1[i].getPrice();
        }
//        System.out.println(s2);
        System.out.println("sum of 10 books = " + (s + s2));

        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getLanguage() == "Java") {
                count++;
            }
        }
        System.out.println(count);
        
        
        //-----------------------------------------------------------------------
           Book[] books = new Book[4];
        books[0] = new ProgramingBook("C01", "Java1", 10,"TG1", "Java", "None");
        books[1] = new ProgramingBook("C02", "Java3", 15,"TG2", "PHP", "Laravel");
        books[2] = new FictionBook("C03", "Nhung ke xuat chung", 20, "Tg3", "edu");
        books[3] = new FictionBook("C04", "Cau chuyen tu trai tim", 25, "Tg4", "fun");

        int sum = getTotalPrice(books);
        System.out.println("Tong tien");
        System.out.println(sum);


//      Duyệt mảng
//      nếu là sách lập trình ProgramingBook, kiểm tra xem language == "java" không
//        System.out.println(books[3] instanceof Book);
        System.out.println("So luong sach lap trinh ngon ngu Java");
        System.out.println(countBookByLanguage(books, "Java"));
    }

    public static int getTotalPrice(Book[] books){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum+=books[i].getPrice();
        }
        return sum;
    }

    public static int countBookByLanguage(Book[] books, String language){
        int count = 0;
        for (int i = 0; i < books.length; i++) {

            if (books[i] instanceof ProgramingBook){
                if (((ProgramingBook)books[i]).getLanguage().equals(language))
                    count++;
            }
        }
        return count;
    }
}
