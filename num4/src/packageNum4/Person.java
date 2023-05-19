package packageNum4;

class Person {
    public static int instanceCount = 0;
    public int localCount = 0;
    public Person(){
        instanceCount ++;
        localCount ++;
    }
}