package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.sdk.b.a;

public final class g
{
  public static String a(b paramb)
  {
    AppMethodBeat.i(24163);
    gh localgh = new gh();
    localgh.cAH.type = 2;
    localgh.cAH.cAJ = paramb.cAv;
    a.xxA.m(localgh);
    paramb = localgh.cAI.path;
    AppMethodBeat.o(24163);
    return paramb;
  }

  public static String b(b paramb)
  {
    AppMethodBeat.i(24164);
    gh localgh = new gh();
    localgh.cAH.type = 2;
    localgh.cAH.cAJ = paramb.cAv;
    a.xxA.m(localgh);
    paramb = localgh.cAI.thumbPath;
    AppMethodBeat.o(24164);
    return paramb;
  }

  public static boolean c(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(24165);
    gh localgh = new gh();
    localgh.cAH.type = 14;
    localgh.cAH.cAJ = paramb.cAv;
    a.xxA.m(localgh);
    if (localgh.cAI.ret == 1)
      AppMethodBeat.o(24165);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(24165);
    }
  }

  public static com.tencent.mm.plugin.fav.a.g jD(long paramLong)
  {
    AppMethodBeat.i(24166);
    com.tencent.mm.plugin.fav.a.g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong);
    AppMethodBeat.o(24166);
    return localg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.g
 * JD-Core Version:    0.6.2
 */