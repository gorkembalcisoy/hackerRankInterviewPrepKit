package warmup.sockmerchant.solution1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Solution {

    static int sockMerchant(int n, int[] ar) {

        List<Integer> list = new ArrayList<>();
        for (int anAr : ar) {
            list.add(anAr);
        }
        Long pairs = 0L;
        Map<Integer, Long> collect = list.stream().collect(groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<Integer, Long> entry : collect.entrySet()) {
            pairs += entry.getValue() / 2;
        }
        return pairs.intValue();

    }

    public static void main(String[] args) {

        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int pairs = sockMerchant(9, ar);
        System.out.println("PAIRS:" + pairs);
    }
}
