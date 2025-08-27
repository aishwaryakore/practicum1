package edu.iu.p466.prime_service.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeServiceTest {

    PrimeService primeService = new PrimeService();

    @Test
    void _45isNotPrime() {
        int n = 45;
        boolean expected = false;
        boolean actual = primeService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void _13isPrime() {
        int n = 45;
        boolean expected = false;
        boolean actual = primeService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void _4534566776isNotPrime() {
        int n = 45;
        boolean expected = false;
        boolean actual = primeService.isPrime(n);
        assertEquals(expected, actual);
    }
}