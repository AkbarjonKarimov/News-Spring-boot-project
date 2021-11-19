package com.spring.p1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 500, columnDefinition = "text")
    private String content;
    @CreationTimestamp
    private Timestamp date;
    @ManyToOne
    private Users users;
    @OneToOne
    private NewsStates newsStates;
}
