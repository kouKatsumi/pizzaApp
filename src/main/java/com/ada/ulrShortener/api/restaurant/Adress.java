/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.api.restaurant;

import com.dropbox.core.v2.files.GpsCoordinates;

public interface Adress {
  public String address1();
  public String address2();
  public float getLongitude();
  public float getLatitude();
//  public GpsCoordinates getCoordinates();
}
