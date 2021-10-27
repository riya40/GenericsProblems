package com.bridgelabz.Generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FindingLargestNumberTest {
    FindingLargestNumber fln=new FindingLargestNumber();
    @Test
    void testlargestfirstvalueshouldlarge () {
        FindingLargestNumber fln=new FindingLargestNumber();
        int a = fln.intlargest();
        Assertions.assertEquals(a,5);
        System.out.println("test is done");

    }
    @Test
    void testfloatlargest(){
        FindingLargestNumber fln=new FindingLargestNumber();
        float result=fln.floatlargest();
        Assertions.assertEquals(result,3.5);
        System.out.println("test is done");
    }


}