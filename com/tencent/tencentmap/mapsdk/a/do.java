package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class do
{
  public final db a;
  public final db b;
  public final db c;
  public final db d;
  public final dc e;

  public do(db paramdb1, db paramdb2, db paramdb3, db paramdb4, dc paramdc)
  {
    this.a = paramdb1;
    this.b = paramdb2;
    this.c = paramdb3;
    this.d = paramdb4;
    this.e = paramdc;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(101090);
    if (this == paramObject)
      AppMethodBeat.o(101090);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof do))
      {
        AppMethodBeat.o(101090);
        bool = false;
      }
      else
      {
        paramObject = (do)paramObject;
        if ((this.a.equals(paramObject.a)) && (this.b.equals(paramObject.b)) && (this.c.equals(paramObject.c)) && (this.d.equals(paramObject.d)) && (this.e.equals(paramObject.e)))
        {
          AppMethodBeat.o(101090);
        }
        else
        {
          AppMethodBeat.o(101090);
          bool = false;
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(101091);
    String str = "nearLeft" + this.a + "nearRight" + this.b + "farLeft" + this.c + "farRight" + this.d + "latLngBounds" + this.e;
    AppMethodBeat.o(101091);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.do
 * JD-Core Version:    0.6.2
 */