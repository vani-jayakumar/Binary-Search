public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {20,18,16,14,12,10,5,3,1};
        int num = 1;
        int ans = binarySearch(arr ,num);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr , int num) {
      int start = 0;
      int end = arr.length - 1;
      boolean isAscend = arr[start] < arr[arr.length - 1];
      while(start <= end){
          int mid = start + (end - start)/2 ;
          if (num == arr[mid]){
              return mid;
          }
          if (isAscend){
              if (num > arr[mid]) {
              start = mid + 1;
              }else if (num < arr[mid]) {
              end = mid - 1;
              }
          }else {
              if(num > arr[mid]){
                   end = mid - 1;
              } else if (num < arr[mid]) {
                  start = mid + 1;
              }
              }
          }
      return -1;
    }
}
