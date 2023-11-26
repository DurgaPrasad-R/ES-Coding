class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 11, 23, 40, 50 };
    int key = 23;
    int res = bSearch(arr, key);
    if (res == -1) {
      System.out.println("Element is not Found");
    } else {
      System.out.println("Element is found at position:" + (res + 1));
    }
  }

  public static int bSearch(int[] arr, int key) {
    int start = 0,end=arr.length-1;
    while(start<=end){
      int mid = (start+end)/2;
      if (arr[mid] == key){
        return mid;
      }
      else if (arr[mid]>key){
        end = mid-1;
      } else{
        start = mid+1;
      }
    }
    return -1;
  }
}
