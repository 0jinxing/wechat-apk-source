package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnSeekCompleteListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$9
  implements MediaPlayer.OnSeekCompleteListener
{
  c$9(c paramc)
  {
  }

  public final void onSeekComplete(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(117395);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler onSeekComplete");
    if (this.iet.ieb)
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onSeekComplete, start when seek complete");
      this.iet.ieb = false;
      this.iet.play();
      AppMethodBeat.o(117395);
    }
    while (true)
    {
      return;
      boolean bool = this.iet.idR.isPlaying();
      if (this.iet.iec)
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onSeekComplete, video playing before seeking, isCurrentPlaying:%b, position:%s, duration:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.iet.idR.getCurrentPosition()), Integer.valueOf(this.iet.idR.getDuration()) });
        this.iet.iec = false;
        if (this.iet.idR.getCurrentPosition() / 1000 < this.iet.idR.getDuration() / 1000)
        {
          ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onSeekComplete, video not end");
          if ((bool) && (this.iet.aGN()))
          {
            ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onSeekComplete, dispatch play again");
            this.iet.idS.onVideoPlay();
            AppMethodBeat.o(117395);
          }
        }
        else
        {
          ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onSeekComplete, video ends");
          this.iet.idR.pause();
          this.iet.idR.start();
          AppMethodBeat.o(117395);
        }
      }
      else
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onSeekComplete, video not playing before seeking, isCurrentPlaying:%b", new Object[] { Boolean.valueOf(bool) });
        if ((!bool) && (this.iet.aGN()))
        {
          ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onSeekComplete, dispatch pause again");
          this.iet.idS.onVideoPause();
        }
        AppMethodBeat.o(117395);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.c.9
 * JD-Core Version:    0.6.2
 */