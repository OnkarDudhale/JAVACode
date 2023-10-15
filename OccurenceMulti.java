//Remove occurence of duplicate elements (sorted order)
//arr[]=[10,20,20,30] OUTPUT:arr[]=[10,20,30]
class OccurenceMulti {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int temp[] = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(temp[i]);
        }
    }
}
