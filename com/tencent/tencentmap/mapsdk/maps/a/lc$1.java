package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;

class lc$1
  implements me<kg<Double, kx>>
{
  lc$1(lc paramlc, double paramDouble, int paramInt, HashMap paramHashMap, ArrayList paramArrayList)
  {
  }

  public void a(kg<Double, kx> paramkg)
  {
    AppMethodBeat.i(100321);
    double d1 = ((Double)paramkg.a()).doubleValue() / this.a;
    jz localjz = new jz();
    paramkg = (kx)paramkg.b();
    int i = (int)paramkg.b();
    int j = (int)paramkg.c();
    localjz.a = (i - i % this.b + this.b / 2);
    localjz.b = (j - j % this.b + this.b / 2);
    paramkg = (kb)this.c.get(localjz);
    if (paramkg == null)
    {
      paramkg = new kb(localjz, d1);
      this.c.put(localjz, paramkg);
      this.d.add(paramkg);
      AppMethodBeat.o(100321);
    }
    while (true)
    {
      return;
      paramkg.a(d1 + paramkg.b());
      AppMethodBeat.o(100321);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lc.1
 * JD-Core Version:    0.6.2
 */