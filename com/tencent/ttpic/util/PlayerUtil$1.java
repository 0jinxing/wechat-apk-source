package com.tencent.ttpic.util;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PlayerUtil$1
  implements MediaPlayer.OnCompletionListener
{
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(50271);
    PlayerUtil.Player.access$002((PlayerUtil.Player)paramMediaPlayer, false);
    AppMethodBeat.o(50271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PlayerUtil.1
 * JD-Core Version:    0.6.2
 */