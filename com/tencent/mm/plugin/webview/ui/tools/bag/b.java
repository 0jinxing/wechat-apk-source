package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.ak;

public final class b
{
  public static int uyg;
  public static final int uyh;
  public static final int uyi;
  public static final int uyj;
  public static final int uyk;
  public static final int uyl;
  public static final int uym;
  public static final float uyn;
  public static final int uyo;
  public static final int uyp;
  public static final float uyq;

  static
  {
    AppMethodBeat.i(8149);
    uyg = fr(ah.getContext());
    uyh = ak.getStatusBarHeight(ah.getContext());
    uyi = ah.getContext().getResources().getDimensionPixelSize(2131427563);
    uyj = ah.getContext().getResources().getDimensionPixelSize(2131428772);
    uyk = ah.getContext().getResources().getDimensionPixelSize(2131428771);
    uyl = ah.getContext().getResources().getDimensionPixelSize(2131428769);
    int i = ah.getContext().getResources().getDimensionPixelSize(2131428768);
    uym = i;
    uyn = i / uyl;
    uyo = ah.getContext().getResources().getDimensionPixelSize(2131428765);
    i = ah.getContext().getResources().getDimensionPixelSize(2131428764);
    uyp = i;
    uyq = i / uyo;
    AppMethodBeat.o(8149);
  }

  private static int fr(Context paramContext)
  {
    AppMethodBeat.i(8147);
    int i = ak.fr(paramContext);
    ab.i("MicroMsg.BagIndicatorController", "getNavigationBarHeight height:%d", new Object[] { Integer.valueOf(i) });
    AppMethodBeat.o(8147);
    return i;
  }

  public static void fs(Context paramContext)
  {
    AppMethodBeat.i(8148);
    uyg = fr(paramContext);
    AppMethodBeat.o(8148);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.b
 * JD-Core Version:    0.6.2
 */