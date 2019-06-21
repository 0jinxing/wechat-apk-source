package com.tencent.mm.plugin.music.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.h;
import com.tencent.mm.plugin.music.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e
{
  public static h SQ(String paramString)
  {
    AppMethodBeat.i(137416);
    if (bTG())
    {
      paramString = ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).SQ(paramString);
      AppMethodBeat.o(137416);
    }
    while (true)
    {
      return paramString;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
      paramString = null;
      AppMethodBeat.o(137416);
    }
  }

  public static a SU(String paramString)
  {
    AppMethodBeat.i(137419);
    if (bTG())
    {
      paramString = ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).SU(paramString);
      AppMethodBeat.o(137419);
    }
    while (true)
    {
      return paramString;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
      paramString = new a();
      AppMethodBeat.o(137419);
    }
  }

  public static void a(String paramString, a parama)
  {
    AppMethodBeat.i(137420);
    if (bTG())
    {
      ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).a(paramString, parama);
      AppMethodBeat.o(137420);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
      AppMethodBeat.o(137420);
    }
  }

  public static boolean bTG()
  {
    AppMethodBeat.i(137414);
    boolean bool;
    if (com.tencent.mm.plugin.music.f.c.b.ar(c.class) != null)
    {
      bool = true;
      AppMethodBeat.o(137414);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137414);
    }
  }

  public static void cH(String paramString, int paramInt)
  {
    AppMethodBeat.i(137418);
    if (bTG())
      ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).cH(paramString, paramInt);
    AppMethodBeat.o(137418);
  }

  public static String getAccPath()
  {
    AppMethodBeat.i(137415);
    String str;
    if (bTG())
    {
      str = ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).getAccPath();
      if (!bo.isNullOrNil(str))
        AppMethodBeat.o(137415);
    }
    while (true)
    {
      return str;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
      str = com.tencent.mm.loader.j.b.eSn;
      AppMethodBeat.o(137415);
    }
  }

  public static void y(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(137417);
    if (bTG())
    {
      ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).y(paramString, paramArrayOfByte);
      AppMethodBeat.o(137417);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
      AppMethodBeat.o(137417);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.e
 * JD-Core Version:    0.6.2
 */