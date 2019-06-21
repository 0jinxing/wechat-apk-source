package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cp
{
  public db a;
  public final float b;
  public final float c;
  public final float d;

  cp(int paramInt, db paramdb, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.a = paramdb;
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = paramFloat3;
  }

  public cp(db paramdb, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this(1, paramdb, paramFloat1, paramFloat2, paramFloat3);
  }

  public static cp.a a()
  {
    AppMethodBeat.i(100952);
    cp.a locala = new cp.a();
    AppMethodBeat.o(100952);
    return locala;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(100953);
    if (this == paramObject)
      AppMethodBeat.o(100953);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof cp))
      {
        AppMethodBeat.o(100953);
        bool = false;
      }
      else
      {
        paramObject = (cp)paramObject;
        if ((this.a.equals(paramObject.a)) && (Float.floatToIntBits(this.b) == Float.floatToIntBits(paramObject.b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(paramObject.c)) && (Float.floatToIntBits(this.d) == Float.floatToIntBits(paramObject.d)))
        {
          AppMethodBeat.o(100953);
        }
        else
        {
          AppMethodBeat.o(100953);
          bool = false;
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(100954);
    String str = "latlng:" + this.a.a + "," + this.a.b + ",zoom:" + this.b + ",tilt=" + this.c + ",bearing:" + this.d;
    AppMethodBeat.o(100954);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.cp
 * JD-Core Version:    0.6.2
 */