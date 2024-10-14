package com.csc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZipperTest {

Zipper zipper;

@BeforeEach
void setUp() {
    zipper = new Zipper();
}

@Test
void testZipWithEqualSizeLists() {
    List<Integer> nums1 = List.of(1, 3, 5, 7);
    List<Integer> nums2 = List.of(2, 4, 6, 8);
    List<Integer> result = Zipper.zip(nums1, nums2);
    assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), result);
}

@Test
void testZipWithUnequalSizeLists() {
    List<String> colors1 = List.of("Red", "Green", "Blue");
    List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
    List<String> result = Zipper.zip(colors1, colors2);
    assertEquals(List.of("Red", "White", "Green", "Black", "Blue", "Orange", "Pink"), result);
}

@Test
void testZipWithEmptyList() {
    List<String> colors1 = List.of();
    List<String> colors2 = List.of("White", "Black", "Orange");
    List<String> result = Zipper.zip(colors1, colors2);
    assertEquals(List.of("White", "Black", "Orange"), result);
}


}
