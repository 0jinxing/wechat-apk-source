package com.tencent.mm.plugin.appbrand.r;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class o
{
  private static DisplayMetrics iQY;

  static
  {
    AppMethodBeat.i(57067);
    iQY = ah.getContext().getResources().getDisplayMetrics();
    AppMethodBeat.o(57067);
  }

  public static int aNT()
  {
    if (iQY == null);
    for (int i = 16; ; i = (int)(iQY.density * 16.0F))
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.o
 * JD-Core Version:    0.6.2
 */