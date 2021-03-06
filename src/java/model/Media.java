/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Vu Ngoc Thinh
 */
public class Media {

    private int id;
    private String name, icon, link;

    public Media() {
    }

    public Media(int id, String name, String icon, String link) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Media{" + "id=" + id + ", name=" + name + ", icon=" + icon + ", link=" + link + "}";
    }
    

   
}
