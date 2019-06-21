package com.tencent.mm.plugin.expt.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.expt.e.c;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static int b(a.a parama)
  {
    AppMethodBeat.i(73523);
    c.bru();
    int i = bo.getInt(c.a(parama, "", false), 0);
    AppMethodBeat.o(73523);
    return i;
  }

  public static boolean bqW()
  {
    boolean bool = false;
    AppMethodBeat.i(73520);
    c.bru();
    if (bo.getInt(c.a(a.a.lIm, "", false), 0) > 0)
    {
      bool = true;
      AppMethodBeat.o(73520);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(73520);
    }
  }

  public static boolean bqX()
  {
    boolean bool = false;
    AppMethodBeat.i(73521);
    c.bru();
    if (bo.getInt(c.a(a.a.lIn, "", false), 0) > 0)
    {
      bool = true;
      AppMethodBeat.o(73521);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(73521);
    }
  }

  public static boolean bqY()
  {
    boolean bool = false;
    AppMethodBeat.i(73522);
    c.bru();
    if (bo.getInt(c.a(a.a.lIo, "", false), 0) > 0)
    {
      bool = true;
      AppMethodBeat.o(73522);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(73522);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.c.a
 * JD-Core Version:    0.6.2
 */