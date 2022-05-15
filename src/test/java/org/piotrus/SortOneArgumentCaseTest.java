package org.piotrus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SortOneArgumentCaseTest {

    protected Sort sort = new Sort();

    private final List<Integer> list;

    private static final int[] array1 = new int[]{1};
    private static final int[] array2 = new int[]{-1};
    private static final int[] array3 = new int[]{99};
    private static final int[] array4 = new int[]{0};
    private static final int[] array5 = new int[]{-99};

    @Parameterized.Parameters
    public static Collection<Object[]> sort(){
        return Arrays.asList(new Object[][]{
                {Collections.singletonList(array1)},
                {Collections.singletonList(array2)},
                {Collections.singletonList(array3)},
                {Collections.singletonList(array4)},
                {Collections.singletonList(array5)}
        });
    }

    public SortOneArgumentCaseTest(List<Integer> list){
        this.list=list;
    }

    @Test
    public void testOneArgumentCase(){
        assertEquals("Only one value was entered", sort.sort(list));
    }
}