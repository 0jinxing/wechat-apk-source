package com.tencent.mm.sdk.platformtools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ay$1
  implements MediaPlayer.OnErrorListener
{
  ay$1(MediaPlayer paramMediaPlayer)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(52221);
    ab.i("MicroMsg.PlaySound", "onError, what: %d, extra: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramMediaPlayer != null);
    try
    {
      paramMediaPlayer.release();
      if (this.kBW != null)
        this.kBW.release();
      label52: AppMethodBeat.o(52221);
      return false;
    }
    catch (Exception paramMediaPlayer)
    {
      break label52;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ay.1
 * JD-Core Version:    0.6.2
 */