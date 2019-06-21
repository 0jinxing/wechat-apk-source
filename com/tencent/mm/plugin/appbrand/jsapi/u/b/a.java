package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;

public final class a
  implements f
{
  int idH;
  c idI;
  private f.a idJ;
  private ap idK;

  public a(c paramc, f.a parama)
  {
    AppMethodBeat.i(117367);
    this.idH = 0;
    this.idK = new ap(new a.2(this), true);
    this.idI = paramc;
    this.idJ = parama;
    AppMethodBeat.o(117367);
  }

  final void aGD()
  {
    AppMethodBeat.i(117371);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoErrorHandler", "reset error count");
    this.idH = 0;
    AppMethodBeat.o(117371);
  }

  public final void destroy()
  {
    AppMethodBeat.i(117369);
    if (this.idK != null)
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoErrorHandler", "stop error check timer");
      this.idK.stopTimer();
    }
    AppMethodBeat.o(117369);
  }

  public final void dh(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117370);
    this.idH += 1;
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoErrorHandler", "onVideoError(%d, %d), error count:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.idH) });
    String str;
    if (this.idH >= 5)
    {
      aGD();
      if (this.idJ == null)
        break label196;
      f.a locala = this.idJ;
      if (paramInt1 == -1024)
      {
        str = "VIDEO_ERROR";
        locala.I(str, paramInt1, paramInt2);
        AppMethodBeat.o(117370);
      }
    }
    while (true)
    {
      return;
      if (paramInt1 == -1010)
      {
        str = "MEDIA_ERR_SRC_NOT_SUPPORTED";
        break;
      }
      if (paramInt1 == -1007)
      {
        str = "MEDIA_ERR_SRC_NOT_SUPPORTED";
        break;
      }
      if (paramInt1 == -1004)
      {
        if (!at.isConnected(ah.getContext()))
        {
          str = "MEDIA_ERR_NETWORK";
          break;
        }
        str = "MEDIA_ERR_DECODE";
        break;
      }
      if (!at.isConnected(ah.getContext()))
      {
        str = "MEDIA_ERR_NETWORK";
        break;
      }
      str = "MEDIA_ERR_DECODE";
      break;
      al.n(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(117365);
          ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoErrorHandler", "retry play video, error count:%d", new Object[] { Integer.valueOf(a.this.idH) });
          c localc;
          if (a.this.idI != null)
          {
            localc = a.this.idI;
            if (localc.idR != null)
              if (localc.iea)
              {
                ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler retry when error, video has prepared");
                localc.pause();
                if (localc.idR == null)
                  break label117;
                int i = localc.idR.getCurrentPosition();
                localc.ieb = true;
                localc.seek(i);
                AppMethodBeat.o(117365);
              }
          }
          while (true)
          {
            return;
            ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler retry when error, video has not prepared");
            localc.prepareAsync();
            label117: AppMethodBeat.o(117365);
          }
        }
      }
      , 200L);
      label196: AppMethodBeat.o(117370);
    }
  }

  public final void init()
  {
    AppMethodBeat.i(117368);
    if ((this.idH > 0) && (this.idK != null))
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoErrorHandler", "start error check timer");
      this.idK.ae(5000L, 5000L);
    }
    AppMethodBeat.o(117368);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.a
 * JD-Core Version:    0.6.2
 */