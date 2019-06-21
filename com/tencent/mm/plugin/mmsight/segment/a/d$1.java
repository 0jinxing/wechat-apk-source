package com.tencent.mm.plugin.mmsight.segment.a;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1
  implements MediaPlayer.OnPreparedListener
{
  d$1(d paramd, a.b paramb)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(3745);
    this.oAq.ce(paramMediaPlayer);
    AppMethodBeat.o(3745);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.a.d.1
 * JD-Core Version:    0.6.2
 */