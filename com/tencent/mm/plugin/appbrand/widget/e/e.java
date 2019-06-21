package com.tencent.mm.plugin.appbrand.widget.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  public final double x;
  public final double y;

  public e(double paramDouble1, double paramDouble2)
  {
    this.x = paramDouble1;
    this.y = paramDouble2;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (!(paramObject instanceof e))
      bool = false;
    while (true)
    {
      return bool;
      if ((this.x == ((e)paramObject).x) && (this.y == ((e)paramObject).y))
        bool = true;
      else
        bool = false;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(51275);
    String str = "Point{x=" + this.x + ", y=" + this.y + '}';
    AppMethodBeat.o(51275);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.e.e
 * JD-Core Version:    0.6.2
 */