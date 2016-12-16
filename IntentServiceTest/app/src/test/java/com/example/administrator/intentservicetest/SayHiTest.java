package com.example.administrator.intentservicetest;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2016/12/8 0008.
 */

public class SayHiTest extends TestCase {

    @Test
    public void testSayHi() {
        SayHi sh = new SayHi();
        assertTrue(sh.sayHi("adb", "def").equalsIgnoreCase("abd def"));
    }
}
