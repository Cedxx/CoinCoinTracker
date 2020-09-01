package com.exemple.coincointracker;

import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletUnitTest {
    @Test
    public void createWallet() {
        Wallet wallet = new Wallet(42);

        assertEquals(42, wallet.getBalance(), 0.001);
    }

    @Test
    public void depositMoney() throws Exception {
        Wallet wallet = new Wallet(0);

        wallet.deposit(10);

        assertEquals(10, wallet.getBalance(), 0.001);
    }

    @Test
    public void withdrawMoney() throws Exception {
        Wallet wallet = new Wallet(30);

        wallet.withdraw(10);

        assertEquals(20, wallet.getBalance(), 0.001);
    }

    @Test(expected = Exception.class)
    public void withdrawMoneyBelowThreshold() throws Exception {
        Wallet wallet = new Wallet(10);

        wallet.withdraw(15);
    }

    @Test(expected = Exception.class)
    public void depositMoneyAboveCapacity() throws Exception {
        Wallet wallet = new Wallet(10);

        wallet.deposit(25);
    }

    @Test
    public void testWalletContent() throws Exception {
        AuthActivity authActivity = mock(AuthActivity.class);
        when(authActivity.getUserToken()).thenReturn("FakeToken");

        String token = authActivity.getUserToken();
    }

}