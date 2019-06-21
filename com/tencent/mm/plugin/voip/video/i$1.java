package com.tencent.mm.plugin.voip.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$1
  implements MediaPlayer.OnCompletionListener
{
  i$1(i parami)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(5092);
    if (System.currentTimeMillis() - this.tbl.tbi > 70000L)
      this.tbl.tbh = 4;
    AppMethodBeat.o(5092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.i.1
 * JD-Core Version:    0.6.2
 */