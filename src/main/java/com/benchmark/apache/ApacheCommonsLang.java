package com.benchmark.apache;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author ZakariaEMI
 * How to use some methods of Apache Common Lang
 */
public final class ApacheCommonsLang {

    /**
     * Manipulate Strings by using some methods
     */
    public static void manipulateStrings() {
        // How to initialize an empty string
        String lEmptyString = StringUtils.EMPTY;

        // Check if String is blank
        StringUtils.isBlank(" ");

        // Check if String is empty
        StringUtils.isEmpty("");

        // Check if String is lowercase
        StringUtils.isAllLowerCase("abd");

        // Check if String is uppercase
        StringUtils.isAllUpperCase("ABC");

        // Check if String is mixed case (lowercase and uppercase)
        StringUtils.isMixedCase("abC");

        // Check if String is alpha
        StringUtils.isAlpha("abc");

        // Check if String is alphanumeric
        StringUtils.isAlphanumeric("abc123");

        // Compare two strings
        String lFirstName = "First";
        String lSecondName = "Second";
        StringUtils.equalsIgnoreCase(lFirstName, lSecondName);
    }

    /**
     * Manipulate Numbers by using some methods
     */
    public static void manipulateNumbers() {
        // Compare two numbers
        NumberUtils.compare(1L, 1L);

        // Get the max element in an array
        int[] array = {101, 6, 22, 12};
        NumberUtils.max(array);
    }

    /**
     * Manipulate Arrays by using some methods
     */
    public static void manipulateArrays() {
        // Transform an array to String
        int[] array = {101, 6, 22, 12};
        ArrayUtils.toString(array);

        // Transform array to Map
        String[][] arrayStrings = {{"1", "one"}, {"2", "two"}, {"3", "three"}};
        ArrayUtils.toMap(arrayStrings);
    }
}
