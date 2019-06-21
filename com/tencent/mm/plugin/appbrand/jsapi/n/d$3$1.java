package com.tencent.mm.plugin.appbrand.jsapi.n;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.n;
import com.tencent.mm.plugin.appbrand.widget.input.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.Set;

final class d$3$1
  implements ap.a
{
  d$3$1(d.3 param3)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(74796);
    d.cn(this.hVn.hVh.hVf);
    this.hVn.hVh.hVf = null;
    v.Zp().nV(this.hVn.hsD.hashCode() + "toast_name");
    ab.d("MicroMsg.JsApiShowToast", "on timer expired!");
    n localn = n.cG(this.hVn.hwF.aBk());
    if (localn != null)
    {
      n.a locala = this.hVn.hVh.hVg;
      if ((locala != null) && (localn.jeO.contains(locala)))
        localn.jeO.remove(locala);
    }
    AppMethodBeat.o(74796);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.d.3.1
 * JD-Core Version:    0.6.2
 */