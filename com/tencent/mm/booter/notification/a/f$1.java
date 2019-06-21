package com.tencent.mm.booter.notification.a;

import android.media.MediaPlayer;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class f$1 extends ak
{
  f$1(f paramf, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(16024);
    ab.i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer playerIsInit:%s", new Object[] { Boolean.valueOf(this.eeu.eeq) });
    try
    {
      if (this.eeu.eer != null)
      {
        if (this.eeu.eer.isPlaying())
          this.eeu.eer.stop();
        this.eeu.eer.release();
        this.eeu.eeq = false;
        ab.i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer done playerIsInit:%s", new Object[] { Boolean.valueOf(this.eeu.eeq) });
      }
      AppMethodBeat.o(16024);
      return;
    }
    catch (IllegalStateException paramMessage)
    {
      while (true)
      {
        ab.w("MicroMsg.Notification.Tool.Sound", "Exception in playSoundHander,playerIsInit:%s", new Object[] { Boolean.valueOf(this.eeu.eeq) });
        if (this.eeu.eer != null)
          this.eeu.eer.release();
        AppMethodBeat.o(16024);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.f.1
 * JD-Core Version:    0.6.2
 */