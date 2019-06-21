package com.tencent.mm.booter.notification.a;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$4
  implements MediaPlayer.OnErrorListener
{
  f$4(f paramf, AudioManager paramAudioManager)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(16027);
    ab.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound error, player: %s", new Object[] { this.eeu.eer });
    this.eex.setMode(0);
    if (paramMediaPlayer != null)
      paramMediaPlayer.release();
    if (this.eeu.eer != null)
      this.eeu.eer.release();
    AppMethodBeat.o(16027);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.f.4
 * JD-Core Version:    0.6.2
 */