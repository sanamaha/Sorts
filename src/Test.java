public class Test
{
    public static void main(String[] args)
    {
        int[] numbers = new int[] {87, 43, 23, 56, 13, 24, 55, 93, 83, 18, 63, 27};
        Sorts.ascendingSort(numbers);
        Sorts.printArr(numbers);
        System.out.println();
        Sorts.descendingSort(numbers);
        Sorts.printArr(numbers);
    }
}