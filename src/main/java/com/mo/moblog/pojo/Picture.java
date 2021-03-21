package com.mo.moblog.pojo;


public class Picture {

  private long id;
  private String pictureaddress;
  private String picturedescription;
  private String picturename;
  private String picturetime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPictureaddress() {
    return pictureaddress;
  }

  public void setPictureaddress(String pictureaddress) {
    this.pictureaddress = pictureaddress;
  }


  public String getPicturedescription() {
    return picturedescription;
  }

  public void setPicturedescription(String picturedescription) {
    this.picturedescription = picturedescription;
  }


  public String getPicturename() {
    return picturename;
  }

  public void setPicturename(String picturename) {
    this.picturename = picturename;
  }


  public String getPicturetime() {
    return picturetime;
  }

  public void setPicturetime(String picturetime) {
    this.picturetime = picturetime;
  }

}
