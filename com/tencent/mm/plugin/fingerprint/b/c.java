package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
  implements k
{
  public static int a(com.tencent.mm.pluginsdk.wallet.c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(41430);
    int i = ((l)g.K(l.class)).a(paramc, paramBoolean);
    AppMethodBeat.o(41430);
    return i;
  }

  public static void a(lv paramlv, int paramInt, String paramString)
  {
    AppMethodBeat.i(41435);
    ((l)g.K(l.class)).a(paramlv, paramInt, paramString);
    AppMethodBeat.o(41435);
  }

  public static void abort()
  {
    AppMethodBeat.i(41432);
    ((l)g.K(l.class)).bxu();
    AppMethodBeat.o(41432);
  }

  public static boolean bxj()
  {
    AppMethodBeat.i(41429);
    boolean bool = ((l)g.K(l.class)).bxn();
    ab.i("MicroMsg.FingerPrintAuthMgr", "isSupportFP is ".concat(String.valueOf(bool)));
    AppMethodBeat.o(41429);
    return bool;
  }

  public static void bxk()
  {
    AppMethodBeat.i(41433);
    ((l)g.K(l.class)).bxk();
    AppMethodBeat.o(41433);
  }

  public static boolean bxl()
  {
    AppMethodBeat.i(41434);
    boolean bool = ((l)g.K(l.class)).bxo();
    AppMethodBeat.o(41434);
    return bool;
  }

  public static j bxm()
  {
    AppMethodBeat.i(41436);
    j localj = ((l)g.K(l.class)).bxm();
    AppMethodBeat.o(41436);
    return localj;
  }

  public static void release()
  {
    AppMethodBeat.i(41431);
    ((l)g.K(l.class)).bxt();
    AppMethodBeat.o(41431);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.c
 * JD-Core Version:    0.6.2
 */