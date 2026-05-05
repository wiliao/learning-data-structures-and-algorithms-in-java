package net.datastructures.chapter01;

/**
 * Demonstrates core Java fundamentals covered in Chapter 1 (Java Primer).
 *
 * <p>This class showcases variables, control flow, arrays, String APIs, exception
 * handling, method overloading, and the distinction between primitive and reference
 * types — all essential foundations for data structures and algorithms.</p>
 *
 * @see <a href="https://www.wiley.com/en-br/Data+Structures+and+Algorithms+in+Java%2C+6th+Edition-p-9781118771334">DSA in Java, 6th Ed., Ch. 1</a>
 */
public final class JavaPrimerDemo {

    private JavaPrimerDemo() {
        // Utility class — prevent instantiation
    }

    // ──────────────────────────────────────────────
    // 1. Primitive types, operators, and type conversion
    // ──────────────────────────────────────────────

    /**
     * Demonstrates Java primitive types, arithmetic operators, and type casting.
     *
     * @return a formatted string summarising each operation and its result
     */
    public static String demonstratePrimitives() {
        int    a = 42;
        long   b = 7_000_000_000L;       // Underscores for readability
        double c = 3.14159;
        char   d = '\u03A9';             // Unicode: Omega (Ω)
        boolean e = (a > 10) && (b < 10_000_000_000L);

        // Explicit narrowing cast
        int narrowed = (int) b;

        return """
            Primitives demo:
              int     a      = %d
              long    b      = %d
              double  c      = %.5f
              char    d      = %c  (Unicode %04X)
              boolean e      = %b
              (int) b        = %d
            """.formatted(a, b, c, d, (int) d, e, narrowed);
    }

    // ──────────────────────────────────────────────
    // 2. Control flow — conditionals & loops
    // ──────────────────────────────────────────────

    /**
     * Returns the factorial of {@code n} using an iterative loop.
     *
     * @param n a non-negative integer
     * @return n! (factorial of n)
     * @throws IllegalArgumentException if {@code n < 0}
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative: " + n);
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Classifies an integer using a switch expression (Java 14+).
     *
     * @param value the integer to classify
     * @return "negative", "zero", or "positive"
     */
    public static String classifyInteger(int value) {
        return switch (Integer.signum(value)) {
            case -1 -> "negative";
            case 0  -> "zero";
            case 1  -> "positive";
            default -> throw new AssertionError("unreachable");
        };
    }

    // ──────────────────────────────────────────────
    // 3. Arrays
    // ──────────────────────────────────────────────

    /**
     * Computes the sum of an array of integers.
     *
     * @param values the input array (may be empty)
     * @return the sum of all elements; 0 if the array is empty
     */
    public static int sumArray(int[] values) {
        int total = 0;
        for (int v : values) {
            total += v;
        }
        return total;
    }

    /**
     * Reverses an array in place.
     *
     * @param array the array to reverse (modified in place)
     */
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp  = array[left];
            array[left]  = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // ──────────────────────────────────────────────
    // 4. String APIs & StringBuilder
    // ──────────────────────────────────────────────

    /**
     * Builds a comma-separated string from the given tokens.
     *
     * <p>Uses {@link StringBuilder} for efficient concatenation — a critical
     * pattern when constructing strings in loops (see Ch. 1 amortised analysis
     * of StringBuilder vs. String concatenation).</p>
     *
     * @param tokens the tokens to join
     * @return a single string with tokens separated by ", "
     */
    public static String joinWithComma(String... tokens) {
        if (tokens == null || tokens.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tokens.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(tokens[i]);
        }
        return sb.toString();
    }

    /**
     * Checks whether a string is a palindrome (case-insensitive, ignores non-letters).
     *
     * @param s the input string
     * @return {@code true} if the string reads the same forwards and backwards
     */
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        var cleaned = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return cleaned.contentEquals(new StringBuilder(cleaned).reverse());
    }

    // ──────────────────────────────────────────────
    // 5. Exception handling
    // ──────────────────────────────────────────────

    /**
     * Safely parses an integer from a string, returning a fallback on failure.
     *
     * @param value    the string to parse
     * @param fallback the value to return if parsing fails
     * @return the parsed integer, or {@code fallback}
     */
    public static int parseIntSafely(String value, int fallback) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return fallback;
        }
    }

    /**
     * Demonstrates try-catch-finally with a forced arithmetic exception.
     *
     * @return a message describing what happened
     */
    public static String demonstrateExceptionHandling() {
        String result = null;
        try {
            int division = 10 / 0;        // throws ArithmeticException
            result = "Success: " + division;
        } catch (ArithmeticException e) {
            result = "Caught ArithmeticException: " + e.getMessage();
        } finally {
            result = result + " (finally block always executes)";
        }
        return result;
    }

    // ──────────────────────────────────────────────
    // 6. Method overloading
    // ──────────────────────────────────────────────

    /**
     * Returns the larger of two {@code int} values.
     * @see #max(double, double)
     */
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    /**
     * Returns the larger of two {@code double} values.
     * @see #max(int, int)
     */
    public static double max(double a, double b) {
        return (a >= b) ? a : b;
    }

    /**
     * Returns the larger of three {@code int} values (overloaded arity).
     * @see #max(int, int)
     */
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // ──────────────────────────────────────────────
    // Entry point
    // ──────────────────────────────────────────────

    /**
     * Runs all demos and prints results to standard output.
     *
     * @param args command-line arguments (ignored here; see the demo for varargs)
     */
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════");
        System.out.println("  Chapter 1 — Java Primer Demo");
        System.out.println("═══════════════════════════════════════════\n");

        // Primitive types & operators
        System.out.println(demonstratePrimitives());
        System.out.println();

        // Control flow & loops
        System.out.println("Factorials:");
        for (int n = 0; n <= 10; n++) {
            System.out.printf("  %2d! = %d%n", n, factorial(n));
        }
        System.out.println();

        // Switch expressions
        System.out.println("Integer classification:");
        for (int v : new int[]{-5, 0, 3}) {
            System.out.printf("  %d is %s%n", v, classifyInteger(v));
        }
        System.out.println();

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Arrays:");
        System.out.println("  Original : " + joinWithComma("1", "2", "3", "4", "5"));
        System.out.println("  Sum      : " + sumArray(numbers));
        reverseArray(numbers);
        System.out.println("  Reversed : " + joinWithComma("5", "4", "3", "2", "1"));
        System.out.println();

        // Strings
        System.out.println("String APIs:");
        System.out.println("  Joined        : " + joinWithComma("Java", "Primer", "Demo"));
        System.out.println("  Is palindrome?");
        System.out.println("    \"A man, a plan, a canal: Panama\" → " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("    \"hello\"                        → " + isPalindrome("hello"));
        System.out.println();

        // Exception handling
        System.out.println("Exception handling:");
        System.out.println("  " + demonstrateExceptionHandling());
        System.out.println("  parseSafely(\"42\", 0)    = " + parseIntSafely("42", 0));
        System.out.println("  parseSafely(\"abc\", -1)  = " + parseIntSafely("abc", -1));
        System.out.println();

        // Method overloading
        System.out.println("Method overloading:");
        System.out.println("  max(3, 7)          = " + max(3, 7));
        System.out.println("  max(3.14, 2.71)    = " + max(3.14, 2.71));
        System.out.println("  max(5, 9, 2)       = " + max(5, 9, 2));
        System.out.println();

        System.out.println("═══════════════════════════════════════════");
    }
}
