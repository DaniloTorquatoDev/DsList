package com.dslist.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_belonging")
@AllArgsConstructor
@NoArgsConstructor
public class Belonging {
    @EmbeddedId
    private BelongingPk id =new BelongingPk();

    private int position;
}
