package com.tencent.ttpic.util;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PlayerUtil$2
  implements MediaPlayer.OnErrorListener
{
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50272);
    PlayerUtil.destroyPlayer((PlayerUtil.Player)paramMediaPlayer);
    AppMethodBeat.o(50272);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PlayerUtil.2
 * JD-Core Version:    0.6.2
 */