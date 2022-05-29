package com.example.newcodercommunity.mapper;

import com.example.newcodercommunity.entity.LoginTicket;
import com.example.newcodercommunity.entity.LoginTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginTicketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    long countByExample(LoginTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    int deleteByExample(LoginTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    int insert(LoginTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    int insertSelective(LoginTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    List<LoginTicket> selectByExample(LoginTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    LoginTicket selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LoginTicket record, @Param("example") LoginTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LoginTicket record, @Param("example") LoginTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LoginTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_ticket
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LoginTicket record);
}