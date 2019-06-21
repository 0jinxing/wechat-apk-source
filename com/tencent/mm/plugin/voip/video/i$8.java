package com.tencent.mm.plugin.voip.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class i$8
  implements MediaPlayer.OnErrorListener
{
  public i$8(i parami)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5099);
    if (paramMediaPlayer != null)
    {
      paramMediaPlayer.release();
      this.tbl.tbh = 5;
      ab.w("MicroMsg.RingPlayer", "RingPlayer playSound :onError", new Object[] { paramMediaPlayer, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    AppMethodBeat.o(5099);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.i.8
 * JD-Core Version:    0.6.2
 */