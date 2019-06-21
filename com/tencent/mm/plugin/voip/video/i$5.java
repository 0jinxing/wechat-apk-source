package com.tencent.mm.plugin.voip.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$5
  implements MediaPlayer.OnCompletionListener
{
  i$5(i parami)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(5096);
    paramMediaPlayer.release();
    if (System.currentTimeMillis() - this.tbl.tbj > 5000L)
      this.tbl.tbh = 8;
    AppMethodBeat.o(5096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.i.5
 * JD-Core Version:    0.6.2
 */