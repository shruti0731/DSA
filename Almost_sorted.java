class Almost_sorted{
    public static void main(String a[]){
        int arr[] = {1,2,6,4,3};
        int l=0,r=1;int cnt=0;
        while (r<arr.length) {
            if(arr[l]<arr[r]){
                l++;r++;
            }
            else if(arr[l]>arr[r]){
                cnt++;
                l++;r++;
            }
        }
        System.out.println(cnt);
    }
}