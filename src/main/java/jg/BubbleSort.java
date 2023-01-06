package jg;

import java.util.Collections;
import java.util.List;

public class BubbleSort<T extends Number & Comparable<? super T>> {
    public void sort(List<T> input) throws RuntimeException{
        if(input == null){
            throw new RuntimeException();
        }
        for(int i = 0; i < input.size(); i++){
            for(int j = 0; j < input.size() - 1; j++){
                if(input.get(j) == null){
                    input.remove(j);
                    continue;
                }
                if(input.get(j).compareTo(input.get(j + 1)) > 0){
                    Collections.swap(input, j, j + 1);
                }
            }
        }

    }
}
