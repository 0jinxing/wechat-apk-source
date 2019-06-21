package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.widget.input.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements n.a
{
  d$1(d paramd, q paramq)
  {
  }

  public final void aEM()
  {
    AppMethodBeat.i(74794);
    if (this.hVh.hVf == null)
      AppMethodBeat.o(74794);
    while (true)
    {
      return;
      Object localObject = this.hsD.getCurrentPageView();
      if (localObject == null)
      {
        ab.w("MicroMsg.JsApiShowToast", "current page view is null.");
        AppMethodBeat.o(74794);
      }
      else
      {
        localObject = ((u)localObject).aBk();
        if (localObject == null)
        {
          ab.w("MicroMsg.JsApiShowToast", "pageArea is null, err");
          AppMethodBeat.o(74794);
        }
        else
        {
          d.a(this.hVh, (FrameLayout)localObject);
          AppMethodBeat.o(74794);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.d.1
 * JD-Core Version:    0.6.2
 */