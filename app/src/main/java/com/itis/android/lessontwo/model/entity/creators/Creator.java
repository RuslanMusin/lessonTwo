package com.itis.android.lessontwo.model.entity.creators;

import com.google.gson.annotations.SerializedName;
import com.itis.android.lessontwo.model.general.Image;
import com.itis.android.lessontwo.model.general.ListItem;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by valera071998@gamil.com on 02.03.2018.
 */

public class Creator extends RealmObject implements ListItem {

    @PrimaryKey
    @SerializedName("id")
    private Long id;
    
    @SerializedName("firstName")
    private String firstName;
    
    @SerializedName("middleName")
    private String middleName;
    
    @SerializedName("lastName")
    private String lastName;
    
    @SerializedName("suffix")
    private String suffix;
    
    @SerializedName("fullName")
    private String fullName;
    
    @SerializedName("modified")
    private String modified;
    
    @SerializedName("resourceURI")
    private String resourceURI;
    
    @SerializedName("thumbnail")
    private Image thumbnail;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return getFullName();
    }

    @Override
    public String getDescription() {
        return getFirstName(); // there is no description of creator
    }

    @Override
    public Image getImage() {
        return getThumbnail();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }
}
