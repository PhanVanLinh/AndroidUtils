package toong.vn.androidutils;

import java.util.Random;

/**
 * Created by PhanVanLinh on 01/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class RandomUtils {

    static int getRandom(int min, int max){
        return new Random().nextInt(max-min+1) + min;
    }

    static int getRandomFrom0(int max){
        return new Random().nextInt(max);
    }

    static int[] getRandoms(int[] ranges, int n, int[] excepts){
        int min = ranges[0];
        int max = ranges[1];

        int[] results = new int[n];
        for(int i = 0; i < n; i++){
            int randomValue = new Random().nextInt(max-min+1) + min;
            if(ArrayUtils.contains(results, randomValue) || ArrayUtils.contains(excepts, randomValue)){
                i--;
            }else{
                results[i] = randomValue;
            }
        }
        return results;
    }
}
