package com.tencent.mm.plugin.music.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f
  implements b
{
  private static long clx = 0L;
  private List<String> clw;

  public f(List<String> paramList)
  {
    AppMethodBeat.i(137422);
    this.clw = new ArrayList(10);
    if (!paramList.isEmpty())
      this.clw.addAll(paramList);
    AppMethodBeat.o(137422);
  }

  private boolean dA(String paramString)
  {
    AppMethodBeat.i(137424);
    Iterator localIterator = this.clw.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (paramString.contains((String)localIterator.next()))
      {
        bool = true;
        AppMethodBeat.o(137424);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137424);
    }
  }

  public final void bTy()
  {
    long l = 0L;
    AppMethodBeat.i(137423);
    if (clx == 0L)
    {
      if (e.bTG())
      {
        l = ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).bTB();
        clx = l;
      }
    }
    else
    {
      l = System.currentTimeMillis();
      if (l - clx > oLa.longValue())
        break label81;
      ab.e("MicroMsg.Music.PieceCacheCleanController", "startClean the last clean time is in MUSIC_NO_SCAN_TIME time");
      AppMethodBeat.o(137423);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
      break;
      label81: clx = l;
      ab.i("MicroMsg.Music.PieceCacheCleanController", "start clean music file");
      d.post(new f.1(this, l), "PieceCacheCleanController");
      AppMethodBeat.o(137423);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.f
 * JD-Core Version:    0.6.2
 */