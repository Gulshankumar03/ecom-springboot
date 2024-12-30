package com.gulshan.ecom.dto;

public class ImageDto {
    private Long id;
    private String fileName;
    private String downloadUrl;

    public Long getImageId() {
        return id;
    }

    public void setImageId(Long id) {
        this.id = id;
    }

    public String getImageName() {
        return fileName;
    }

    public void setImageName(String fileName) {
        this.fileName = fileName;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public ImageDto() {
        super();
    }

    public ImageDto(String fileName, String downloadUrl) {
        super();
        this.fileName = fileName;
        this.downloadUrl = downloadUrl;
    }
}
