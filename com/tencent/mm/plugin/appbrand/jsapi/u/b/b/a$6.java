package com.tencent.mm.plugin.appbrand.jsapi.u.b.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$6
  implements MediaPlayer.OnErrorListener
{
  a$6(a parama)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117431);
    if (this.ieK.ieM != null)
      this.ieK.ieM.onError(paramMediaPlayer, paramInt1, paramInt2);
    AppMethodBeat.o(117431);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.a.6
 * JD-Core Version:    0.6.2
 */