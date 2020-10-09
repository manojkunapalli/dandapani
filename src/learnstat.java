import java.util.*;
public class learnstat {
    public static void main(String[] args) {
        HashMap<String,Integer> hmap = new HashMap<String, Integer>();
        String[] arr = {"c","l","e","m","e","n","t","i","s","a","c","a","p"};


        for(int i=0;i<arr.length;i++) {
            Integer count = hmap.get(arr[i]);

            if (hmap.get(arr[i]) == null) {
                hmap.put(arr[i], 1);
            } else{
                hmap.put(arr[i], ++count);
            }
        }

        int left = 0;
        int right = arr.length-1;

        int begin = left;
        int end = right;

        while((left != arr.length) && (right != -1)) {
            if(hmap.get(arr[left]) >1) {
                left++;
                begin = left;
            } else if (hmap.get(arr[right]) >1){
                right--;
                end = right;
            } else {
                left++;
                right--;
                begin = left;
                end = right;
            }
        }
        System.out.println("begin = "+begin+"end = "+end);

    }

}
/*
         List<List<Integer>> mainList = new ArrayList<>();

          int targetSum = 0;
          for(int currNum=0;currNum<nums.length;currNum++) {
                int left = currNum+1;
                int right = nums.length-1;
                while( (right-left) != 1) {
                    if(left != (nums.length) && right != -1) {
                    if(sumOfThreeNum(nums[currNum],nums[left],nums[right]) < targetSum) {
                        if(left != (nums.length-1)) {
                            left++;
                        } else {
                            break;
                        }
                    } else if(sumOfThreeNum(nums[currNum],nums[left],nums[right]) > targetSum) {
                        if(right != 0) {
                            right--;
                        } else {
                            break;
                        }
                    }
                    else {
                        List<Integer> sumList = new ArrayList<>();
                        sumList.add(nums[currNum]);
                        sumList.add(nums[left]);
                        sumList.add(nums[right]);
                        mainList.add(sumList);
                        left++;
                        right--;
                        if(sumOfThreeNum(nums[currNum],nums[left],nums[right]) == targetSum) {
                            sumList.add(nums[currNum]);
                            sumList.add(nums[left]);
                            sumList.add(nums[right]);
                            mainList.add(sumList);
                        }
                    }} else {break;}
                }
            }
        return mainList;
*             int[] arr = new int[]{-1,0,1,2,-1,-4};//{-8,-6,1,2,3,5,6,12};
            int targetSum = 0;

            for(int currNum=0;currNum<arr.length;currNum++) {
                int left = currNum+1;
                int right = arr.length-1;
                while( (right-left) != 1) {
                    if(left != (arr.length) && right != -1) {
                    if(sumOfThreeNum(arr[currNum],arr[left],arr[right]) < targetSum) {
                        //System.out.println(arr[currNum] + " " + arr[left] + " " + arr[right] );
                        if(left != (arr.length-1)) {
                            left++;
                        }
                        else {
                            break;
                        }
                    } else if(sumOfThreeNum(arr[currNum],arr[left],arr[right]) > targetSum) {
                        //System.out.println(arr[currNum] + " " + arr[left] + " " + arr[right] );
                        if(right != 0) {
                            right--;
                        } else {
                            break;
                        }
                    } else if (sumOfThreeNum(arr[currNum],arr[left],arr[right]) == targetSum){
                        System.out.println(arr[currNum] + " " + arr[left] + " " + arr[right] );
                        //if (left != (arr.length-1) && right != 0) {
                        left++;
                        right--;
                        if(sumOfThreeNum(arr[currNum],arr[left],arr[right]) == targetSum) {
                            System.out.println(arr[currNum] + " " + arr[left] + " " + arr[right] );
                        }
                    }} else {break;}
                }
            }*/