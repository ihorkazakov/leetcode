package com.leetcode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinimumInRotatedSortedArrayTest {

    private FindMinimumInRotatedSortedArray underTest;

    @BeforeEach
    void setUp() {
        underTest = new FindMinimumInRotatedSortedArray();
    }

    @Test
    void shouldReturnOneTest() {
        int[] nums = {3, 4, 5, 1, 2};
        int actual = underTest.findMin(nums);
        assertEquals(1, actual);
    }

    @Test
    void shouldReturnElevenTest() {
        int[] nums = {11,13,15,17};
        int actual = underTest.findMin(nums);
        assertEquals(11, actual);
    }
}
