class Demo {
    public String toString() {
        return "sangamner";
    }

    public static void main(String[] args) {
        int a = 10;
        Integer iref = a; // You can directly assign 'a' to 'iref'
        Integer iref2 = Integer.valueOf(a);

        // Wrapper class to integer
        int b = iref.intValue();

        System.out.println("iref: " + iref);
        System.out.println("iref2: " + iref2);

        // Primitive data type to string object
        String s1 = Integer.toString(10);
        String s2 = Integer.toString(20);
        System.out.println("Concatenated strings: " + s1 + s2);

        // String to wrapper object
        Integer iref3 = new Integer("10");
        System.out.println("iref3: " + iref3);
        Integer iref4 = Integer.valueOf("10");
        System.out.println("iref4: " + iref4);

        // Wrapper class to string
     //   Integer iref5 = new Integer(a); // Corrected variable name from 'int d' to 'Demo d'
      //  String s = iref5.toString();
      // System.out.println("iref5 as string: " + s);
    }
}


