package math.problems;

public class FindLowestDifference {
    /*
             Implement in java.
             Read this below two array. Find the lowest difference between the two array cell.
             The lowest difference between cells is 1
            */
   public static int MinDiff(int[] arr, int n){
     int min = 0;

        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (Math.abs((arr[i] - arr[j]) )< min)
                    min = Math.abs((arr[i] - arr[j]));
        return min;
    }
    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int arr1[] = new int[]{30, 12, 5, 9, 2, 20, 33, 1};
        int arr2[] = new int[]{18, 3, 41, 47, 17, 36, };

        System.out.println("Minimum difference is "+
                MinDiff(arr1, arr1.length));
        System.out.println("Minimum difference is "+
                MinDiff(arr1, arr2.length));
    }

}
