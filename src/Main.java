public class Main {
    public static void main(String[] args) {
        int[] arrayBefore=new int[AddValue.enterSizeArray()];
        int[] arrayAfter=new int[arrayBefore.length+1];
        AddValue.enterNumberToArray(arrayBefore);
        AddValue.display(arrayBefore,"before");
        AddValue.addNumberToArray(arrayBefore, arrayAfter);
        AddValue.display(arrayAfter,"after");
    }
}