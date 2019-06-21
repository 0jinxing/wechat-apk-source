package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnInfoListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements MediaPlayer.OnInfoListener
{
  c$1(c paramc)
  {
  }

  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117387);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler onInfo, what:%d, extra:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 701)
    {
      this.iet.ied = this.iet.idR.isPlaying();
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onInfo, buffering start, isPlayingBeforeBuffering:%b", new Object[] { Boolean.valueOf(this.iet.ied) });
      if (this.iet.aGN())
        this.iet.idS.onVideoWaiting();
    }
    while (true)
    {
      AppMethodBeat.o(117387);
      return false;
      if (paramInt1 == 702)
      {
        boolean bool = this.iet.idR.isPlaying();
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onInfo, buffering end, isPlayingBeforeBuffering:%b, isCurrentPlaying", new Object[] { Boolean.valueOf(this.iet.ied), Boolean.valueOf(bool) });
        if (this.iet.ied)
        {
          this.iet.ied = false;
          if ((bool) && (this.iet.aGN()))
          {
            ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onInfo, buffering end, notify video play");
            this.iet.idS.onVideoPlay();
          }
        }
        else if ((!bool) && (this.iet.aGN()))
        {
          ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onInfo, buffering end, notify video pause");
          this.iet.idS.onVideoPause();
        }
      }
      else if (paramInt2 == -1004)
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onInfo, special error, what:%d, extra:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (this.iet.idT != null)
          this.iet.idT.dh(paramInt1, paramInt2);
        if (this.iet.idU != null)
          this.iet.idU.gq(40L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.c.1
 * JD-Core Version:    0.6.2
 */