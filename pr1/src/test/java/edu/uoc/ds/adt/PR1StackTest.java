package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1StackTest {

    PR1Stack pr1q;

    private void fillStack() {
        int x;
        for (int i=0; i<15; i++){
            x = PR1Function.function(i);
            pr1q.push(x);
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1Stack();

        assertNotNull(this.pr1q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr1q.CAPACITY, this.pr1q.getStack().size());
        Assert.assertEquals(4, pr1q.pop(), 0);
        Assert.assertEquals(1, pr1q.pop(), 0);
        Assert.assertEquals(0, pr1q.pop(), 0);
        Assert.assertEquals(9, pr1q.pop(), 0);
        Assert.assertEquals(4, pr1q.pop(), 0);
        Assert.assertEquals(1, pr1q.pop(), 0);
        Assert.assertEquals(0, pr1q.pop(), 0);
        Assert.assertEquals(9, pr1q.pop(), 0);
        Assert.assertEquals(4, pr1q.pop(), 0);
        Assert.assertEquals(1, pr1q.pop(), 0);
        Assert.assertEquals(0, pr1q.pop(), 0);
        Assert.assertEquals(9, pr1q.pop(), 0);
        Assert.assertEquals(4, pr1q.pop(), 0);
        Assert.assertEquals(1, pr1q.pop(), 0);
        Assert.assertEquals(0, pr1q.pop(), 0);
        assertEquals(0, this.pr1q.getStack().size());
    }
}
