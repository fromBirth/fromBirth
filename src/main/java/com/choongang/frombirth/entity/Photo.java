package com.choongang.frombirth.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "photo")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Integer photoId;

    @Column(name = "record_id")
    private Integer recordId;

    @Column(name = "url")
    private String url;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

}

