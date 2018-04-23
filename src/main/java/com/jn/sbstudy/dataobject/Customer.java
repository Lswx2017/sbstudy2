package com.jn.sbstudy.dataobject;

import java.io.Serializable;


public class Customer implements Serializable {


    private static final long serialVersionUID = 5345651932151621573L;


    /** 编号字段 */
    private long id;

    /** 名 */
    private String firstname;

    /** 名 */
    private String lastname;

    protected Customer() {
    }

    public Customer(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
