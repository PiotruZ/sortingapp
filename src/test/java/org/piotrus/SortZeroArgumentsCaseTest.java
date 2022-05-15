package org.piotrus;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortZeroArgumentsCaseTest {
    protected Sort sort = new Sort();
    private final List<Integer> list = new ArrayList<>();

    @Test
    public void testZeroArgumentsCase(){
        assertEquals("No values were entered.",sort.sort(list));
    }
}
