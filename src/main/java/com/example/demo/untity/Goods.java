package com.example.demo.untity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Goods对象", description = "商品实体类")
public class Goods {
    @ApiModelProperty(value = "商品ID")
    private Integer goodsid;

    @ApiModelProperty(value = "商品名称")
    private String goodsname;

    @ApiModelProperty(value = "商品价格")
    private Double price;

    @ApiModelProperty(value = "商品状态")
    private Boolean state; // 使用 Boolean 来表示状态可能更合适

    // 无参构造函数
    public Goods() {
    }

    // 带参数的构造函数
    public Goods(Integer goodsid, String goodsname, Double price, Boolean state) {
        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.price = price;
        this.state = state;
    }

    // Getter 和 Setter 方法
    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("价格不能为负数");
        }
        this.price = price;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", state=" + state +
                '}';
    }
}