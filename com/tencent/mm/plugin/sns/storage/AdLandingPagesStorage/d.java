package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public final class d extends b
{
  private final String fileName;
  private final String filePath;
  private final String rdT;
  private final d.a rdU;

  public d(String paramString1, String paramString2, String paramString3, d.a parama)
  {
    AppMethodBeat.i(37691);
    e.tf(paramString2);
    this.url = paramString1;
    this.rdT = paramString2;
    this.fileName = paramString3;
    this.filePath = (paramString2 + "/" + paramString3);
    this.rdU = parama;
    AppMethodBeat.o(37691);
  }

  private String cqh()
  {
    AppMethodBeat.i(37692);
    try
    {
      AdLandingPagesProxy localAdLandingPagesProxy = AdLandingPagesProxy.getInstance();
      String str1 = this.rdT;
      String str2 = this.fileName;
      String str3 = this.url;
      d.1 local1 = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/d$1;
      local1.<init>(this);
      localAdLandingPagesProxy.downloadLandingPagesImage(str1, str2, str3, local1);
      AppMethodBeat.o(37692);
      return null;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.i("MicroMsg.AdLandingPageDownloadCDNFileTask", "maybe wrong download scene, res[%s], stack[%s]", new Object[] { this.url, bo.l(localException) });
        al.d(new d.2(this));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d
 * JD-Core Version:    0.6.2
 */