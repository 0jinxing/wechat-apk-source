package com.tencent.ttpic.util;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnSeekCompleteListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PlayerUtil$3
  implements MediaPlayer.OnSeekCompleteListener
{
  public final void onSeekComplete(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(50273);
    ((PlayerUtil.Player)paramMediaPlayer).start();
    AppMethodBeat.o(50273);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PlayerUtil.3
 * JD-Core Version:    0.6.2
 */