package com.tencent.mm.plugin.music.d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.a.e;
import com.google.android.exoplayer2.b.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$e
  implements e
{
  private a$e(a parama)
  {
  }

  public final void b(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(137496);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "audioDecoderInitialized [" + this.oLO.bTJ() + ", " + paramString + "]");
    AppMethodBeat.o(137496);
  }

  public final void c(d paramd)
  {
    AppMethodBeat.i(137494);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "audioEnabled [" + this.oLO.bTJ() + "]");
    AppMethodBeat.o(137494);
  }

  public final void d(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(137499);
    a.a(this.oLO, "audioTrackUnderrun [" + paramInt + ", " + paramLong1 + ", " + paramLong2 + "]", null);
    AppMethodBeat.o(137499);
  }

  public final void d(Format paramFormat)
  {
    AppMethodBeat.i(137497);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "audioFormatChanged [" + this.oLO.bTJ() + ", " + Format.a(paramFormat) + "]");
    AppMethodBeat.o(137497);
  }

  public final void d(d paramd)
  {
    AppMethodBeat.i(137498);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "audioDisabled [" + this.oLO.bTJ() + "]");
    AppMethodBeat.o(137498);
  }

  public final void dx(int paramInt)
  {
    AppMethodBeat.i(137495);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "audioSessionId [" + paramInt + "]");
    AppMethodBeat.o(137495);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.d.a.e
 * JD-Core Version:    0.6.2
 */