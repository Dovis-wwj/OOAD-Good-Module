package com.ooad.good.mapper;

import com.ooad.good.model.po.Goods_spuPo;

public interface Goods_spuPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_spu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_spu
     *
     * @mbg.generated
     */
    int insert(Goods_spuPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_spu
     *
     * @mbg.generated
     */
    int insertSelective(Goods_spuPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_spu
     *
     * @mbg.generated
     */
    Goods_spuPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_spu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Goods_spuPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_spu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Goods_spuPo record);
}