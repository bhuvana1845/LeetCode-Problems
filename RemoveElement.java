import java.util.Arrays;

public class RemoveElt{
    static int removeelement(int[] nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int[] nums={3,2,2,1,6,8,2,9};
        int val=2;
        int result=removeelement(nums,val);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
}
