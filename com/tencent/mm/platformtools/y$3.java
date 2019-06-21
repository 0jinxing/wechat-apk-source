package com.tencent.mm.platformtools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class y$3
  implements MediaPlayer.OnCompletionListener
{
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(16672);
    try
    {
      paramMediaPlayer.release();
      AppMethodBeat.o(16672);
      return;
    }
    catch (Exception paramMediaPlayer)
    {
      while (true)
      {
        ab.printErrStackTrace("MiroMsg.NotificationUtil", paramMediaPlayer, "", new Object[0]);
        AppMethodBeat.o(16672);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.y.3
 * JD-Core Version:    0.6.2
 */