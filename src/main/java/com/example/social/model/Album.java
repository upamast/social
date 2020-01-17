package com.example.social.model;

public class Album {

    private String id;
    private String name;
    private String coverPhotoUri;
    private String createdBy;
    private String dateCreated;

    public Album() {

    }

    public Album(String id, String name, String coverPhotoUri, String createdBy, String dateCreated) {
        this.id = id;
        this.name = name;
        this.coverPhotoUri = coverPhotoUri;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoUri() {
        return coverPhotoUri;
    }

    public void setCoverPhotoUri(String coverPhotoUri) {
        this.coverPhotoUri = coverPhotoUri;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
