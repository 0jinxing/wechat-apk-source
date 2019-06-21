package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public final class aj
{
  private static Set<String> xzg;

  static
  {
    AppMethodBeat.i(52065);
    xzg = new HashSet();
    AppMethodBeat.o(52065);
  }

  public static boolean amA(String paramString)
  {
    AppMethodBeat.i(52062);
    boolean bool;
    if (amC(paramString))
    {
      ab.d("MicroMsg.MMEntryLock", "locked-".concat(String.valueOf(paramString)));
      bool = false;
      AppMethodBeat.o(52062);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.MMEntryLock", "lock-".concat(String.valueOf(paramString)));
      bool = xzg.add(paramString);
      AppMethodBeat.o(52062);
    }
  }

  public static void amB(String paramString)
  {
    AppMethodBeat.i(52063);
    xzg.remove(paramString);
    ab.d("MicroMsg.MMEntryLock", "unlock-".concat(String.valueOf(paramString)));
    AppMethodBeat.o(52063);
  }

  public static boolean amC(String paramString)
  {
    AppMethodBeat.i(52064);
    boolean bool = xzg.contains(paramString);
    AppMethodBeat.o(52064);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.aj
 * JD-Core Version:    0.6.2
 */