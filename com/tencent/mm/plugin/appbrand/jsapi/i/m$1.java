package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.pluginsdk.wallet.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class m$1
  implements b.a
{
  m$1(m paramm, q paramq, int paramInt)
  {
  }

  public final void BD(String paramString)
  {
    AppMethodBeat.i(131362);
    ab.i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback fail");
    HashMap localHashMap = new HashMap();
    localHashMap.put("err_desc", paramString);
    this.hsD.M(this.eIl, this.hRQ.j("fail", localHashMap));
    AppMethodBeat.o(131362);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(131361);
    ab.i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback success: %s", new Object[] { paramString });
    HashMap localHashMap = new HashMap();
    localHashMap.put("respbuf", paramString);
    this.hsD.M(this.eIl, this.hRQ.j("ok", localHashMap));
    AppMethodBeat.o(131361);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.m.1
 * JD-Core Version:    0.6.2
 */