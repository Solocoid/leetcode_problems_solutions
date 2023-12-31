class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid +1]){
                // you are in dec part
                // this may be an ans, but look at left
                // this is why end != mid -1
                end = mid;

            } else {
                // you are in asc part of array
                start = mid + 1; //because we know that mid +  1 element > mid element

            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        return start;
    }
}
