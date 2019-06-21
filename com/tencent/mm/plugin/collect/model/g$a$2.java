package com.tencent.mm.plugin.collect.model;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$a$2
  implements MediaPlayer.OnCompletionListener
{
  g$a$2(String paramString, MediaPlayer paramMediaPlayer, MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(40942);
    if (paramMediaPlayer == null);
    for (int i = -1; ; i = paramMediaPlayer.hashCode())
    {
      ab.i("MicroMsg.F2fRcvVoiceListener", "play completion mp:%d  path:%s", new Object[] { Integer.valueOf(i), this.bSt });
      if (paramMediaPlayer != null)
        paramMediaPlayer.release();
      if (this.kBW != null)
        this.kBW.release();
      if (this.kBY != null)
        this.kBY.onCompletion(paramMediaPlayer);
      AppMethodBeat.o(40942);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.g.a.2
 * JD-Core Version:    0.6.2
 */