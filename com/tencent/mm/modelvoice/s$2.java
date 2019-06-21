package com.tencent.mm.modelvoice;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.sdk.platformtools.ab;

final class s$2
  implements MediaPlayer.OnErrorListener
{
  s$2(s params)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55840);
    ab.d("MicroMsg.VoicePlayer", "OnErrorListener");
    if ((this.gas.gar != null) && (this.gas.fZC))
    {
      ab.d("MicroMsg.VoicePlayer", "OnErrorListener abandonFocus");
      this.gas.gar.Mm();
    }
    if (this.gas.fZJ != null)
    {
      ab.d("MicroMsg.VoicePlayer", "OnErrorListener onError");
      this.gas.fZJ.onError();
    }
    try
    {
      ab.d("MicroMsg.VoicePlayer", "OnErrorListener release");
      this.gas.gaq.release();
      this.gas.status = -1;
      AppMethodBeat.o(55840);
      return false;
    }
    catch (Exception paramMediaPlayer)
    {
      while (true)
        ab.e("MicroMsg.VoicePlayer", "setErrorListener File[" + this.gas.fileName + "] ErrMsg[" + paramMediaPlayer.getStackTrace() + "]");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.s.2
 * JD-Core Version:    0.6.2
 */