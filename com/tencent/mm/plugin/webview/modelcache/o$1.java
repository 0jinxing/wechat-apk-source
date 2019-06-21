package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class o$1
  implements bz.a
{
  o$1(o paramo)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(6858);
    parama = parama.eAB;
    if (parama.vED == null)
      AppMethodBeat.o(6858);
    while (true)
    {
      return;
      if (bo.isNullOrNil(aa.a(parama.vED)))
      {
        AppMethodBeat.o(6858);
      }
      else
      {
        c.cYm();
        ab.d("MicroMsg.WebViewCacheSubCoreToolsExtension", "can not do brand pre-push");
        AppMethodBeat.o(6858);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.o.1
 * JD-Core Version:    0.6.2
 */