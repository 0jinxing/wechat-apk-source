package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.o;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements Runnable
{
  c$1(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, Integer paramInteger, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123526);
    if (!this.hKm.isRunning())
    {
      AppMethodBeat.o(123526);
      return;
    }
    Object localObject = this.hKm;
    if ((localObject instanceof u))
    {
      localObject = (u)localObject;
      label40: if (!o.a((u)localObject, this.hKn))
        break label123;
    }
    label123: for (localObject = "ok"; ; localObject = "fail:input not exists")
    {
      this.hKm.M(this.eIl, this.hKo.j((String)localObject, null));
      AppMethodBeat.o(123526);
      break;
      if ((localObject instanceof com.tencent.mm.plugin.appbrand.q))
      {
        localObject = ((com.tencent.mm.plugin.appbrand.q)localObject).getRuntime().asV().getCurrentPage().getCurrentPageView();
        break label40;
      }
      ab.e("MicroMsg.JsApiHideKeyboard", "invalid component type while calling hide keyboard");
      localObject = null;
      break label40;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.c.1
 * JD-Core Version:    0.6.2
 */