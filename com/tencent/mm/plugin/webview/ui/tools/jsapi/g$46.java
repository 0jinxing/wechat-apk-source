package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class g$46
  implements b.a
{
  g$46(g paramg, i parami)
  {
  }

  public final void BD(String paramString)
  {
    AppMethodBeat.i(9102);
    ab.i("MicroMsg.MsgHandler", "secureTunnel callback fail");
    HashMap localHashMap = new HashMap();
    localHashMap.put("err_desc", paramString);
    g.a(this.uHd, this.uqf, "secureTunnel:fail", localHashMap);
    AppMethodBeat.o(9102);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(9101);
    ab.i("MicroMsg.MsgHandler", "secureTunnel callback success");
    HashMap localHashMap = new HashMap();
    localHashMap.put("respbuf", paramString);
    g.a(this.uHd, this.uqf, "secureTunnel:ok", localHashMap);
    AppMethodBeat.o(9101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.46
 * JD-Core Version:    0.6.2
 */