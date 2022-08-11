//Tạo 5 cuốn sách thuộc lớp ProgrammingBook và 5 cuốn sách thuộc lớp FictionBook
//        Tính tổng tiền của 10 cuốn sách,
//        đếm số sách ProgrammingBook có language là "Java".
//        Đếm số sách Fiction có category là “Viễn tưởng 1”.
//        Đếm số sách Fiction có giá < 100.


public class Test {
    public static void main(String[] args) {
        ProgrammingBook pB1 = new ProgrammingBook("1", 500, "Java");
        ProgrammingBook pB2 = new ProgrammingBook("2", 50, "Js");
        ProgrammingBook pB3 = new ProgrammingBook("3", 300, "Java");
        ProgrammingBook pB4 = new ProgrammingBook("4", 100, "HTML");
        ProgrammingBook pB5 = new ProgrammingBook("5", 110, "Java");

        FictionBook fB1 = new FictionBook("6", 75, "category");
        FictionBook fB2 = new FictionBook("7", 745, "Viễn tưởng 1");
        FictionBook fB3 = new FictionBook("8", 750, "tc");
        FictionBook fB4 = new FictionBook("9", 5, "category");
        FictionBook fB5 = new FictionBook("0", 105, "tc");

        Book listBook[] = {pB1, pB2, pB3, pB4, pB5, fB1, fB2, fB3, fB4, fB5};

        //Tính tổng tiền
        double sum = 0;
        for (Book b: listBook) {
            sum += b.getPrice();
        }
        System.out.println("Tổng số tiền 10 cuốn sách: " + sum);

        //Đếm số sách Java
        int count = 0;
        for (Book b: listBook) {
            if(b instanceof ProgrammingBook) {
                String language = ((ProgrammingBook)b).getLanguage();
                if (language == "Java") count++;
            }
        }
        System.out.println("Số sách có language Java: " + count);

        //Đếm số sách Viễn tưởng 1
        int countt = 0;
        for (Book b: listBook) {
            if(b instanceof FictionBook) {
                String category = ((FictionBook)b).getCategory();
                if (category == "Viễn tưởng 1") countt++;
            }
        }
        System.out.println("Số sách Viễn tưởng 1: " + countt);

        //Đếm số sách Fiction giá <100
        double summ = 0;
        for (Book b: listBook) {
            if(b instanceof FictionBook) {
                if(b.getPrice()<100) {
                    summ += b.getPrice();
                }
            }
        }
        System.out.println("Tổng tiền số sách Fiction giá <100: " + summ);
    }
}
