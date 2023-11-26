class LinearSearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 20, 40, 11, 23 };
    int key = 1;
    int res = lSearch(arr, key);
    if (res == -1) {
      System.out.println("Element is not Found");
    } else {
      System.out.println("Element is found at position:" + (res + 1));
    }
  }

  public static int lSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

}
