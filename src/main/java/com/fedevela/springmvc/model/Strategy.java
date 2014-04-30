package com.fedevela.springmvc.model;

/**
 * Created by Federico on 30/04/14.
 * CREATE TABLE FVELAZQUEZ.STRATEGY
 (
 ID    NUMBER                                  NOT NULL,
 TYPE  VARCHAR2(20)                            NOT NULL,
 NAME  VARCHAR2(50)                            NOT NULL
 )
 TABLESPACE TS_DATA
 LOGGING
 NOCOMPRESS
 NOCACHE
 NOPARALLEL
 NOMONITORING;


 ALTER TABLE FVELAZQUEZ.STRATEGY ADD (
 CONSTRAINT STRATEGY_PK
 PRIMARY KEY
 (ID));


 CREATE SEQUENCE  fvelazquez.strategy_SQ  MINVALUE 1 MAXVALUE
 999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE;
 *
 */
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="strategy", schema = "fvelazquez")
public class Strategy {

    @Id
    @GenericGenerator(name="seq_id", strategy="com.fedevela.springmvc.model.StrategySQGenerator")
    @GeneratedValue(generator="seq_id")
    @Column(name="ID", unique = true, nullable = false)
    private Integer id;
    @Column( name="TYPE", nullable = false)
    private String type;
    @Column(name="NAME", nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
