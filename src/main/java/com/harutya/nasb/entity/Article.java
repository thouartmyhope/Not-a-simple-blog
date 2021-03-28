package com.harutya.nasb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ARTICLE")
@Entity
@Data
public class Article {

    @Id
    long id;

}
