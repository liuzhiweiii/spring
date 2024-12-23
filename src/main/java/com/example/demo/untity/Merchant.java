package com.example.demo.untity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Merchant对象",description = "商户")
public class Merchant {
    @ApiModelProperty(value = "商户ID")
    private int merchantId;
    @ApiModelProperty(value = "商户名称")
    private String merchantName;
    @ApiModelProperty(value = "商户首字母")
    private String merchantIntital;
    @ApiModelProperty(value = "是否展示该商户")
    private int merchantShow;
    @ApiModelProperty(value = "商户相关信息")
    private String merchantCorrelation;
    @ApiModelProperty(value = "商户LOGO")
    private String merchantLogo;
    @ApiModelProperty(value = "商户专区大图")
    private String merchantPicture;
    @ApiModelProperty(value = "商户排序")
    private int merchantRanking;

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

    public String getMerchantLogo() {
        return merchantLogo;
    }

    public String getMerchantPicture() {
        return merchantPicture;
    }

    public int getMerchantRanking() {
        return merchantRanking;
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

    public void setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
    }

    public void setMerchantPicture(String merchantPicture) {
        this.merchantPicture = merchantPicture;
    }

    public void setMerchantRanking(int merchantRanking) {
        this.merchantRanking = merchantRanking;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "merchantId=" + merchantId +
                ", merchantName='" + merchantName + '\'' +
                ", merchantIntital='" + merchantIntital + '\'' +
                ", merchantShow=" + merchantShow +
                ", merchantCorrelation='" + merchantCorrelation + '\'' +
                ", merchantLogo='" + merchantLogo + '\'' +
                ", merchantPicture='" + merchantPicture + '\'' +
                ", merchantRanking=" + merchantRanking +
                '}';
    }

    public Merchant(int merchantId, String merchantName, String merchantIntital, int merchantShow, String merchantCorrelation, String merchantLogo, String merchantPicture, int merchantRanking) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantIntital = merchantIntital;
        this.merchantShow = merchantShow;
        this.merchantCorrelation = merchantCorrelation;
        this.merchantLogo = merchantLogo;
        this.merchantPicture = merchantPicture;
        this.merchantRanking = merchantRanking;
    }

    public Merchant() {
    }
}
