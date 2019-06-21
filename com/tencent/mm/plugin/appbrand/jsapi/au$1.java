package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;

final class au$1
  implements MMActivity.a
{
  au$1(au paramau, q paramq)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130514);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        this.hsD.M(this.hyf.bOs, this.hyf.j("ok", null));
        ab.i("MicroMsg.JsApiOpenCard", "view card result is cancel!");
        AppMethodBeat.o(130514);
      }
    while (true)
    {
      return;
      if (paramInt2 == 0)
      {
        this.hsD.M(this.hyf.bOs, this.hyf.j("cancel", null));
        ab.e("MicroMsg.JsApiOpenCard", "view card result is cancel!");
        AppMethodBeat.o(130514);
      }
      else
      {
        this.hsD.M(this.hyf.bOs, this.hyf.j("fail", null));
        ab.e("MicroMsg.JsApiOpenCard", "view card result is fail!");
        AppMethodBeat.o(130514);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.au.1
 * JD-Core Version:    0.6.2
 */