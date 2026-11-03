import arrays.hashing.ContainDuplicates;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        ContainDuplicates duplicate = new ContainDuplicates();
       var result =duplicate.count_Duplicates(arr);
        System.out.println(result);

    }
}