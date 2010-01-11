package com.goodworkalan.furnish;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.goodworkalan.test.Service;
import com.goodworkalan.test.ServiceA;

/**
 * Unit test for furnish service loader.
 *
 * @author Alan Gutierrez
 */
public class FurnishTest {
    /** Test the furnish iterator. */
    @Test
    public void furnish() {
        for (Service service : new Furnish<Service>(Service.class)) {
            assertEquals(service.getClass(), ServiceA.class);
        }
    }
}
