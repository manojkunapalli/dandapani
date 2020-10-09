public class posneg {
    public static void main(String[] args) {
        int[] pode = {0,1,0,1,1,0,1,0,1,1,0,0,1,0,1,1,0,1,0,1,0,0,1,1,0,1,0,1,1,0,1,0,0,1,1,1,0};

        int sizeOfPode = pode.length;
        System.out.println("size = "+sizeOfPode);

        int left = 0;
        int right = sizeOfPode-1;
        while(left < right ) {
            if(pode[left] > pode[right]) {
                int temp = pode[left];
                pode[left] = pode[right];
                pode[right] = temp;
            } else if(pode[right] == pode[left]) {
                if(pode[right] < 1 && pode[left] < 1) {
                    left++;
                    continue;
                } else {
                    right--;
                    continue;
                }
            }
            left++;
            right--;
        }

        for(int t: pode) {
            System.out.print(t+" ");
        }
    }
}
