package com.tencent.mapsdk.raster.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolygonOptions
{
  private int fillColor;
  private int iLevel;
  private boolean isVisible;
  private final List<LatLng> points;
  private int strokeColor;
  private float strokeWidth;
  private float zIndex;

  public PolygonOptions()
  {
    AppMethodBeat.i(101216);
    this.strokeColor = -16777216;
    this.fillColor = -16777216;
    this.strokeWidth = 10.0F;
    this.isVisible = true;
    this.zIndex = 0.0F;
    this.iLevel = OverlayLevel.OverlayLevelAboveLabels;
    this.points = new ArrayList();
    AppMethodBeat.o(101216);
  }

  public final PolygonOptions add(LatLng paramLatLng)
  {
    AppMethodBeat.i(101217);
    if (paramLatLng == null)
      AppMethodBeat.o(101217);
    while (true)
    {
      return this;
      this.points.add(paramLatLng);
      AppMethodBeat.o(101217);
    }
  }

  public final PolygonOptions add(LatLng[] paramArrayOfLatLng)
  {
    AppMethodBeat.i(101218);
    if (paramArrayOfLatLng == null)
      AppMethodBeat.o(101218);
    while (true)
    {
      return this;
      this.points.addAll(Arrays.asList(paramArrayOfLatLng));
      AppMethodBeat.o(101218);
    }
  }

  public final PolygonOptions addAll(Iterable<LatLng> paramIterable)
  {
    AppMethodBeat.i(101219);
    if (paramIterable == null)
      AppMethodBeat.o(101219);
    while (true)
    {
      return this;
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
      {
        LatLng localLatLng = (LatLng)paramIterable.next();
        this.points.add(localLatLng);
      }
      AppMethodBeat.o(101219);
    }
  }

  public final PolygonOptions fillColor(int paramInt)
  {
    this.fillColor = paramInt;
    return this;
  }

  public final int getFillColor()
  {
    return this.fillColor;
  }

  public final int getLevel()
  {
    return this.iLevel;
  }

  public final List<LatLng> getPoints()
  {
    return this.points;
  }

  public final int getStrokeColor()
  {
    return this.strokeColor;
  }

  public final float getStrokeWidth()
  {
    return this.strokeWidth;
  }

  public final float getZIndex()
  {
    return this.zIndex;
  }

  public final boolean isVisible()
  {
    return this.isVisible;
  }

  public final PolygonOptions level(int paramInt)
  {
    if ((paramInt < OverlayLevel.OverlayLevelAboveRoads) || (paramInt > OverlayLevel.OverlayLevelAboveLabels));
    while (true)
    {
      return this;
      this.iLevel = paramInt;
    }
  }

  public final PolygonOptions strokeColor(int paramInt)
  {
    this.strokeColor = paramInt;
    return this;
  }

  public final PolygonOptions strokeWidth(float paramFloat)
  {
    float f = paramFloat;
    if (paramFloat < 0.0F)
      f = 0.0F;
    this.strokeWidth = f;
    return this;
  }

  public final PolygonOptions visible(boolean paramBoolean)
  {
    this.isVisible = paramBoolean;
    return this;
  }

  public final PolygonOptions zIndex(float paramFloat)
  {
    this.zIndex = paramFloat;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.PolygonOptions
 * JD-Core Version:    0.6.2
 */