package memory;

public class TestStatic {
    public static void main(String[] args) {
        TestData01 myCounter = new TestData01();
        System.out.println("before update" + myCounter.count);
        TestData02 myUpdater = new TestData02();
        myUpdater.update(myCounter);
        System.out.println("after update" + myCounter.count);
    }
}
