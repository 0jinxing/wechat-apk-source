package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  private static float iWr = 4.5F;
  private static int iWs = 4;

  private static int d(Context paramContext, float paramFloat)
  {
    int i = 0;
    AppMethodBeat.i(14338);
    if (paramContext == null)
      AppMethodBeat.o(14338);
    while (true)
    {
      return i;
      int j = di(paramContext);
      int k = dw(paramContext);
      int m = (int)((k - j * paramFloat) / Math.ceil(paramFloat));
      i = m;
      if (m < 0)
        i = 0;
      ab.d("MicroMsg.BizTimeLineHotViewConfig", "alvinluo itemWidth: %d, itemPadding: %d, viewWidth: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
      AppMethodBeat.o(14338);
    }
  }

  public static int di(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(14335);
    if (paramContext == null)
      AppMethodBeat.o(14335);
    while (true)
    {
      return i;
      i = (int)(com.tencent.mm.bz.a.am(paramContext, 2131428125) * dm(paramContext));
      ab.d("MicroMsg.BizTimeLineHotViewConfig", "alvinluo itemWidth: %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(14335);
    }
  }

  public static int dj(Context paramContext)
  {
    AppMethodBeat.i(14336);
    int i = d(paramContext, iWr);
    AppMethodBeat.o(14336);
    return i;
  }

  private static float dm(Context paramContext)
  {
    AppMethodBeat.i(14340);
    float f1 = com.tencent.mm.bz.a.dm(paramContext);
    float f2;
    if ((f1 != 1.625F) && (f1 != 1.875F))
    {
      f2 = f1;
      if (f1 != 2.025F);
    }
    else
    {
      f2 = 1.375F;
    }
    AppMethodBeat.o(14340);
    return f2;
  }

  private static int dw(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(14337);
    try
    {
      j = paramContext.getResources().getDisplayMetrics().widthPixels;
      AppMethodBeat.o(14337);
      return j;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BizTimeLineHotViewConfig", paramContext, "alvinluo getViewWidth exception", new Object[0]);
        AppMethodBeat.o(14337);
        int j = i;
      }
    }
  }

  public static int dx(Context paramContext)
  {
    AppMethodBeat.i(14339);
    int i = (int)(com.tencent.mm.bz.a.am(paramContext, 2131428124) * dm(paramContext));
    AppMethodBeat.o(14339);
    return i;
  }

  public static int getCompletelyCountPerPage()
  {
    return iWs;
  }

  public static float getShowCountPerPage()
  {
    return iWr;
  }

  public static void init(Context paramContext)
  {
    AppMethodBeat.i(14334);
    if (d(paramContext, 4.5F) <= com.tencent.mm.bz.a.fromDPToPix(paramContext, 10))
    {
      iWr = 3.5F;
      iWs = 3;
      AppMethodBeat.o(14334);
    }
    while (true)
    {
      return;
      iWr = 4.5F;
      iWs = 4;
      AppMethodBeat.o(14334);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.a
 * JD-Core Version:    0.6.2
 */