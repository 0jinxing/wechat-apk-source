package com.tencent.ttpic.util;

import android.graphics.PointF;
import java.util.List;

public class PointsWithTexcoords
{
  public List<PointF> points;
  public float[] texCoords;

  public PointsWithTexcoords(List<PointF> paramList, float[] paramArrayOfFloat)
  {
    this.points = paramList;
    this.texCoords = paramArrayOfFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PointsWithTexcoords
 * JD-Core Version:    0.6.2
 */