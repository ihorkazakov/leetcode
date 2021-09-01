package com.leetcode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private TwoSum underTest;

    @BeforeEach
    void setUp() {
        underTest = new TwoSum();
    }

    @Test
    void twoSumTest() {
        int[] nums = {2, 7, 11, 15};
        int[] ints = underTest.twoSum(nums, 9);
        assertArrayEquals(new int[]{0, 1}, ints);
    }
}
