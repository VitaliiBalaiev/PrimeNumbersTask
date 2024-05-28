package primenumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeCheckerTest {

    private PrimeChecker checker;

    @BeforeEach
    void setUp() {
        checker = new PrimeChecker();
    }

    @Test
    void isPrimeNumber_prime() {
        boolean prime = checker.isPrimeNumber(67);
        Assertions.assertTrue(prime);

    }

    @Test
    void isPrimeNumber_not_prime() {
        boolean notPrime = checker.isPrimeNumber(89);
        Assertions.assertTrue(notPrime);
    }

    @Test
    void isPrimeNumber_with_two() {
        boolean prime = checker.isPrimeNumber(2);
        Assertions.assertTrue(prime);
    }

    @Test
    void isValidNumber_with_one() {
        boolean prime = checker.isPrimeNumber(1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> checker.isValidNumber("1"));
    }

    @Test
    void isValidNumber_with_valid_prime() {
        boolean prime = checker.isValidNumber("5");
        Assertions.assertTrue(prime);
    }

    @Test
    void isValidNumber_with_valid_non_prime() {
        boolean prime = checker.isValidNumber("4");
        Assertions.assertFalse(prime);
    }

    @Test
    void isValidNumber_with_negative_number() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> checker.isValidNumber("-1"));
    }

    @Test
    void isValidNumber_with_non_numeric() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> checker.isValidNumber("QWERTYabc"));
    }

    @Test
    void isValidNumber_with_out_of_range_number() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> checker.isValidNumber("1000000000001"));
    }




}