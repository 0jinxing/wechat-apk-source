package com.tencent.map.geolocation;

public abstract interface TencentPoi
{
  public abstract String getAddress();

  public abstract String getCatalog();

  public abstract String getDirection();

  public abstract double getDistance();

  public abstract double getLatitude();

  public abstract double getLongitude();

  public abstract String getName();

  public abstract String getUid();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.geolocation.TencentPoi
 * JD-Core Version:    0.6.2
 */