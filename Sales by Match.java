import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pairs = 0;
        Set<Integer> unmatched = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            int ci = in.nextInt();
            if (unmatched.contains(ci)) {
                unmatched.remove(ci);
                ++pairs;
            }
            else {
                unmatched.add(ci);
            }
        }
        System.out.println(pairs);
    }
}
