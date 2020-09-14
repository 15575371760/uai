package com.zh_ai.entity;


public class ZhGoodsImage {

  private int imageId;
  private Goods goods;
  private String content;
  private String type;
  private String imageA;
  private String imageB;
  private String imageC;


  public int getImageId() {
    return imageId;
  }

  public void setImageId(int imageId) {
    this.imageId = imageId;
  }


  public Goods getImageGid() {
    return goods;
  }

  public void setImageGid(Goods goods) {
    this.goods = goods;
  }


  public String getImageImage() {
    return content;
  }

  public void setImageImage(String content) {
    this.content = content;
  }

  public String getImageA() {
    return imageA;
  }

  public void setImageA(String imageA) {
    this.imageA = imageA;
  }


  public String getImageB() {
    return imageB;
  }

  public void setImageB(String imageB) {
    this.imageB = imageB;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getImageC() {
    return imageC;
  }

  public void setImageC(String imageC) {
    this.imageC = imageC;
  }

}
