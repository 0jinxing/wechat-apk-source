package com.tencent.map.lib.basemap.data;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class DoublePoint
{
  public double x;
  public double y;

  public DoublePoint()
  {
  }

  public DoublePoint(double paramDouble1, double paramDouble2)
  {
    this.x = paramDouble1;
    this.y = paramDouble2;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof DoublePoint))
    {
      paramObject = (DoublePoint)paramObject;
      bool2 = bool1;
      if (this.x == paramObject.x)
      {
        bool2 = bool1;
        if (this.y == paramObject.y)
          bool2 = true;
      }
    }
    return bool2;
  }

  public void set(double paramDouble1, double paramDouble2)
  {
    this.x = paramDouble1;
    this.y = paramDouble2;
  }

  public String toString()
  {
    AppMethodBeat.i(97841);
    String str = this.x + "," + this.y;
    AppMethodBeat.o(97841);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.basemap.data.DoublePoint
 * JD-Core Version:    0.6.2
 */