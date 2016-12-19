package john.com.litepaldemo.bean;


import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangdekun on 2016/12/19.
 */

public class Album extends DataSupport {
    @Column(unique = true,defaultValue = "unkown")
    private String name;
    private float price;
    @Column(ignore = true)
    private byte[] cover;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;
    private List<Song> songs = new ArrayList<Song>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
