package com.ooad.good.mapper;

import com.ooad.good.model.po.Presale_activityPo;

public interface Presale_activityPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int insert(Presale_activityPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int insertSelective(Presale_activityPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    Presale_activityPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Presale_activityPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Presale_activityPo record);
}