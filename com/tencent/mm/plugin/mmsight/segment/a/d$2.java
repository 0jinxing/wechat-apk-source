package com.tencent.mm.plugin.mmsight.segment.a;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnSeekCompleteListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$2
  implements MediaPlayer.OnSeekCompleteListener
{
  d$2(d paramd, a.c paramc)
  {
  }

  public final void onSeekComplete(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(3746);
    this.oAs.cf(paramMediaPlayer);
    AppMethodBeat.o(3746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.a.d.2
 * JD-Core Version:    0.6.2
 */