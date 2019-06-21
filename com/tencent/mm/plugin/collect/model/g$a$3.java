package com.tencent.mm.plugin.collect.model;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$a$3
  implements MediaPlayer.OnErrorListener
{
  g$a$3(MediaPlayer paramMediaPlayer, MediaPlayer.OnErrorListener paramOnErrorListener)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40943);
    ab.i("MicroMsg.F2fRcvVoiceListener", "onError, what: %d, extra: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramMediaPlayer != null);
    try
    {
      paramMediaPlayer.release();
      if (this.kBW != null)
        this.kBW.release();
      label52: if (this.kBX != null)
        this.kBX.onError(paramMediaPlayer, paramInt1, paramInt2);
      AppMethodBeat.o(40943);
      return false;
    }
    catch (Exception localException)
    {
      break label52;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.g.a.3
 * JD-Core Version:    0.6.2
 */