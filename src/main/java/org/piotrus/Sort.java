package org.piotrus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort {
    public String sort(List<Integer> list){

        if(list.size()==1){
            return "Only one value was entered";
        }
        else if (list.size()>10){
            return "Number of values has exceeded allowable quantity. Values cannot be sorted.";
        }
        else if (list.size()>0){
            Collections.sort(list);
            return list.toString();
        }
        else
            return "No values were entered.";
    }
}
