package com.tencent.mm.plugin.appbrand.jsapi.u.b.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnInfoListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$4
  implements MediaPlayer.OnInfoListener
{
  a$4(a parama)
  {
  }

  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117429);
    if (this.ieK.ieL != null)
      this.ieK.ieL.onInfo(paramMediaPlayer, paramInt1, paramInt2);
    AppMethodBeat.o(117429);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.a.4
 * JD-Core Version:    0.6.2
 */