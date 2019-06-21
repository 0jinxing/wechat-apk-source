package com.tencent.mm.sdk.platformtools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ay$2
  implements MediaPlayer.OnCompletionListener
{
  ay$2(String paramString, MediaPlayer paramMediaPlayer, ay.a parama)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(52222);
    if (paramMediaPlayer == null);
    for (int i = -1; ; i = paramMediaPlayer.hashCode())
    {
      ab.i("MicroMsg.PlaySound", "play completion mp:%d  path:%s", new Object[] { Integer.valueOf(i), this.bSt });
      if (paramMediaPlayer != null)
        paramMediaPlayer.release();
      if (this.kBW != null)
        this.kBW.release();
      if (this.xAQ != null)
        this.xAQ.EA();
      AppMethodBeat.o(52222);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ay.2
 * JD-Core Version:    0.6.2
 */