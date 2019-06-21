package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.h.a;
import com.tencent.mm.modelvideo.b;
import com.tencent.mm.modelvideo.b.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class a
  implements b
{
  b.a hYm;
  String qfW = "";

  public final void a(b.a parama)
  {
    this.hYm = parama;
  }

  public final void dV(String paramString)
  {
    AppMethodBeat.i(37501);
    ab.i("MicroMsg.AdLandingOnlineVideoProxy", "%s, stop stream[%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    if (this.qfW.equals(paramString))
      AdLandingPagesProxy.getInstance().stopDownloadLandingPageVideo(paramString);
    AppMethodBeat.o(37501);
  }

  public final boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(37503);
    ab.i("MicroMsg.AdLandingOnlineVideoProxy", "%s, check video data available[%s, %s, %s]", new Object[] { Integer.valueOf(hashCode()), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.qfW.equals(paramString))
    {
      bool = AdLandingPagesProxy.getInstance().isVideoDataAvailable(paramString, paramInt1, paramInt2);
      AppMethodBeat.o(37503);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(37503);
    }
  }

  public final void r(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(37500);
    this.qfW = paramString1;
    ab.i("MicroMsg.AdLandingOnlineVideoProxy", "%s start http stream[%s, %s, %s]", new Object[] { Integer.valueOf(hashCode()), paramString1, paramString3, paramString2 });
    AdLandingPagesProxy.getInstance().downloadLandingPageVideo(paramString1, paramString3, paramString2, new a((byte)0));
    AppMethodBeat.o(37500);
  }

  public final void requestVideoData(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37502);
    ab.i("MicroMsg.AdLandingOnlineVideoProxy", "%s, request video data[%s, %s, %s]", new Object[] { Integer.valueOf(hashCode()), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.qfW.equals(paramString))
      AdLandingPagesProxy.getInstance().requestVideoData(paramString, paramInt1, paramInt2);
    AppMethodBeat.o(37502);
  }

  final class a
    implements h.a
  {
    private a()
    {
    }

    public final void a(final String paramString, final int paramInt, d paramd)
    {
      AppMethodBeat.i(37499);
      if ((a.this.hYm != null) && (a.this.qfW.equals(paramString)))
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(37495);
            h.pYm.k(955L, 31L, 1L);
            a.this.hYm.ad(paramString, paramInt);
            AppMethodBeat.o(37495);
          }
        });
      AppMethodBeat.o(37499);
    }

    public final void h(String paramString, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(37498);
      if ((a.this.hYm != null) && (a.this.qfW.equals(paramString)))
        al.d(new a.a.3(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(37498);
    }

    public final void onDataAvailable(String paramString, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(37497);
      if ((a.this.hYm != null) && (a.this.qfW.equals(paramString)))
        al.d(new a.a.2(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(37497);
    }

    public final void onMoovReady(String paramString, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(37496);
      if ((a.this.hYm != null) && (a.this.qfW.equals(paramString)))
        al.d(new a.a.1(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(37496);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a
 * JD-Core Version:    0.6.2
 */