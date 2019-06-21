package com.tencent.mm.plugin.appbrand.jsapi.u.b.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$7
  implements MediaPlayer.OnBufferingUpdateListener
{
  a$7(a parama)
  {
  }

  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    AppMethodBeat.i(117432);
    if (this.ieK.ieQ != null)
      this.ieK.ieQ.onBufferingUpdate(paramMediaPlayer, paramInt);
    AppMethodBeat.o(117432);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.a.7
 * JD-Core Version:    0.6.2
 */