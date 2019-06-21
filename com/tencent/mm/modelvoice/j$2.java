package com.tencent.mm.modelvoice;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class j$2
  implements MediaPlayer.OnErrorListener
{
  j$2(j paramj)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55817);
    ab.d("MicroMsg.SpeexPlayer", "onError");
    if ((this.fZV.cop != null) && (this.fZV.fZC))
      this.fZV.cop.Mm();
    if (this.fZV.fZJ != null)
      this.fZV.fZJ.onError();
    try
    {
      this.fZV.status = -1;
      this.fZV.alX();
      try
      {
        j.a(this.fZV);
        AppMethodBeat.o(55817);
        return false;
      }
      catch (InterruptedException paramMediaPlayer)
      {
        while (true)
          ab.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bo.l(paramMediaPlayer) });
      }
    }
    catch (Exception paramMediaPlayer)
    {
      while (true)
        ab.e("MicroMsg.SpeexPlayer", "setErrorListener File[" + this.fZV.fileName + "] ErrMsg[" + paramMediaPlayer.getStackTrace() + "]");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.j.2
 * JD-Core Version:    0.6.2
 */