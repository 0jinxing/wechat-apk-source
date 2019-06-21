package com.tencent.mm.booter.notification.a;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$7
  implements MediaPlayer.OnCompletionListener
{
  f$7(f paramf)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(16030);
    ab.i("MicroMsg.Notification.Tool.Sound", "play sound finish, player: %s", new Object[] { this.eeu.eer });
    if (paramMediaPlayer != null)
      paramMediaPlayer.release();
    if (this.eeu.eer != null)
    {
      this.eeu.eer.release();
      ab.i("MicroMsg.Notification.Tool.Sound", "play sound real finish, player: %s,playerIsInit:%s", new Object[] { this.eeu.eer, Boolean.valueOf(this.eeu.eeq) });
    }
    AppMethodBeat.o(16030);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.f.7
 * JD-Core Version:    0.6.2
 */