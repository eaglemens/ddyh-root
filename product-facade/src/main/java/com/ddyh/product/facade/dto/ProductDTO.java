package com.ddyh.product.facade.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品DTO
 * @author: weihui
 * @Date: 2019/6/10 11:06
 */
public class ProductDTO implements Serializable {

    private Long sku;
    private String name;
    private String brandName;
    //京东价格(普通用户购买价格)
    private Double jdPrice;
    // 状态
    private Integer state;
    // 一级分类
    private Integer cat0;
    private Integer cat1;
    private Integer cat2;
    //京东图片地址
    private String imagePath;
    //图片地址
    private String imgPath;
    // 利润
    private Double profit;
    // 供货价格
    private Double purchasePrice;
    // 会员价格
    private Double memberPrice;
    // 目前数据库存储的等于会员价格（京东接口的零售价格）
    private Double price;
    // 精选推荐(1:是，0：否)
    private Integer recommendType;

    private Integer pointedCargo;

    private Integer experienceCardInvite;
    // 是否9折
    private Integer isHeightDiscount;
    // 自定义排序规则
    private Integer customSort;
    // 折扣率
    private Double discountRate;

    /**
     * 会员折扣率
     */
    private Double memDiscountRate;

    private Date updateTime;

    private Integer jdState;

    //基数 = 成交价-供货价-（成交价-供货价）*13%-成交价*0.6%
    //金额 = 基数 * 50%
    /**
     * 会员分享赚
     */
    private BigDecimal shareProfitPrice;

    public BigDecimal getShareProfitPrice() {
        BigDecimal memberPriceDecimal = new BigDecimal(memberPrice);
        BigDecimal purchasePriceDecimal = new BigDecimal(purchasePrice);
        BigDecimal subVal = memberPriceDecimal.subtract(purchasePriceDecimal);
        BigDecimal memberProfit = subVal.subtract(subVal.multiply(new BigDecimal(0.13))).subtract(memberPriceDecimal.multiply(new BigDecimal(0.006)));
        BigDecimal bigDecimal = memberProfit.multiply(new BigDecimal(0.5)).setScale(2, BigDecimal.ROUND_HALF_UP);
        return bigDecimal.compareTo(BigDecimal.ZERO) < 0 ? BigDecimal.ZERO : bigDecimal;
    }

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(Double jdPrice) {
        this.jdPrice = jdPrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCat0() {
        return cat0;
    }

    public void setCat0(Integer cat0) {
        this.cat0 = cat0;
    }

    public Integer getCat1() {
        return cat1;
    }

    public void setCat1(Integer cat1) {
        this.cat1 = cat1;
    }

    public Integer getCat2() {
        return cat2;
    }

    public void setCat2(Integer cat2) {
        this.cat2 = cat2;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(Double memberPrice) {
        this.memberPrice = memberPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Integer recommendType) {
        this.recommendType = recommendType;
    }

    public Integer getPointedCargo() {
        return pointedCargo;
    }

    public void setPointedCargo(Integer pointedCargo) {
        this.pointedCargo = pointedCargo;
    }

    public Integer getIsHeightDiscount() {
        return isHeightDiscount;
    }

    public void setIsHeightDiscount(Integer isHeightDiscount) {
        this.isHeightDiscount = isHeightDiscount;
    }

    public Integer getCustomSort() {
        return customSort;
    }

    public void setCustomSort(Integer customSort) {
        this.customSort = customSort;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public Double getMemDiscountRate() {
        return memDiscountRate;
    }

    public void setMemDiscountRate(Double memDiscountRate) {
        this.memDiscountRate = memDiscountRate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getJdState() {
        return jdState;
    }

    public void setJdState(Integer jdState) {
        this.jdState = jdState;
    }

    public Integer getExperienceCardInvite() {
        return experienceCardInvite;
    }

    public void setExperienceCardInvite(Integer experienceCardInvite) {
        this.experienceCardInvite = experienceCardInvite;
    }
}
