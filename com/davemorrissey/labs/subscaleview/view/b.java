package com.davemorrissey.labs.subscaleview.view;

import android.graphics.PointF;
import java.io.Serializable;

public final class b
  implements Serializable
{
  private float centerX;
  private float centerY;
  int orientation;
  float scale;

  public b(float paramFloat, PointF paramPointF, int paramInt)
  {
    this.scale = paramFloat;
    this.centerX = paramPointF.x;
    this.centerY = paramPointF.y;
    this.orientation = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.b
 * JD-Core Version:    0.6.2
 */