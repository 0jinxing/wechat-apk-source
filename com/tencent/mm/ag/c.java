package com.tencent.mm.ag;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.a;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.plugin.music.b.a;

public final class c
{
  public static boolean pN(String paramString)
  {
    AppMethodBeat.i(137230);
    t localt = new t();
    localt.csI.action = 7;
    localt.csI.ckD = paramString;
    a.a(localt);
    boolean bool = localt.csJ.csN;
    AppMethodBeat.o(137230);
    return bool;
  }

  public static b pO(String paramString)
  {
    AppMethodBeat.i(137231);
    t localt = new t();
    localt.csI.action = 16;
    localt.csI.ckD = paramString;
    a.a(localt);
    paramString = localt.csI.csL;
    AppMethodBeat.o(137231);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ag.c
 * JD-Core Version:    0.6.2
 */