package org.piotrus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SortMoreThanTenArgumentsCaseTest {
    protected Sort sort = new Sort();

    @Parameterized.Parameters
    public static Collection<Integer[][]> sort(){
        return Arrays.asList(new Integer[][][] {
                {{1,2,3,4,5,6,7,8,9,10,0}},
                {{4,2,7,10,23,6,5,7,8,3,-100,-20}},
                {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}},
                {{-10,-23,50,3,500,2305,20,30,-34,5,0,23,56}}
        });
    }

    private final Integer[] array;

    public SortMoreThanTenArgumentsCaseTest(Integer[] array){
        this.array=array;
    }

    @Test
    public void testMoreThanTenArgumentsCase(){
        assertEquals("Number of values has exceeded allowable quantity. Values cannot be sorted.",sort.sort(Arrays.asList(array)));
    }
}

