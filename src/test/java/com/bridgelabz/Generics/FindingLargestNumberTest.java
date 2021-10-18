package com.bridgelabz.Generics;
import org.junit.Assert;
//import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindingLargestNumberTest extends FindingLargestNumber {
    @Test
    void testlargestfirstvalueshouldlarge () {
        FindingLargestNumber fln=new FindingLargestNumber();
        fln.intlargest();
        org.junit.Assert.assertEquals(a,a>b&&a>c);
        System.out.println("test is done");

    }
    @Test
    void testfloatlargest(){
        FindingLargestNumber fln=new FindingLargestNumber();
        fln.floatlargest();
        org.junit.Assert.assertEquals(a,a>b&&a>c);
        System.out.println("test is done");
    }
    @Test
    void stringlargest(){
        FindingLargestNumber fln=new FindingLargestNumber();
        fln.floatlargest();
        org.junit.Assert.assertEquals(a,a>b&&a>c);
        System.out.println("test is done");
    }


}