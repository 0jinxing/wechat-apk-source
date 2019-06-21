package com.tencent.mm.booter.notification.a;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$3
  implements MediaPlayer.OnCompletionListener
{
  f$3(f paramf, AudioManager paramAudioManager)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(16026);
    ab.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound finish, player: %s", new Object[] { this.eeu.eer });
    this.eex.setMode(0);
    if (paramMediaPlayer != null)
      paramMediaPlayer.release();
    if (this.eeu.eer != null)
      this.eeu.eer.release();
    AppMethodBeat.o(16026);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.f.3
 * JD-Core Version:    0.6.2
 */