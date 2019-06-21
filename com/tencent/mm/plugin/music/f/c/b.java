package com.tencent.mm.plugin.music.f.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static b oNX = null;
  private Context ctx;
  private ConcurrentHashMap<Class<? extends a>, a> oNY;

  private b(Context paramContext)
  {
    AppMethodBeat.i(137662);
    this.oNY = new ConcurrentHashMap();
    this.ctx = paramContext;
    AppMethodBeat.o(137662);
  }

  public static void L(Class<? extends a> paramClass)
  {
    AppMethodBeat.i(137667);
    bUJ().oNY.remove(paramClass);
    AppMethodBeat.o(137667);
  }

  public static void a(Class<? extends a> paramClass, a parama)
  {
    AppMethodBeat.i(137666);
    bUJ().oNY.put(paramClass, parama);
    AppMethodBeat.o(137666);
  }

  public static <T extends a> T ar(Class<T> paramClass)
  {
    AppMethodBeat.i(137668);
    paramClass = (a)bUJ().oNY.get(paramClass);
    AppMethodBeat.o(137668);
    return paramClass;
  }

  private static b bUJ()
  {
    AppMethodBeat.i(137664);
    if (oNX == null)
      init(null);
    b localb = oNX;
    AppMethodBeat.o(137664);
    return localb;
  }

  public static void init(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(137663);
      if (oNX != null)
        AppMethodBeat.o(137663);
      while (true)
      {
        return;
        ab.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
        b localb = new com/tencent/mm/plugin/music/f/c/b;
        localb.<init>(paramContext);
        oNX = localb;
        AppMethodBeat.o(137663);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public static void release()
  {
    try
    {
      AppMethodBeat.i(137665);
      ab.i("MicroMsg.Audio.AudioPlayerCoreService", "release");
      b localb = oNX;
      localb.oNY.clear();
      localb.ctx = null;
      oNX = null;
      AppMethodBeat.o(137665);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.c.b
 * JD-Core Version:    0.6.2
 */