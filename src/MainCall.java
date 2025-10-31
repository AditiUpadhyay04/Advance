class Human {      // class 1

      String name;
      int age;
      long mob_no;

}
    class Activity {      // class 2
        Human doActivity(Human h1) {
            System.out.println(h1.name + " is sleeping ");
            System.out.println(h1.name + " is running ");
            return h1;
        }
    }
    class MainCall{   // main class
        public static void main(String[] args) {
            Human obj1 = new Human();   //creating human object
            Activity obj2 = new Activity();  // creating activity object

            obj1.name = "Aditi";
            obj1.age = 20;
            obj1.mob_no = 83475;

            obj2.doActivity(obj1);// calling method with human

        }
    }


