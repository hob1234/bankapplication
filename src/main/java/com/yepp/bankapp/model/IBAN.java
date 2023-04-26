package com.yepp.bankapp.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class IBAN {
    private String iban;

    private static int ibanCounter = 0;

    public IBAN() {
        this.iban = generateIban();
    }

    private String generateIban() {
        String ibanStart = "NL00BANK";
        String ibanNum = String.valueOf(ibanCounter);
        ibanCounter++;

        return ibanStart + "0".repeat(10 - ibanNum.length());
    }

    public String getIban() {
        return iban;
    }
}
