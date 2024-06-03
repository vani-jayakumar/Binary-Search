public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {20,18,16,14,12,10,5,3,1};
        int num = 2; // the target number to search
        boolean ispresent = binarySearch(arr ,num);
        System.out.println(ispresent);
    }
    // the function to search the element
    private static boolean binarySearch(int[] arr , int num) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscend = arr[start] < arr[arr.length - 1];// method to check whether the array is asending
        // or descending
        while(start <= end){
            int mid = start + (end - start)/2 ;// finding the middle element
            if (num == arr[mid]){
                return true;
            }
            if (isAscend){ // if the array is ascending this condition will run
                if (num > arr[mid]) {
                    start = mid + 1;
                }else if (num < arr[mid]) {
                    end = mid - 1;
                }
            }else { // if the array is descending this condition will run
                if(num > arr[mid]){
                    end = mid - 1;
                } else if (num < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return false;// if the element is not present this will return
    }
}
