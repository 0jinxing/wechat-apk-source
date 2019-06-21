package com.tencent.mm.plugin.appbrand.game.e;

import android.view.ViewGroup;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.b;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.aq;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.report.service.h;
import java.util.Map;

public final class e extends aq<s>
{
  public static final int CTRL_INDEX = 40;
  public static final String NAME = "getSystemInfo";
  private boolean hso = false;

  private Map<String, Object> c(s params)
  {
    int i = 1;
    AppMethodBeat.i(130197);
    Map localMap = super.a(params);
    int j;
    int k;
    if ((params.getRuntime() != null) && (params.getRuntime().xy()))
    {
      MBRuntime localMBRuntime = ((b)params).getMBRuntime();
      j = localMBRuntime.getSystemDisplayWidth();
      k = localMBRuntime.getSystemDisplayHeight();
      localMap.put("screenWidth", Integer.valueOf(j));
      localMap.put("screenHeight", Integer.valueOf(k));
      if ((params != null) && (!this.hso))
        this.hso = true;
    }
    try
    {
      params = params.getRuntime().gNE;
      boolean bool = params.isLaidOut();
      if (!bool);
    }
    catch (Exception params)
    {
      while (true)
      {
        try
        {
          m = g.pZ(params.getMeasuredWidth());
        }
        catch (Exception params)
        {
          try
          {
            n = g.pZ(params.getMeasuredHeight());
            int i1 = 1;
            i2 = m;
            m = n;
            n = i1;
            i1 = n;
            n = i2;
            i2 = m;
            if ((n == j) && (i2 == k))
            {
              m = 1;
              params = h.pYm;
              if (m == 0)
                continue;
              m = 1;
              if (i1 == 0)
                continue;
              i1 = i;
              params.e(16892, new Object[] { Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i1), Integer.valueOf(n), Integer.valueOf(i2) });
              AppMethodBeat.o(130197);
              return localMap;
              params = params;
              i2 = 0;
              m = 0;
              i1 = i2;
              i2 = 0;
              n = m;
              continue;
            }
            m = 0;
            continue;
            m = -1;
            continue;
            i1 = -1;
            continue;
            params = params;
            i2 = 1;
            m = 0;
            continue;
          }
          catch (Exception params)
          {
            i2 = 1;
            continue;
          }
        }
        int n = 0;
        int m = 0;
        int i2 = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.e
 * JD-Core Version:    0.6.2
 */