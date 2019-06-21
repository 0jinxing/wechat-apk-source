package com.tencent.mm.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a.b;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashSet;

public final class a
{
  public static final HashSet<b> ggH;
  private static final b ggI;
  private static Thread thread;

  static
  {
    AppMethodBeat.i(124514);
    thread = null;
    ggH = new HashSet();
    ggI = new a.1();
    AppMethodBeat.o(124514);
  }

  public static boolean anC()
  {
    AppMethodBeat.i(124512);
    boolean bool = syncAddrBook(ggI);
    AppMethodBeat.o(124512);
    return bool;
  }

  public static boolean anD()
  {
    return a.a.fAV;
  }

  public static boolean syncAddrBook(b paramb)
  {
    boolean bool1 = false;
    AppMethodBeat.i(124513);
    long l = Thread.currentThread().getId();
    boolean bool2 = l.apV();
    if (!bool2)
    {
      ab.e("MicroMsg.AddrBookSyncHelper", "canSync:%b, skip", new Object[] { Boolean.valueOf(bool2) });
      AppMethodBeat.o(124513);
    }
    while (true)
    {
      return bool1;
      al.d(new a.2(l, paramb));
      AppMethodBeat.o(124513);
      bool1 = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.a
 * JD-Core Version:    0.6.2
 */