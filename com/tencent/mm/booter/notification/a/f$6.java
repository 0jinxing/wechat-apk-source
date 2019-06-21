package com.tencent.mm.booter.notification.a;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$6
  implements MediaPlayer.OnErrorListener
{
  f$6(f paramf)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(16029);
    ab.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound error, player: %s", new Object[] { this.eeu.eer });
    if (paramMediaPlayer != null)
      paramMediaPlayer.release();
    if (this.eeu.eer != null)
      this.eeu.eer.release();
    AppMethodBeat.o(16029);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.f.6
 * JD-Core Version:    0.6.2
 */