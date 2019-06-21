package com.tencent.mm.plugin.voip.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class i$4
  implements MediaPlayer.OnErrorListener
{
  i$4(i parami)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5095);
    this.tbl.tbh = 1;
    ab.w("MicroMsg.RingPlayer", "RingPlayer startPlayCustomRing MediaPlayer onError, what: " + paramInt1 + ":extra:" + paramInt2);
    AppMethodBeat.o(5095);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.i.4
 * JD-Core Version:    0.6.2
 */