package com.example.newcodercommunity.entity;

import java.util.Date;

public class LoginTicket {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_ticket.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_ticket.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_ticket.ticket
     *
     * @mbg.generated
     */
    private String ticket;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_ticket.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_ticket.expired
     *
     * @mbg.generated
     */
    private Date expired;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_ticket.id
     *
     * @return the value of login_ticket.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_ticket.id
     *
     * @param id the value for login_ticket.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_ticket.user_id
     *
     * @return the value of login_ticket.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_ticket.user_id
     *
     * @param userId the value for login_ticket.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_ticket.ticket
     *
     * @return the value of login_ticket.ticket
     *
     * @mbg.generated
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_ticket.ticket
     *
     * @param ticket the value for login_ticket.ticket
     *
     * @mbg.generated
     */
    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_ticket.status
     *
     * @return the value of login_ticket.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_ticket.status
     *
     * @param status the value for login_ticket.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_ticket.expired
     *
     * @return the value of login_ticket.expired
     *
     * @mbg.generated
     */
    public Date getExpired() {
        return expired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_ticket.expired
     *
     * @param expired the value for login_ticket.expired
     *
     * @mbg.generated
     */
    public void setExpired(Date expired) {
        this.expired = expired;
    }
}