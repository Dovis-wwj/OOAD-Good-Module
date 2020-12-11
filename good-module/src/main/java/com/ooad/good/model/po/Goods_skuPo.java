package com.ooad.good.model.po;

import java.time.LocalDateTime;

public class Goods_skuPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.goods_spu_id
     *
     * @mbg.generated
     */
    private Long goodsSpuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.sku_sn
     *
     * @mbg.generated
     */
    private String skuSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.original_price
     *
     * @mbg.generated
     */
    private Long originalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.configuration
     *
     * @mbg.generated
     */
    private String configuration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.weight
     *
     * @mbg.generated
     */
    private Long weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.image_url
     *
     * @mbg.generated
     */
    private String imageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.inventory
     *
     * @mbg.generated
     */
    private Integer inventory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.detail
     *
     * @mbg.generated
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.disabled
     *
     * @mbg.generated
     */
    private Byte disabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.gmt_create
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.gmt_modified
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.state
     *
     * @mbg.generated
     */
    private Byte state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.id
     *
     * @return the value of goods_sku.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.id
     *
     * @param id the value for goods_sku.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.goods_spu_id
     *
     * @return the value of goods_sku.goods_spu_id
     *
     * @mbg.generated
     */
    public Long getGoodsSpuId() {
        return goodsSpuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.goods_spu_id
     *
     * @param goodsSpuId the value for goods_sku.goods_spu_id
     *
     * @mbg.generated
     */
    public void setGoodsSpuId(Long goodsSpuId) {
        this.goodsSpuId = goodsSpuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.sku_sn
     *
     * @return the value of goods_sku.sku_sn
     *
     * @mbg.generated
     */
    public String getSkuSn() {
        return skuSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.sku_sn
     *
     * @param skuSn the value for goods_sku.sku_sn
     *
     * @mbg.generated
     */
    public void setSkuSn(String skuSn) {
        this.skuSn = skuSn == null ? null : skuSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.name
     *
     * @return the value of goods_sku.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.name
     *
     * @param name the value for goods_sku.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.original_price
     *
     * @return the value of goods_sku.original_price
     *
     * @mbg.generated
     */
    public Long getOriginalPrice() {
        return originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.original_price
     *
     * @param originalPrice the value for goods_sku.original_price
     *
     * @mbg.generated
     */
    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.configuration
     *
     * @return the value of goods_sku.configuration
     *
     * @mbg.generated
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.configuration
     *
     * @param configuration the value for goods_sku.configuration
     *
     * @mbg.generated
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration == null ? null : configuration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.weight
     *
     * @return the value of goods_sku.weight
     *
     * @mbg.generated
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.weight
     *
     * @param weight the value for goods_sku.weight
     *
     * @mbg.generated
     */
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.image_url
     *
     * @return the value of goods_sku.image_url
     *
     * @mbg.generated
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.image_url
     *
     * @param imageUrl the value for goods_sku.image_url
     *
     * @mbg.generated
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.inventory
     *
     * @return the value of goods_sku.inventory
     *
     * @mbg.generated
     */
    public Integer getInventory() {
        return inventory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.inventory
     *
     * @param inventory the value for goods_sku.inventory
     *
     * @mbg.generated
     */
    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.detail
     *
     * @return the value of goods_sku.detail
     *
     * @mbg.generated
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.detail
     *
     * @param detail the value for goods_sku.detail
     *
     * @mbg.generated
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.disabled
     *
     * @return the value of goods_sku.disabled
     *
     * @mbg.generated
     */
    public Byte getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.disabled
     *
     * @param disabled the value for goods_sku.disabled
     *
     * @mbg.generated
     */
    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.gmt_create
     *
     * @return the value of goods_sku.gmt_create
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.gmt_create
     *
     * @param gmtCreate the value for goods_sku.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.gmt_modified
     *
     * @return the value of goods_sku.gmt_modified
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.gmt_modified
     *
     * @param gmtModified the value for goods_sku.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.state
     *
     * @return the value of goods_sku.state
     *
     * @mbg.generated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.state
     *
     * @param state the value for goods_sku.state
     *
     * @mbg.generated
     */
    public void setState(Byte state) {
        this.state = state;
    }
}