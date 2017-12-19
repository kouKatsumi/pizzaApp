/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.restaurant;

import com.ada.ulrShortener.api.restaurant.Adress;
import com.dropbox.core.v2.files.GpsCoordinates;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
@Embeddable
public class AdressImpl implements Adress {

  private String address1;
  private String address2;
  private float longitude;
  private float latitude;
//  private GpsCoordinates coordinates;
//  @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
//  private long id;

  @Override
  public String address1() {
    return address1;
  }

  @Override
  public String address2() {
    return address2;
  }

  @Override
  public float getLongitude() {
    return longitude;
  }

  @Override
  public float getLatitude() {
    return latitude;
  }

//  @Override
//  public GpsCoordinates getCoordinates() {
//    return coordinates;
//  }
}
