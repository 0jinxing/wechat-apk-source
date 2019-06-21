package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class AdLandingPagesProxy$b
  implements a.c
{
  private String Iw;
  private String appId;
  private boolean qHt;

  public AdLandingPagesProxy$b(AdLandingPagesProxy paramAdLandingPagesProxy, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.Iw = paramString2;
    this.appId = paramString1;
    this.qHt = paramBoolean;
  }

  public final void XA(String paramString)
  {
    AppMethodBeat.i(35920);
    ab.i("AdLandingPagesProxy", "pkg %s removed", new Object[] { paramString });
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(this.Iw)))
      this.qHs.deleteDeferredDeepLinkMM(paramString);
    AppMethodBeat.o(35920);
  }

  public final void Xz(String paramString)
  {
    AppMethodBeat.i(35919);
    ab.i("AdLandingPagesProxy", "pkg %s installed", new Object[] { paramString });
    if (this.qHt)
      a.e.qVH.reportDownloadInfo(4, this.appId);
    a.e.qVH.reportDownloadInfo(5, this.appId);
    AppMethodBeat.o(35919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.b
 * JD-Core Version:    0.6.2
 */