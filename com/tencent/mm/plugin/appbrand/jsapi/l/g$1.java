package com.tencent.mm.plugin.appbrand.jsapi.l;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class g$1
  implements MMActivity.a
{
  g$1(g paramg, q paramq, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131419);
    if (paramInt1 != (this.hTT.hashCode() & 0xFFFF))
    {
      AppMethodBeat.o(131419);
      return;
    }
    this.hTT.hTS = false;
    if (paramIntent != null);
    for (paramInt1 = paramIntent.getIntExtra("key_err_code", 1); ; paramInt1 = 1)
    {
      ab.i("MicroMsg.JsApiRequestVirtualPayment", "resultCode:%d,result:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      if (paramInt2 == -1)
      {
        if (paramInt1 == 0)
        {
          ab.i("MicroMsg.JsApiRequestVirtualPayment", "requestIAP ok");
          this.hsD.M(this.eIl, this.hTT.j("ok", null));
          AppMethodBeat.o(131419);
          break;
        }
        HashMap localHashMap = new HashMap();
        paramIntent = bo.nullAsNil(paramIntent.getStringExtra("key_err_msg"));
        localHashMap.put("errCode", Integer.valueOf(paramInt1));
        ab.i("MicroMsg.JsApiRequestVirtualPayment", "requestVirtualPayment errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), paramIntent });
        this.hsD.M(this.eIl, this.hTT.j("fail ".concat(String.valueOf(paramIntent)), localHashMap));
        AppMethodBeat.o(131419);
        break;
      }
      paramIntent = new HashMap();
      paramIntent.put("errCode", Integer.valueOf(paramInt1));
      this.hsD.M(this.eIl, this.hTT.j("cancel", paramIntent));
      AppMethodBeat.o(131419);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.g.1
 * JD-Core Version:    0.6.2
 */