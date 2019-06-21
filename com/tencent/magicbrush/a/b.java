package com.tencent.magicbrush.a;

import com.tencent.magicbrush.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private static boolean bSB;
  private static b.a bSC;

  static
  {
    AppMethodBeat.i(115858);
    bSB = false;
    bSC = new b.1();
    AppMethodBeat.o(115858);
  }

  public static void a(b.a parama)
  {
    bSC = parama;
  }

  public static void loadLibrary(String paramString)
  {
    AppMethodBeat.i(115856);
    bSC.loadLibrary(paramString);
    AppMethodBeat.o(115856);
  }

  public static void yB()
  {
    AppMethodBeat.i(115857);
    if (bSB)
      AppMethodBeat.o(115857);
    while (true)
    {
      return;
      long l1 = c.yz();
      bSC.loadLibrary("mmv8");
      long l2 = c.yz();
      bSC.loadLibrary("magicbrush");
      bSB = true;
      c.c.i("MagicBrush", "load mmv8 cost [%d]ms, load magicbrush cost [%d]ms", new Object[] { Long.valueOf(c.az(l2)), Long.valueOf(l2 - l1) });
      AppMethodBeat.o(115857);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.a.b
 * JD-Core Version:    0.6.2
 */