package com.tencent.mm.plugin.clean.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashSet;

public final class d
{
  private static long kvW;
  private static long kvX;
  private static com.tencent.mm.plugin.clean.c.a.b kwh;
  private static long kwm;
  private static long kwn;
  private static final ak kwv;
  private static HashSet<String> kww;
  private static ArrayList<b> kwx;
  private static int kwy;

  static
  {
    AppMethodBeat.i(18699);
    kwv = new ak();
    kwn = 0L;
    kwm = 0L;
    kvX = 0L;
    kvW = 0L;
    kwy = 0;
    AppMethodBeat.o(18699);
  }

  public static void a(com.tencent.mm.plugin.clean.c.a.b paramb)
  {
    kwh = paramb;
  }

  public static void b(HashSet<String> paramHashSet)
  {
    kww = paramHashSet;
  }

  public static com.tencent.mm.plugin.clean.c.a.b bfQ()
  {
    boolean bool = true;
    AppMethodBeat.i(18695);
    if (kwh == null);
    while (true)
    {
      ab.d("MicroMsg.CleanLogic", "getThreadController threadController is null? %b", new Object[] { Boolean.valueOf(bool) });
      com.tencent.mm.plugin.clean.c.a.b localb = kwh;
      AppMethodBeat.o(18695);
      return localb;
      bool = false;
    }
  }

  public static HashSet<String> bfR()
  {
    return kww;
  }

  public static ArrayList<b> bfS()
  {
    return kwx;
  }

  public static long bfT()
  {
    return kwn;
  }

  public static long bfU()
  {
    return kvW;
  }

  public static long bfV()
  {
    return kvX;
  }

  public static long bfW()
  {
    return kwm;
  }

  public static final void bfX()
  {
    AppMethodBeat.i(18697);
    ab.i("MicroMsg.CleanLogic", "startCleanDataNow");
    kwv.removeCallbacksAndMessages(null);
    kwn = 0L;
    kwm = 0L;
    u(null);
    kwy = 0;
    AppMethodBeat.o(18697);
  }

  public static final void bfY()
  {
    AppMethodBeat.i(18698);
    ab.i("MicroMsg.CleanLogic", "start to post clean runnable!!");
    kwv.removeCallbacksAndMessages(null);
    kwv.postDelayed(new d.1(), 300000L);
    AppMethodBeat.o(18698);
  }

  public static final void bfZ()
  {
    kwy += 1;
  }

  public static final void bga()
  {
    kwy -= 1;
  }

  public static void hd(long paramLong)
  {
    kwn = paramLong;
  }

  public static void he(long paramLong)
  {
    kvW = paramLong;
  }

  public static void hf(long paramLong)
  {
    long l = paramLong;
    if (paramLong <= 0L)
      l = 0L;
    kvX = l;
  }

  public static void hg(long paramLong)
  {
    kwm = paramLong;
  }

  public static void u(ArrayList<b> paramArrayList)
  {
    boolean bool = true;
    AppMethodBeat.i(18696);
    if (paramArrayList == null);
    while (true)
    {
      ab.i("MicroMsg.CleanLogic", "set analyse data: is null? %b", new Object[] { Boolean.valueOf(bool) });
      kwx = paramArrayList;
      AppMethodBeat.o(18696);
      return;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.d
 * JD-Core Version:    0.6.2
 */