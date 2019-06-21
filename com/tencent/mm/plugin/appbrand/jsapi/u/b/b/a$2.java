package com.tencent.mm.plugin.appbrand.jsapi.u.b.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements MediaPlayer.OnVideoSizeChangedListener
{
  a$2(a parama)
  {
  }

  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117427);
    if (this.ieK.ieR != null)
      this.ieK.ieR.onVideoSizeChanged(paramMediaPlayer, paramInt1, paramInt2);
    AppMethodBeat.o(117427);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.a.2
 * JD-Core Version:    0.6.2
 */