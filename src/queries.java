import java.util.*;
public class queries {
    public static void main(String[] args) {
        long a = 243245;
        long b = 243;

        int[][] queries = {
                {2,4,5,3,3},
                {2,1,2,3,3},
                {1,1,3,0,0},
                {1,4,6,0,0}
        };


        String aString = String.valueOf(a);
        String bString = String.valueOf(b);

        System.out.println(aString);
        System.out.println(bString);

        int[] arrA = new int[aString.length()];
        int[] arrB = new int[bString.length()];

        for(int i=0;i<arrA.length;i++) {
            arrA[i] = Integer.parseInt(String.valueOf(aString.charAt(i)));
        }

        for(int i=0;i<arrB.length;i++) {
            arrB[i] = Integer.parseInt(String.valueOf(aString.charAt(i)));
        }

        for(int i=0;i<arrA.length;i++) {
            System.out.print(arrA[i]+" ");
        }

        System.out.println();

        for(int i=0;i<arrB.length;i++) {
            System.out.print(arrB[i]+" ");
        }

        System.out.println();

        System.out.println("Queries = ");



        for(int i=0;i < queries[0].length-1;i++) {
            int listSize = 2;
            int count1 = 0;
            int r=0;

            List<List<Integer>> arrs = new ArrayList<>();
            List<Integer> list = new ArrayList<>();

            int count=0;

            for(int j=0;j < queries[1].length;j++) {
                if(j == 0) {
                    r = queries[i][j];
                } else {
                    //System.out.print(queries[i][j]+" ");
                    if(count < listSize) {
                        list.add(queries[i][j]);
                        count++;
                    } else {
                        count=0;
                        for(int t: list) {
                            System.out.print(t+" ");
                        }
                        System.out.println();
                        arrs.add(list);
                        list.clear();
                    }
                }
                ///System.out.print(queries[i][j]+" ");
                //System.out.println();
/*                if(count != 0  && count1 < r) {
                    list.add(queries[i][j]);
                    count1++;
                }

                count++;


                if(count1 ==r) {
                    count1=0;
                    arrs.add(list);
                    for(int y :list) {
                        System.out.print(y + " ");
                    }
                    System.out.println();
                    list.clear();
                }*/
            }



            //System.out.println();
            //list.clear();
            //System.out.println();

        }



    }
}
