package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class ae$1
  implements MMActivity.a
{
  ae$1(ae paramae, q paramq, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130408);
    ab.d("MicroMsg.JsApiChooseInvoice", "request choose invoice, resultCode = ".concat(String.valueOf(paramInt2)));
    HashMap localHashMap = new HashMap();
    if (paramInt2 == -1)
    {
      if (paramIntent != null)
        localHashMap.put("choose_invoice_info", bo.bc(paramIntent.getStringExtra("choose_invoice_info"), ""));
      this.hwH.M(this.eIl, this.hwI.j("ok", localHashMap));
      ab.i("MicroMsg.JsApiChooseInvoice", "callback ok values = ".concat(String.valueOf(localHashMap)));
      AppMethodBeat.o(130408);
    }
    while (true)
    {
      return;
      if (paramInt2 == 0)
      {
        this.hwH.M(this.eIl, this.hwI.j("cancel", null));
        ab.i("MicroMsg.JsApiChooseInvoice", "callback cancel");
        AppMethodBeat.o(130408);
      }
      else
      {
        this.hwH.M(this.eIl, this.hwI.j("fail", null));
        ab.i("MicroMsg.JsApiChooseInvoice", "callback fail");
        AppMethodBeat.o(130408);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ae.1
 * JD-Core Version:    0.6.2
 */