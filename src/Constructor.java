class Student5 {
    int rno;
    String name;
    String address;

    Student5(int rno, String name, String address) {
        this.rno = rno;
        this.name = name;
        this.address = address;
    }

    void displayDetail() {
        System.out.println("rno: " + rno + ", name: " + name + ", address: " + address);
    }
}
        class Constructor {
            public static void main(String[] args) {
                Student5 s1 = new Student5(8, " Aditi " , " gwalior");
                Student5 s2 = new Student5(10, " Aditi1 " , " sitholi");

                s1.displayDetail();
                s2.displayDetail();
            }
        }


