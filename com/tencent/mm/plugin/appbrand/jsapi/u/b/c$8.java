package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$8
  implements MediaPlayer.OnCompletionListener
{
  c$8(c paramc)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(117394);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler onCompletion");
    if (this.iet.aGN())
      this.iet.idS.aGE();
    if (this.iet.ieh)
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onCompletion, video loop playing");
      this.iet.ieb = true;
      this.iet.seek(0);
      AppMethodBeat.o(117394);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "onCompletion, video end playing");
      this.iet.ieq = true;
      AppMethodBeat.o(117394);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.c.8
 * JD-Core Version:    0.6.2
 */