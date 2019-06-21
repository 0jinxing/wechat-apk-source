package com.tencent.mm.booter.notification.a;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$5
  implements MediaPlayer.OnCompletionListener
{
  f$5(f paramf)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(16028);
    ab.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound finish, player: %s", new Object[] { this.eeu.eer });
    if (paramMediaPlayer != null)
      paramMediaPlayer.release();
    if (this.eeu.eer != null)
      this.eeu.eer.release();
    AppMethodBeat.o(16028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.f.5
 * JD-Core Version:    0.6.2
 */