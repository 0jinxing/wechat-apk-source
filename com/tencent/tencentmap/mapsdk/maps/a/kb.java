package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class kb
{
  private DoublePoint a;
  private double b;

  public kb(jz paramjz, double paramDouble)
  {
    AppMethodBeat.i(100199);
    this.a = new DoublePoint(paramjz.a, paramjz.b);
    this.b = paramDouble;
    AppMethodBeat.o(100199);
  }

  public DoublePoint a()
  {
    return this.a;
  }

  public void a(double paramDouble)
  {
    this.b = paramDouble;
  }

  public double b()
  {
    return this.b;
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(100196);
    boolean bool;
    if (((paramObject instanceof kb)) && (((kb)paramObject).a.equals(this.a)))
    {
      bool = true;
      AppMethodBeat.o(100196);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100196);
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(100197);
    int i = this.a.hashCode();
    AppMethodBeat.o(100197);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(100198);
    String str = "x:" + this.a.x + ", y:" + this.a.y;
    AppMethodBeat.o(100198);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kb
 * JD-Core Version:    0.6.2
 */