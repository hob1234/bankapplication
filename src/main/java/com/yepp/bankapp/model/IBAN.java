package com.yepp.bankapp.model;

import org.springframework.stereotype.Component;

@Component
public class IBAN {
    private final String IBAN;

    private static int ibanCounter = 0;

    IBAN() {
        this.IBAN = generateIban();
    }

    private String generateIban() {
        String ibanStart = "NL00BANK";
        String ibanNum = String.valueOf(ibanCounter);
        ibanCounter++;

        return ibanStart + "0".repeat(10 - ibanNum.length());
    }

    public String getIBAN() {
        return IBAN;
    }
}
