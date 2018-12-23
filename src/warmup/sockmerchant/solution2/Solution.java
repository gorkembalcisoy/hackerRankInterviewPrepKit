package warmup.sockmerchant.solution2;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static int sockMerchant(int n, int[] ar) {

        int pairs = 0;
        List<Integer> list = new ArrayList<>();
        for (int anAr : ar) {
            list.add(anAr);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    pairs++;
                    list.remove(j);
                    break;
                }
            }
        }
        return pairs;

    }

    public static void main(String[] args) {

        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int pairs = sockMerchant(9, ar);
        System.out.println("PAIRS:" + pairs);
    }
}
