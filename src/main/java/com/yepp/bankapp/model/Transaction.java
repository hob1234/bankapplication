package com.yepp.bankapp.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

//@Component
@Entity
public class Transaction {

//    id!: number;
//    amount!: number;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Embedded
    private CATEGORY_TYPE category;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="iban",column=@Column(name="sender_iban")),
//            })
    private Integer senderId;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="iban",column=@Column(name="receiver_iban"))
//    })
    private Integer receiverId;

    private float amount;
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReceiver() {
        return receiverId;
    }

    public float getAmount() {
        return amount;
    }

    public Integer getSender() {
        return senderId;
    }
}
