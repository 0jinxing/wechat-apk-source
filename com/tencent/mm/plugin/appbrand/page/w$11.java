package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.actionbar.b;
import com.tencent.mm.plugin.appbrand.widget.actionbar.d;
import com.tencent.mm.sdk.platformtools.ab;

final class w$11
  implements Runnable
{
  w$11(w paramw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132396);
    if (this.itx.isG != null)
    {
      ab.i("MicroMsg.AppBrandPageViewWC", "weishi customActionBar");
      this.itx.isG.setNavResetStyleListener(new w.11.1(this));
      this.itx.isG.setFullscreenMode(true);
      this.itx.isG.setForegroundStyle(false);
      this.itx.isG.eP(false);
      this.itx.isG.aON();
      this.itx.isG.setBackButtonClickListener(new w.11.2(this));
    }
    if (this.itx.isF != null)
      this.itx.isF.setForceTopInsetsHeight(this.itx.mContext.getResources().getDimensionPixelSize(2131428107));
    AppMethodBeat.o(132396);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.11
 * JD-Core Version:    0.6.2
 */