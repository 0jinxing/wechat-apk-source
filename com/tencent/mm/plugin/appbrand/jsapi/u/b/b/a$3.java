package com.tencent.mm.plugin.appbrand.jsapi.u.b.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$3
  implements MediaPlayer.OnCompletionListener
{
  a$3(a parama)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(117428);
    this.ieK.mCurrentState = 6;
    if (this.ieK.ieO != null)
      this.ieK.ieO.onCompletion(paramMediaPlayer);
    AppMethodBeat.o(117428);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.a.3
 * JD-Core Version:    0.6.2
 */