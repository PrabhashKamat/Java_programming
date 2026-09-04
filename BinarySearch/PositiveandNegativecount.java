package BinarySearch;

public class PositiveandNegativecount {
        public static int maximumCount(int[] nums) {
            int n = nums.length;
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(nums[mid]>=0) high=mid-1;
                else low=mid+1;
            }
            int negcount=low;
            System.out.println("Negative: "+low);
            low=0;
            high=n-1;
            while(low<=high){
                int midium=low+(high-low)/2;
                if(nums[midium]<=0) low=midium+1;
                else high=midium-1;
            }
            int poscount=n-low;
            System.out.println("Positive: "+poscount);
            if(negcount<=poscount) return poscount;
            else return negcount;
        }
    public static void main(String[] arg){
        int[] arr ={-2,-1,-1,1,2,3};
        int count =maximumCount(arr);
        System.out.println(count);
    }
}
