package com.taotao.mapper;

import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemCatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    int countByExample(TbItemCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    int deleteByExample(TbItemCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    int insert(TbItemCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    int insertSelective(TbItemCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    List<TbItemCat> selectByExample(TbItemCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    TbItemCat selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    int updateByExample(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    int updateByPrimaryKeySelective(TbItemCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * @mbggenerated Mon Nov 12 15:35:12 CST 2018
     */
    int updateByPrimaryKey(TbItemCat record);
}