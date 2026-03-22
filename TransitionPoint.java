//https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1
class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int n = arr.length-1;
        int beg =0;
        int end = n-1;
        if(n==0 && arr[0]==0){
            return -1;
        }while(beg<=end){
            int mid = (beg+end)/2;
            if(arr[mid] == 1 && arr[mid-1]==0){
                return mid;
            } else if(arr[mid] ==1){
                end = mid-1;
            }else{
                beg = mid+1;
            }
        }
        return -1;
            
    }
}