package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.cu.b;

public class kc
  implements cu.b
{
  public int colorForValue(double paramDouble)
  {
    AppMethodBeat.i(100200);
    double d = paramDouble;
    if (paramDouble > 1.0D)
      d = 1.0D;
    paramDouble = Math.sqrt(d);
    int i = 119;
    if (paramDouble > 0.7D)
      i = 78;
    for (int j = 1; ; j = 3)
    {
      int k;
      if (paramDouble > 0.6D)
        k = (int)(Math.pow(paramDouble - 0.7D, 3.0D) * 20000.0D + 240.0D);
      while (true)
      {
        int m = k;
        if (k > 255)
          m = 255;
        k = Color.argb(m, 255, i, j);
        AppMethodBeat.o(100200);
        return k;
        if (paramDouble > 0.4D)
          k = (int)(Math.pow(paramDouble - 0.5D, 3.0D) * 20000.0D + 200.0D);
        else if (paramDouble > 0.2D)
          k = (int)(Math.pow(paramDouble - 0.3D, 3.0D) * 20000.0D + 160.0D);
        else
          k = (int)(paramDouble * 700.0D);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kc
 * JD-Core Version:    0.6.2
 */