package com.tencent.mm.plugin.appbrand.appusage;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class j extends k
{
  private static volatile j gZd = null;

  public static j axh()
  {
    AppMethodBeat.i(129551);
    if (gZd == null);
    try
    {
      if (gZd == null)
      {
        localj = new com/tencent/mm/plugin/appbrand/appusage/j;
        localj.<init>();
        gZd = localj;
      }
      j localj = gZd;
      AppMethodBeat.o(129551);
      return localj;
    }
    finally
    {
      AppMethodBeat.o(129551);
    }
  }

  public static boolean axi()
  {
    AppMethodBeat.i(129553);
    boolean bool;
    if (!g.RK())
    {
      bool = false;
      AppMethodBeat.o(129553);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)g.RP().Ry().get(ac.a.xOb, Boolean.FALSE)).booleanValue();
      AppMethodBeat.o(129553);
    }
  }

  public static void release()
  {
    gZd = null;
  }

  public final void a(final long paramLong, final boolean paramBoolean, Bundle paramBundle, final int paramInt1, final int paramInt2)
  {
    AppMethodBeat.i(129552);
    m.aNS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(129549);
        j localj = j.this;
        int i = paramInt1;
        int j = paramInt2;
        if ((paramBoolean & t.axG()));
        for (int k = 2; ; k = 0)
        {
          j.a(localj, i, j, k | 0x1, paramLong, paramBoolean, this.gZi);
          AppMethodBeat.o(129549);
          return;
        }
      }
    });
    AppMethodBeat.o(129552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.j
 * JD-Core Version:    0.6.2
 */