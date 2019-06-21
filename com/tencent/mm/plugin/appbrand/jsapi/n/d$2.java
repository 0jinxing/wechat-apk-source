package com.tencent.mm.plugin.appbrand.jsapi.n;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class d$2 extends g.c
{
  d$2(d paramd, q paramq)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(74795);
    ab.i("MicroMsg.JsApiShowToast", "destory");
    g.b(this.hsD.getAppId(), this);
    if (this.hVh.hVf != null)
    {
      d.cn(this.hVh.hVf);
      this.hVh.hVf = null;
    }
    if (this.hVh.gGo != null)
    {
      this.hVh.gGo.stopTimer();
      this.hVh.gGo = null;
    }
    AppMethodBeat.o(74795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.d.2
 * JD-Core Version:    0.6.2
 */