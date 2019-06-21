package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.cache.c;
import com.tencent.mm.plugin.music.cache.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  private static boolean oJr = false;
  private static long oJs = 0L;

  public static boolean bSx()
  {
    AppMethodBeat.i(137261);
    long l = System.currentTimeMillis();
    if (l - oJs < 120000L)
    {
      bool = oJr;
      AppMethodBeat.o(137261);
      return bool;
    }
    oJs = l;
    if (e.bTG())
    {
      bool = ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).bTC();
      label56: oJr = bool;
      ab.i("MicroMsg.Audio.AudioMixSupport", "isSupportMixAudio:%b", new Object[] { Boolean.valueOf(oJr) });
      if (!oJr)
        if (!e.bTG())
          break label154;
    }
    for (boolean bool = ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).bTD(); ; bool = false)
    {
      oJr = bool;
      ab.i("MicroMsg.Audio.AudioMixSupport", "isSupportMixAudioByCP:%b", new Object[] { Boolean.valueOf(oJr) });
      bool = oJr;
      AppMethodBeat.o(137261);
      break;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
      bool = false;
      break label56;
      label154: ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.b
 * JD-Core Version:    0.6.2
 */