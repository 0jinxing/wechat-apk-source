package com.tencent.mm.modelvoice;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.sdk.platformtools.ab;

final class s$1
  implements MediaPlayer.OnCompletionListener
{
  s$1(s params)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(55839);
    ab.d("MicroMsg.VoicePlayer", "OnCompletionListener");
    if ((this.gas.gar != null) && (this.gas.fZC))
    {
      ab.d("MicroMsg.VoicePlayer", "OnCompletionListener abandonFocus");
      this.gas.gar.Mm();
    }
    if (this.gas.fZI != null)
    {
      ab.d("MicroMsg.VoicePlayer", "OnCompletionListener onCompletion");
      this.gas.fZI.EA();
    }
    try
    {
      ab.d("MicroMsg.VoicePlayer", "OnCompletionListener release");
      this.gas.gaq.release();
      this.gas.status = 0;
      AppMethodBeat.o(55839);
      return;
    }
    catch (Exception paramMediaPlayer)
    {
      while (true)
      {
        ab.e("MicroMsg.VoicePlayer", "setCompletion File[" + this.gas.fileName + "] ErrMsg[" + paramMediaPlayer.getStackTrace() + "]");
        AppMethodBeat.o(55839);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.s.1
 * JD-Core Version:    0.6.2
 */