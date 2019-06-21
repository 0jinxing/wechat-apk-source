package com.tencent.mm.modelvoice;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.sdk.platformtools.ab;

final class i$2
  implements MediaPlayer.OnErrorListener
{
  i$2(i parami)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55794);
    ab.i("MicroMsg.SilkPlayer", "onError");
    if ((i.a(this.fZG) != null) && (i.b(this.fZG)))
      i.a(this.fZG).Mm();
    if (i.f(this.fZG) != null)
      i.f(this.fZG).onError();
    try
    {
      i.a(this.fZG, -1);
      if (i.c(this.fZG) != null)
      {
        ab.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
        i.c(this.fZG).stop();
        i.c(this.fZG).release();
        i.d(this.fZG);
      }
      AppMethodBeat.o(55794);
      return false;
    }
    catch (Exception paramMediaPlayer)
    {
      while (true)
        ab.e("MicroMsg.SilkPlayer", "setErrorListener File[" + i.e(this.fZG) + "] ErrMsg[" + paramMediaPlayer.getStackTrace() + "]");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.i.2
 * JD-Core Version:    0.6.2
 */