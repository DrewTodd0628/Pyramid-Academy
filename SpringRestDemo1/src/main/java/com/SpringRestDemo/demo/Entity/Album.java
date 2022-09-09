package com.SpringRestDemo.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="tbl_albums")
public class Album {

    @Id
    @Column(name="a_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int albumID;
    private String artist;
    private String title;

    public Album() {

    }

    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumID=" + albumID +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
