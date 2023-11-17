class myProgram {
    public static void main(String args[]) {
        hello("Eric");
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));        

    }

    public static void hello(String name) {
        System.out.println("Hello, " + name);

    }

    public static String returnString(String name) {
        return name;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }
}