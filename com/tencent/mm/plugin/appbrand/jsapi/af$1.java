package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class af$1
  implements MMActivity.a
{
  af$1(af paramaf, q paramq, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130410);
    if (paramInt1 != (this.hwJ.hashCode() & 0xFFFF))
      AppMethodBeat.o(130410);
    while (true)
    {
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        HashMap localHashMap = new HashMap();
        paramIntent = bo.bc(paramIntent.getStringExtra("choose_invoice_title_info"), "");
        ab.i("MicroMsg.JsApiChooseInvoiceTitle", "choose_invoice_title_info is : ".concat(String.valueOf(paramIntent)));
        localHashMap.put("invoiceTitleInfo", paramIntent);
        this.hsD.M(this.eIl, this.hwJ.j("ok", localHashMap));
        AppMethodBeat.o(130410);
      }
      else if (paramInt2 == 0)
      {
        this.hsD.M(this.eIl, this.hwJ.j("cancel", null));
        AppMethodBeat.o(130410);
      }
      else
      {
        this.hsD.M(this.eIl, this.hwJ.j("fail", null));
        AppMethodBeat.o(130410);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.af.1
 * JD-Core Version:    0.6.2
 */