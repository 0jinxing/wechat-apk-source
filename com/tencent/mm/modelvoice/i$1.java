package com.tencent.mm.modelvoice;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class i$1
  implements MediaPlayer.OnCompletionListener
{
  i$1(i parami)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(55793);
    if ((i.a(this.fZG) != null) && (i.b(this.fZG)))
    {
      ab.i("MicroMsg.SilkPlayer", "silkPlayer play onCompletion abandonFocus");
      i.a(this.fZG).Mm();
    }
    try
    {
      i.a(this.fZG, 0);
      if (i.c(this.fZG) != null)
      {
        ab.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
        i.c(this.fZG).stop();
        i.c(this.fZG).release();
        i.d(this.fZG);
      }
      AppMethodBeat.o(55793);
      return;
    }
    catch (Exception paramMediaPlayer)
    {
      while (true)
      {
        ab.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bo.l(paramMediaPlayer) });
        ab.e("MicroMsg.SilkPlayer", "setCompletion File[" + i.e(this.fZG) + "] ErrMsg[" + paramMediaPlayer.getStackTrace() + "]");
        AppMethodBeat.o(55793);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.i.1
 * JD-Core Version:    0.6.2
 */