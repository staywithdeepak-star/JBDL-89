class StaticKeyword {

    static {
        System.out.println("StaticKeyword");
    }

    static void print(){
        System.out.println("Inside print function");
    }

    public static void main(String[] args) {
        StaticKeyword obj = new StaticKeyword();
        obj.print();

        StaticKeyword.print();

        StaticInnerClass obj1 = new StaticInnerClass();

        InnerClass obj2 = new StaticKeyword().new InnerClass();
        InnerClass obj3 = new StaticKeyword().new InnerClass();
        InnerClass obj4 = new StaticKeyword().new InnerClass();
        InnerClass obj5 = new StaticKeyword().new InnerClass();



        InnerClass obj6 = obj.new InnerClass();
        InnerClass obj7 = obj.new InnerClass();
        InnerClass obj8 = obj.new InnerClass();
        InnerClass obj9 = obj.new InnerClass();
    }

    private static class StaticInnerClass{
        int a;

        public StaticInnerClass() {
        }
    }

    private class InnerClass{
        int b;
        public InnerClass() {
        }
    }
}
