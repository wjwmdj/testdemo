package cn.kgc.ssm.pojo;

import java.util.Date;

public class AdPromotion {
    private Long id;

    private Long appId;

    private String adPicPath;

    private Long adPV;

    private Integer carouselPosition;

    private Date startTime;

    private Date endTime;

    private Long createdBy;

    private Date creationDate;

    private Long modifyBy;

    private Date modifyDate;

    public AdPromotion(Long id, Long appId, String adPicPath, Long adPV, Integer carouselPosition, Date startTime, Date endTime, Long createdBy, Date creationDate, Long modifyBy, Date modifyDate) {
        this.id = id;
        this.appId = appId;
        this.adPicPath = adPicPath;
        this.adPV = adPV;
        this.carouselPosition = carouselPosition;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
    }

    public AdPromotion() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAdPicPath() {
        return adPicPath;
    }

    public void setAdPicPath(String adPicPath) {
        this.adPicPath = adPicPath == null ? null : adPicPath.trim();
    }

    public Long getAdPV() {
        return adPV;
    }

    public void setAdPV(Long adPV) {
        this.adPV = adPV;
    }

    public Integer getCarouselPosition() {
        return carouselPosition;
    }

    public void setCarouselPosition(Integer carouselPosition) {
        this.carouselPosition = carouselPosition;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}