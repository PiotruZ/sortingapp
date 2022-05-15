package org.piotrus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SortTenArgumentsCaseTest {

    protected Sort sort = new Sort();

    @Parameterized.Parameters
    public static Collection<Integer[][]> sort(){
        return Arrays.asList(new Integer[][][] {
                {{6,4,5,10,9,2,8,3,7,1},{1,2,3,4,5,6,7,8,9,10}},
                {{100,93,42,57,12},{12,42,57,93,100}},
                {{65,0,17,6,17},{0,6,17,17,65}},
                {{-10,10,23,-24,1,0},{-24,-10,0,1,10,23}},
        });
    }

    private final Integer[] array;
    private final Integer[] sortedArray;

    public SortTenArgumentsCaseTest(Integer[] array, Integer[] sortedArray){
        this.array=array;
        this.sortedArray=sortedArray;
    }

    @Test
    public void testTenArgumentsCase(){
        assertEquals(Arrays.toString(sortedArray), sort.sort(Arrays.asList(array)));
    }
}