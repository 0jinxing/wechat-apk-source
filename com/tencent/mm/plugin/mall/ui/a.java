package com.tencent.mm.plugin.mall.ui;

import android.content.res.Resources;
import android.graphics.Point;
import android.support.v7.app.ActionBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;

public final class a
{
  public static final int olm;
  public static final int oln;
  public static final int olo;
  private static int olp;
  private static int olq;
  private static int olr;
  private static int ols;
  private static int olt;
  private static int olu;
  private static int olv;

  static
  {
    AppMethodBeat.i(43134);
    olm = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 8);
    oln = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 140);
    olo = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 85);
    olp = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 39);
    olq = 40;
    olr = 95;
    ols = 0;
    olt = 0;
    olu = 70;
    olv = 38;
    AppMethodBeat.o(43134);
  }

  public static void a(MMActivity paramMMActivity, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(43133);
    int i;
    int j;
    if (paramBoolean2)
    {
      Point localPoint = ae.hy(paramMMActivity);
      i = localPoint.x;
      j = localPoint.y;
      if (!ae.hw(paramMMActivity))
        break label427;
    }
    label427: for (int k = j - ae.fr(paramMMActivity); ; k = j)
    {
      int m;
      if (paramMMActivity.getSupportActionBar() != null)
      {
        m = paramMMActivity.getSupportActionBar().getHeight();
        n = m;
        if (m > 0);
      }
      for (int n = paramMMActivity.getResources().getDimensionPixelSize(2131427563); ; n = 0)
      {
        n = k - n - ae.getStatusBarHeight(paramMMActivity);
        if (j / i * 1.0D > 2.0D);
        for (n = (n - olm * 3) / 20; ; n = (n - olm * 3) / 17)
        {
          olt = Math.max(n * 4, oln);
          olp = (int)(n * 1.5D);
          ols = Math.max(n * 3, olo);
          ab.i("MicroMsg.FunctionGridSizeCalculator", "baseA: %s, top height: %s", new Object[] { Integer.valueOf(n), Integer.valueOf(olt) });
          AppMethodBeat.o(43133);
          return;
        }
        j = olp;
        m = com.tencent.mm.bz.a.fromDPToPix(paramMMActivity, olq);
        k = ae.hy(paramMMActivity).y;
        n = k;
        if (ae.hw(paramMMActivity))
          n = k - ae.fr(paramMMActivity);
        if (paramMMActivity.getSupportActionBar() != null);
        for (k = paramMMActivity.getSupportActionBar().getHeight(); ; k = 0)
        {
          i = com.tencent.mm.bz.a.fromDPToPix(paramMMActivity, olr);
          ols = Math.round((n - j * 2 - m - k) / 5.0F);
          ab.i("MicroMsg.FunctionGridSizeCalculator", "calc GRID_HEIGHT_SIZE_PX: %s, minHeight: %s", new Object[] { Integer.valueOf(ols), Integer.valueOf(i) });
          if (ols < i)
            ols = i;
          olt = Math.round(ols * 4 / 3.0F) + com.tencent.mm.bz.a.fromDPToPix(paramMMActivity, olu);
          if (paramBoolean1)
            olt += com.tencent.mm.bz.a.fromDPToPix(paramMMActivity, olv);
          ab.i("MicroMsg.FunctionGridSizeCalculator", "calcGridSize, GRID_HEIGHT_SIZE_PX: %s, TOP_FUNC_LINE_GRID_SIZE_PX: %s", new Object[] { Integer.valueOf(ols), Integer.valueOf(olt) });
          AppMethodBeat.o(43133);
          break;
        }
      }
    }
  }

  public static int bMW()
  {
    return ols;
  }

  public static int bMX()
  {
    return olt;
  }

  public static int bMY()
  {
    return olp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.a
 * JD-Core Version:    0.6.2
 */