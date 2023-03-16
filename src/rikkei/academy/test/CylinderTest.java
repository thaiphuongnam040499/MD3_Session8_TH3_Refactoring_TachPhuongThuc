package rikkei.academy.test;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.Cylinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(0,0)")
    void testGetVolume0And0(){
        int radius = 0;
        int height = 0;
        double expented =0;
        double result = Cylinder.getVolume(radius,height);
        assertEquals(expented,result);
    }
    @Test
    @DisplayName("Testing getVolume(1,2)")
    void testGetVolume1And2(){
        int radius = 1;
        int height = 2;
        double expented =18.84955592153876;
        double result = Cylinder.getVolume(radius,height);
        assertEquals(expented,result);
    }
}
