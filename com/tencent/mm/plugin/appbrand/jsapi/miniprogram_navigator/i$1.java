package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bo;

final class i$1 extends g.c
{
  i$1(String paramString1, String paramString2, String paramString3, long paramLong, AppBrandStatObject paramAppBrandStatObject)
  {
  }

  private void a(g.d paramd, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(131346);
    i.a(paramd, paramString1, paramString2, paramString3, bo.anU() - this.fEG);
    this.hRb.hQF = null;
    g.b(paramString1, this);
    AppMethodBeat.o(131346);
  }

  public final void a(g.d paramd)
  {
    AppMethodBeat.i(131344);
    a(paramd, this.val$appId, this.bSt, this.hRa);
    AppMethodBeat.o(131344);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(131345);
    a(g.wV(this.val$appId), this.val$appId, this.bSt, this.hRa);
    AppMethodBeat.o(131345);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i.1
 * JD-Core Version:    0.6.2
 */