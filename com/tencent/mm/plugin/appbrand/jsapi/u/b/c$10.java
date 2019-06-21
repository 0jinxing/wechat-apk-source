package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$10
  implements MediaPlayer.OnVideoSizeChangedListener
{
  c$10(c paramc)
  {
  }

  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117396);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler onVideoSizeChanged, width:%d, height:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.iet.aGH();
    if ((this.iet.aGN()) && (this.iet.iea) && (this.iet.idR != null))
    {
      int i = this.iet.idR.getDuration();
      if (((this.iet.idS != null) && (paramInt1 != this.iet.mVideoWidth)) || (paramInt2 != this.iet.mVideoHeight) || (i != this.iet.iel))
        this.iet.idS.L(paramInt1, paramInt2, i);
    }
    this.iet.mVideoWidth = paramInt1;
    this.iet.mVideoHeight = paramInt2;
    if (this.iet.idR != null)
      this.iet.iel = this.iet.idR.getDuration();
    AppMethodBeat.o(117396);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.c.10
 * JD-Core Version:    0.6.2
 */