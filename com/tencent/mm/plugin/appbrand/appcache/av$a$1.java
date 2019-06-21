package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.l.c;
import com.tencent.mm.plugin.appbrand.ipc.d;
import com.tencent.mm.sdk.platformtools.ab;

final class av$a$1
  implements l.c
{
  av$a$1(av.a parama, String paramString, int paramInt)
  {
  }

  public final void xC(String paramString)
  {
    AppMethodBeat.i(129430);
    ab.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "CommonConfigManager.getConfig config:%s", new Object[] { paramString });
    d.j(this.val$appId, this.bVv, paramString);
    AppMethodBeat.o(129430);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.av.a.1
 * JD-Core Version:    0.6.2
 */