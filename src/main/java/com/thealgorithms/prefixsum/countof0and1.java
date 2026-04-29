import java.util.HashMap;

public class countof0and1s {
    // longest subarray with given equal number of 0's and 1's
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int []arr = {0,1,0,1,1,1,0,0,1,0,1,0,0};
        int presum = 0;
        int res= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++)
            if(arr[i]==0)
                arr[i]=-1;
        for (int right = 0; right < arr.length; right++) {
            presum +=arr[right];
            if(map.containsKey(presum))
                res=Math.max(res,right- map.get(presum));
            if(!map.containsKey(presum))
                map.put(presum,right);
            if (presum==0)
                res = right+1;
        }
        System.out.println(res);

    }
}