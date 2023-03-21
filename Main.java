package tasks.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("TASK 1");

        MyList<Float> listFloat = new MyList<>();
        listFloat.add(23.32314f);
        listFloat.add(66.91234f);
        listFloat.add(73.2634f);
        listFloat.add(73.12341f);
        listFloat.add(1.21235f);
        listFloat.add(-12.41235f);
        listFloat.add(0.31235f);
        listFloat.add(133.265463f);
        System.out.println("\n" + "Largest and Smallest 'FLOAT' ");
        System.out.println("SmallestNumber: " + listFloat.theSmallest());
        System.out.println("LargestNumber: " + listFloat.theLargest());

        MyList<Integer> listInt = new MyList<>();
        listInt.add(1322);
        listInt.add(54);
        listInt.add(43);
        listInt.add(213);
        listInt.add(6341);
        listInt.add(92);
        listInt.add(-3);
        listInt.add(3532);
        System.out.println("\n" + "Largest and Smallest 'INT' ");
        System.out.println("SmallestNumber: " + listInt.theSmallest());
        System.out.println("LargestNumber: " + listInt.theLargest());

        MyList<Long> listLong = new MyList<>();
        listLong.add(637_342_124_948_432L);
        listLong.add(-124_543_321_654_923_423L);
        listLong.add(123_456_789_9L);
        listLong.add(123_653_235_215_894L);
        listLong.add(-981_885_325_234_325_234L);
        listLong.add(123_645_324_135_463L);
        listLong.add(-123_645_345_982L);
        listLong.add(981_775_643_523L);
        System.out.println("\n" + "Largest and Smallest 'LONG' ");
        System.out.println("SmallestNumber: " + listLong.theSmallest());
        System.out.println("LargestNumber: " + listLong.theLargest());

        MyList<Double> listDouble = new MyList<>();
        listDouble.add(637.342124948432);
        listDouble.add(-1.24543321654923423);
        listDouble.add(21.1234567899);
        listDouble.add(-1.654323653235215894);
        listDouble.add(-9.8885325234325234);
        listDouble.add(-5.3212364532413546);
        listDouble.add(2.3645345982);
        listDouble.add(9.81775643523);
        System.out.println("\n" + "Largest and Smallest 'DOUBLE' ");
        System.out.println("SmallestNumber: " + listDouble.theSmallest());
        System.out.println("LargestNumber: " + listDouble.theLargest());

        System.out.println("\n" + "TASK 2");
        System.out.println("\n");

        MyListChanged<String> striNg = new MyListChanged<>();
        striNg.add("Perto");
        System.out.println("Name: " + striNg);
        MyListChanged<Float> floAt = new MyListChanged<>();
        floAt.add(56.6f);
        System.out.println("Weight: " + floAt + "kg" + "\n");

        MyListChanged<String> striNg1 = new MyListChanged<>();
        striNg1.add("Maksym");
        System.out.println("Name: " + striNg1);
        MyListChanged<Float> floAt1 = new MyListChanged<>();
        floAt1.add(68.3f);
        System.out.println("Weight: " + floAt1 + "kg" + "\n");

        MyListChanged<String> striNg2 = new MyListChanged<>();
        striNg2.add("Volodya");
        System.out.println("Name: " + striNg2);
        MyListChanged<Float> floAt2 = new MyListChanged<>();
        floAt2.add(74.4f);
        System.out.println("Weight: " + floAt2 + "kg" + "\n");

        MyListChanged<String> striNg3 = new MyListChanged<>();
        striNg3.add("Nastya");
        System.out.println("Name: " + striNg3);
        MyListChanged<Float> floAt3 = new MyListChanged<>();
        floAt3.add(49.3f);
        System.out.println("Weight: " + floAt3 + "kg" + "\n");

        MyListChanged<String> striNg4 = new MyListChanged<>();
        striNg4.add("Orest");
        System.out.println("Name: " + striNg4);
        MyListChanged<Float> floAt4 = new MyListChanged<>();
        floAt4.add(83.5f);
        System.out.println("Weight: " + floAt4 + "kg" + "\n");
    }
}