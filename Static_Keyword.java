public class Static_Keyword {
    static int val = 10; // static variable create only once
    int val2 = 20; // instance variable

        void show(){
        System.out.println(val);
        System.out.println(val2);
    }
        static void static_show(){
        System.out.println(val);
    }
    public static void main(String[] args) {
        //System.out.println(val2); //error : non-static variable val2 cannot be referenced from a static context
        //show obj = new show(); //show error
        Static_Keyword obj = new Static_Keyword();
        obj.show();
        static_show();
    }
}
