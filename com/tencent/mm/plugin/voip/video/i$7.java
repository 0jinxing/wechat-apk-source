package com.tencent.mm.plugin.voip.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;

public final class i$7
  implements MediaPlayer.OnCompletionListener
{
  public i$7(i parami)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(5098);
    paramMediaPlayer.release();
    if (System.currentTimeMillis() - this.tbl.tbj > 5000L)
    {
      this.tbl.tbh = 8;
      g.KK().setMode(0);
    }
    AppMethodBeat.o(5098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.i.7
 * JD-Core Version:    0.6.2
 */