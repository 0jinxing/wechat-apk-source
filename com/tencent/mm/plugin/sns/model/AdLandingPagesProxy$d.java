package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.h.a;
import com.tencent.mm.plugin.report.service.h;

final class AdLandingPagesProxy$d
  implements h.a
{
  private String cHr;

  public AdLandingPagesProxy$d(AdLandingPagesProxy paramAdLandingPagesProxy, String paramString)
  {
    this.cHr = paramString;
  }

  public final void a(String paramString, int paramInt, d paramd)
  {
    AppMethodBeat.i(35925);
    if (paramString.equals(this.cHr))
    {
      h.pYm.k(955L, 30L, 1L);
      this.qHs.CLIENT_CALL("onCdnVideoFinish", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
    AppMethodBeat.o(35925);
  }

  public final void h(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(35924);
    if (paramString.equals(this.cHr))
      this.qHs.CLIENT_CALL("onCdnVideoProgress", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(35924);
  }

  public final void onDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(35923);
    if (paramString.equals(this.cHr))
    {
      h.pYm.k(955L, 28L, 1L);
      this.qHs.CLIENT_CALL("onCdnVideoDataAvailable", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    AppMethodBeat.o(35923);
  }

  public final void onMoovReady(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(35922);
    if (paramString.equals(this.cHr))
    {
      h.pYm.k(955L, 26L, 1L);
      this.qHs.CLIENT_CALL("onCdnVideoMoovReady", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    AppMethodBeat.o(35922);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.d
 * JD-Core Version:    0.6.2
 */