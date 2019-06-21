package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import java.util.List;

public final class b
{
  public static boolean ajU(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(79911);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppNewIconUtil", "markNew fail, appId is empty");
      AppMethodBeat.o(79911);
    }
    while (true)
    {
      return bool;
      z localz = g.RP().Ry();
      if (localz == null)
      {
        ab.e("MicroMsg.AppNewIconUtil", "markNew fail, cfgStg is null");
        AppMethodBeat.o(79911);
      }
      else
      {
        b.a locala = new b.a((byte)0);
        locala.We((String)localz.get(69121, null));
        if (!locala.qnw.contains(paramString))
          locala.qnw.add(paramString);
        localz.set(69121, locala.dll());
        bool = true;
        AppMethodBeat.o(79911);
      }
    }
  }

  public static boolean ajV(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(79912);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppNewIconUtil", "unmarkNew fail, appId is empty");
      AppMethodBeat.o(79912);
    }
    while (true)
    {
      return bool;
      z localz = g.RP().Ry();
      if (localz == null)
      {
        ab.e("MicroMsg.AppNewIconUtil", "unmarkNew fail, cfgStg is null");
        AppMethodBeat.o(79912);
      }
      else
      {
        b.a locala = new b.a((byte)0);
        locala.We((String)localz.get(69121, null));
        if (locala.qnw.contains(paramString))
          locala.qnw.remove(paramString);
        localz.set(69121, locala.dll());
        bool = true;
        AppMethodBeat.o(79912);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.b
 * JD-Core Version:    0.6.2
 */