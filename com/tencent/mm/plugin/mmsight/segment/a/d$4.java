package com.tencent.mm.plugin.mmsight.segment.a;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$4
  implements MediaPlayer.OnErrorListener
{
  d$4(d paramd, a.a parama)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3748);
    boolean bool = this.oAu.ey(paramInt1, paramInt2);
    AppMethodBeat.o(3748);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.a.d.4
 * JD-Core Version:    0.6.2
 */