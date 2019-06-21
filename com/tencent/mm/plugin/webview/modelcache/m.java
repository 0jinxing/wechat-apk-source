package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class m
{
  final String appId;
  final String cHg;
  final String cSx;
  final String cSy;
  final int cSz;
  final String unS;
  final a unT;

  public m(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    AppMethodBeat.i(6855);
    this.appId = paramString1;
    this.cSx = paramString2;
    this.unS = paramString3;
    this.cSz = paramInt;
    this.cSy = paramString4;
    ab.i("MicroMsg.WebViewCacheResWriter", "init WebViewCacheResWriter, appId = %s, domain = %s, mainURL = %s, cacheType = %d", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt) });
    this.unT = a.aeH(paramString1);
    if (this.unT != null)
    {
      paramString1 = this.unT;
      paramString2 = String.format("%d_%d_%d_%d", new Object[] { Integer.valueOf(paramString2.hashCode()), Integer.valueOf(paramInt), Integer.valueOf(paramString3.hashCode()), Integer.valueOf(paramString4.hashCode()) });
      this.cHg = (paramString1.path + "/" + paramString2);
      AppMethodBeat.o(6855);
    }
    while (true)
    {
      return;
      this.cHg = null;
      ab.e("MicroMsg.WebViewCacheResWriter", "get null appIdResDir");
      AppMethodBeat.o(6855);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.m
 * JD-Core Version:    0.6.2
 */