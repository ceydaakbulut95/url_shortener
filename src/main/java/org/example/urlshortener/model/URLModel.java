package org.example.urlshortener.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name="urls")
public class URLModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String shortUrl;
    @Column(nullable = false)
    private String longUrl;
    @Column(nullable = false)
    private LocalDateTime createdTime;

    public URLModel(){} //for JPA without argument

    public URLModel(String shortUrl, String longUrl, LocalDateTime createdTime) {
        this.id = id;
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
        this.createdTime = createdTime;
    }

    public Long getId() {
        return id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

}
