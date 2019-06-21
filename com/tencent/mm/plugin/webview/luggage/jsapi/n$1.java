package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Intent;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class n$1
  implements MMActivity.a
{
  n$1(n paramn, a.a parama)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6308);
    if (paramInt1 != (this.ukb.hashCode() & 0xFFFF))
      AppMethodBeat.o(6308);
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        this.mUf.a("", null);
        AppMethodBeat.o(6308);
      }
      else if (paramInt2 == 5)
      {
        HashMap localHashMap = new HashMap();
        paramInt1 = paramIntent.getIntExtra("key_jsapi_pay_err_code", 0);
        paramIntent = bo.nullAsNil(paramIntent.getStringExtra("key_jsapi_pay_err_msg"));
        localHashMap.put("err_code", Integer.valueOf(paramInt1));
        localHashMap.put("err_desc", paramIntent);
        ab.e("MicroMsg.JsApiGetBrandWCPayRequest", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), paramIntent });
        this.mUf.c("fail", localHashMap);
        AppMethodBeat.o(6308);
      }
      else
      {
        this.mUf.a("cancel", null);
        AppMethodBeat.o(6308);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.n.1
 * JD-Core Version:    0.6.2
 */