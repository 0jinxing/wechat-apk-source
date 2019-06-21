package com.tencent.mm.app.plugin;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  public static boolean Cj()
  {
    boolean bool = false;
    AppMethodBeat.i(15617);
    if (!d.afj("translate"))
      AppMethodBeat.o(15617);
    while (true)
    {
      return bool;
      String str = g.Nu().getValue("TranslateMsgOff");
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(15617);
        bool = true;
      }
      else if (bo.ank(str) != 0)
      {
        AppMethodBeat.o(15617);
      }
      else
      {
        AppMethodBeat.o(15617);
        bool = true;
      }
    }
  }

  public static boolean Ck()
  {
    boolean bool = false;
    AppMethodBeat.i(15618);
    if (!d.afj("translate"))
      AppMethodBeat.o(15618);
    while (true)
    {
      return bool;
      String str = g.Nu().getValue("ReTranslateSwitch");
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(15618);
        bool = true;
      }
      else if (bo.ank(str) != 0)
      {
        AppMethodBeat.o(15618);
      }
      else
      {
        AppMethodBeat.o(15618);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.c
 * JD-Core Version:    0.6.2
 */