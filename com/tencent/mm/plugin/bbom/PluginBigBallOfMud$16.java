package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.f;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u.a;
import com.tencent.mm.pointers.PInt;

final class PluginBigBallOfMud$16
  implements u.a
{
  PluginBigBallOfMud$16(PluginBigBallOfMud paramPluginBigBallOfMud)
  {
  }

  public final boolean a(String paramString1, String paramString2, PInt paramPInt)
  {
    boolean bool = false;
    AppMethodBeat.i(18297);
    if (t.mZ(paramString1))
      if (f.kq(paramString1))
        if (e.rs(paramString2))
        {
          paramPInt.value = 5;
          bool = true;
          AppMethodBeat.o(18297);
        }
    while (true)
    {
      return bool;
      paramPInt.value = 4;
      break;
      if (f.rb(paramString1))
      {
        paramPInt.value = 3;
        break;
      }
      if (f.rc(paramString1))
      {
        paramPInt.value = 0;
        break;
      }
      if (f.qY(paramString1))
      {
        paramPInt.value = 6;
        break;
      }
      paramPInt.value = 7;
      break;
      AppMethodBeat.o(18297);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.PluginBigBallOfMud.16
 * JD-Core Version:    0.6.2
 */