package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum le$b
{
  public final int g;

  static
  {
    AppMethodBeat.i(100334);
    a = new b("LEFT_BOTTOM", 0, 0);
    b = new b("CENTER_BOTTOM", 1, 4);
    c = new b("RIGHT_BOTTOM", 2, 1);
    d = new b("LEFT_TOP", 3, 3);
    e = new b("CENTER_TOP", 4, 5);
    f = new b("RIGHT_TOP", 5, 2);
    h = new b[] { a, b, c, d, e, f };
    AppMethodBeat.o(100334);
  }

  private le$b(int paramInt)
  {
    this.g = paramInt;
  }

  public static b a(int paramInt)
  {
    AppMethodBeat.i(100333);
    int i;
    if (paramInt >= 0)
    {
      i = paramInt;
      if (paramInt < values().length);
    }
    else
    {
      i = 0;
    }
    Object localObject = a;
    b[] arrayOfb = values();
    int j = arrayOfb.length;
    paramInt = 0;
    if (paramInt < j)
    {
      b localb = arrayOfb[paramInt];
      if (localb.g == i)
        localObject = localb;
    }
    while (true)
    {
      AppMethodBeat.o(100333);
      return localObject;
      paramInt++;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.le.b
 * JD-Core Version:    0.6.2
 */