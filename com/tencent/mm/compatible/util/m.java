package com.tencent.mm.compatible.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.ab;

public final class m
{
  public static boolean Mx()
  {
    AppMethodBeat.i(93106);
    String str = ab.get("ro.mediatek.platform");
    boolean bool;
    if ((str != null) && ((str.startsWith("MT")) || (str.startsWith("mt"))))
    {
      bool = true;
      AppMethodBeat.o(93106);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(93106);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.m
 * JD-Core Version:    0.6.2
 */