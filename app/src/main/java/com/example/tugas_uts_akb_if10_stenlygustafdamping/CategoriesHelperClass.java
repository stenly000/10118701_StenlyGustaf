package com.example.tugas_uts_akb_if10_stenlygustafdamping;

import android.graphics.drawable.GradientDrawable;

public class CategoriesHelperClass {
  int image;
  String title, gradient;

  public CategoriesHelperClass(int image, int title, String gradient) {
    this.image = image;
    this.gradient = gradient;
  }

  public CategoriesHelperClass(GradientDrawable gradient1, int ikan1, String gradient) {

  }

  public int getImage() {
    return image;
  }

  public String getTitle() {
    return title;
  }


  public String getGradient() {
    return gradient;

  }
}
