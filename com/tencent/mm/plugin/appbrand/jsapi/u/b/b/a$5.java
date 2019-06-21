package com.tencent.mm.plugin.appbrand.jsapi.u.b.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnSeekCompleteListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$5
  implements MediaPlayer.OnSeekCompleteListener
{
  a$5(a parama)
  {
  }

  public final void onSeekComplete(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(117430);
    if (this.ieK.ieP != null)
      this.ieK.ieP.onSeekComplete(paramMediaPlayer);
    AppMethodBeat.o(117430);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.a.5
 * JD-Core Version:    0.6.2
 */