package com.example.demo.untity;

public class Merchant {
    private int merchantId;
    private String merchantName;
    private String merchantIntital;
    private int merchantShow;
    private String merchantCorrelation;

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantIntital() {
        return merchantIntital;
    }

    public void setMerchantIntital(String merchantIntital) {
        this.merchantIntital = merchantIntital;
    }

    public int getMerchantShow() {
        return merchantShow;
    }

    public void setMerchantShow(int merchantShow) {
        this.merchantShow = merchantShow;
    }

    public String getMerchantCorrelation() {
        return merchantCorrelation;
    }

    public void setMerchantCorrelation(String merchantCorrelation) {
        this.merchantCorrelation = merchantCorrelation;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "merchantId=" + merchantId +
                ", merchantName='" + merchantName + '\'' +
                ", merchantIntital='" + merchantIntital + '\'' +
                ", merchantShow=" + merchantShow +
                ", merchantCorrelation='" + merchantCorrelation + '\'' +
                '}';
    }

    public Merchant(int merchantId, String merchantName, String merchantIntital, int merchantShow, String merchantCorrelation) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantIntital = merchantIntital;
        this.merchantShow = merchantShow;
        this.merchantCorrelation = merchantCorrelation;
    }

    public Merchant() {
    }
}
