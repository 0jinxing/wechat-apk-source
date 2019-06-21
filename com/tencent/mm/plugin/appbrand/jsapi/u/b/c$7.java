package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$7
  implements MediaPlayer.OnPreparedListener
{
  c$7(c paramc)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(117393);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler onPrepared");
    this.iet.iea = true;
    this.iet.aGH();
    if (this.iet.idT != null)
      this.iet.idT.init();
    if ((this.iet.aGN()) && (this.iet.idR != null))
      this.iet.idS.L(this.iet.idR.getVideoWidth(), this.iet.idR.getVideoHeight(), this.iet.idR.getDuration());
    if (!this.iet.ier)
    {
      if (!this.iet.ief)
        break label216;
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onPrepared, start when prepared");
      if (!this.iet.aGN())
        break label216;
      this.iet.idS.onVideoPlay();
      AppMethodBeat.o(117393);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onPrepared, stop video auto play when webview in background");
      if (this.iet.idR != null)
        this.iet.idR.eu(false);
      this.iet.iee = this.iet.ief;
      label216: AppMethodBeat.o(117393);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.c.7
 * JD-Core Version:    0.6.2
 */