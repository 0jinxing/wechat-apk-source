package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

final class AppBrandProcessShareMessageProxyUI$c
{
  private Context context;
  Runnable hEw;
  private boolean iHj;
  boolean iHk;
  private boolean iHl;
  private int iHm;
  AppBrandProcessShareMessageProxyUI.b iHn;
  private String text;
  p tipDialog;

  public AppBrandProcessShareMessageProxyUI$c(AppBrandProcessShareMessageProxyUI paramAppBrandProcessShareMessageProxyUI, Context paramContext)
  {
    AppMethodBeat.i(133018);
    this.hEw = new AppBrandProcessShareMessageProxyUI.c.1(this);
    this.context = paramContext;
    AppMethodBeat.o(133018);
  }

  public final void aMl()
  {
    AppMethodBeat.i(133020);
    if (this.iHn != null)
      this.iHn.e(this.iHl, this.text, this.iHm);
    AppMethodBeat.o(133020);
  }

  public final void f(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(133019);
    this.iHj = true;
    this.iHl = paramBoolean;
    this.text = paramString;
    this.iHm = paramInt;
    if (oC())
    {
      aMl();
      AppMethodBeat.o(133019);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.tipDialog = h.b(this.context, this.context.getString(2131297043), true, null);
        al.n(this.hEw, 5000L);
      }
      AppMethodBeat.o(133019);
    }
  }

  public final boolean oC()
  {
    if ((this.iHj) && (this.iHk));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI.c
 * JD-Core Version:    0.6.2
 */