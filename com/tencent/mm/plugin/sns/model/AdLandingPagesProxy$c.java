package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class AdLandingPagesProxy$c
  implements b.b
{
  private String cHr;

  public AdLandingPagesProxy$c(AdLandingPagesProxy paramAdLandingPagesProxy, String paramString)
  {
    this.cHr = paramString;
  }

  public final void Xw(String paramString)
  {
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(35921);
    if ((!bo.Q(new String[] { paramString, this.cHr })) && (paramString.equals(this.cHr)))
    {
      this.qHs.CLIENT_CALL("onImgDownloadCallback", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      af.cnA().b(this);
    }
    AppMethodBeat.o(35921);
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
  }

  public final void cmu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.c
 * JD-Core Version:    0.6.2
 */