package com.tencent.mm.plugin.music.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1 extends Handler
{
  a$1(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(137475);
    if (100 == paramMessage.what)
    {
      ab.i("MicroMsg.Music.ExoMusicPlayer", "duration:%d, position:%d, bufferSize:%d, percent:%d", new Object[] { Long.valueOf(this.oLO.oLD.getDuration()), Long.valueOf(this.oLO.oLD.getCurrentPosition()), Long.valueOf(this.oLO.oLD.getBufferedPosition()), Long.valueOf(this.oLO.oLD.getBufferedPercentage()) });
      this.oLO.awA.removeMessages(100);
      if (this.oLO.oKe)
        this.oLO.awA.sendEmptyMessageDelayed(100, 5000L);
    }
    AppMethodBeat.o(137475);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.d.a.1
 * JD-Core Version:    0.6.2
 */