package com.tencent.mapsdk.raster.model;

public abstract interface IOverlay
{
  public abstract String getId();

  public abstract boolean isVisible();

  public abstract void remove();

  public abstract void setVisible(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.IOverlay
 * JD-Core Version:    0.6.2
 */