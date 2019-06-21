package com.tencent.mm.plugin.music.f;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements MediaPlayer.OnCompletionListener
{
  b$1(b paramb)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(137548);
    ab.e("MicroMsg.Music.MMMediaPlayer", "onCompletion, stop music");
    this.oNx.jz(true);
    AppMethodBeat.o(137548);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.b.1
 * JD-Core Version:    0.6.2
 */