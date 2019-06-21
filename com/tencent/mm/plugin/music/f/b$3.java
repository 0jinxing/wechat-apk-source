package com.tencent.mm.plugin.music.f;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class b$3
  implements MediaPlayer.OnPreparedListener
{
  b$3(b paramb)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(137550);
    if (this.oNx.gaq != null)
      ab.i("MicroMsg.Music.MMMediaPlayer", "onPrepared");
    try
    {
      this.oNx.gaq.start();
      this.oNx.ovl = false;
      this.oNx.onStart();
      if (this.oNx.oNw != null)
        this.oNx.oNw.isStop = true;
      this.oNx.oNw = new b.a(this.oNx, (byte)0);
      paramMediaPlayer = this.oNx.oNw;
      paramMediaPlayer.isStop = false;
      d.post(paramMediaPlayer, "music_play_progress_runnable");
      AppMethodBeat.o(137550);
      return;
    }
    catch (Exception paramMediaPlayer)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", paramMediaPlayer, "start", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.b.3
 * JD-Core Version:    0.6.2
 */