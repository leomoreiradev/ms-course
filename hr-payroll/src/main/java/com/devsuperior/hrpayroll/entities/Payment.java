package com.devsuperior.hrpayroll.entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Payment implements Serializable {

    private static final long serialVersionUID = 1l;

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    //Dado calculado "como se existisse um atributo com o nome de Total"
    public double getTotal() {
        return days * dailyIncome;
    }


}
