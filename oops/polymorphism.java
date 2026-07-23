package oops;

public class polymorphism {
    public static class car{
        void speed(){
            System.out.println(78);
        }
    }
        public static class bike{
            void speed(){
                System.out.println(54);
            }
        }
            public static class marauti{
                void speed(){
                    System.out.println(87);
                }
            }
                public static class bycycle{
                    void speed(){
                        System.out.println(35);
                    }
                }
    public static void main(String[] args) {
        car s1 = new car();
        bike t = new bike();
        marauti r= new marauti();
        bycycle a = new bycycle();
        s1.speed();
         t.speed();
          r.speed();
           a.speed();
            s1.speed();

        
    }
    
}
