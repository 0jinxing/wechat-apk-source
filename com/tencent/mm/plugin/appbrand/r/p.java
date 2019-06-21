package com.tencent.mm.plugin.appbrand.r;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class p
{
  private static DisplayMetrics aDu;

  static
  {
    AppMethodBeat.i(57068);
    aDu = new DisplayMetrics();
    ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getRealMetrics(aDu);
    AppMethodBeat.o(57068);
  }

  public static int qc(int paramInt)
  {
    if (aDu == null);
    while (true)
    {
      return paramInt;
      paramInt = (int)(paramInt / aDu.density);
    }
  }

  public static int qd(int paramInt)
  {
    if (aDu == null);
    while (true)
    {
      return paramInt;
      paramInt = (int)(aDu.density * paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.p
 * JD-Core Version:    0.6.2
 */