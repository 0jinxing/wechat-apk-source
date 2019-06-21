package com.tencent.mm.plugin.base.model;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  public static String Fv(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(79083);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(79083);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      ab.i("MicroMsg.ShortcutUtil", "process name: %s", new Object[] { bo.aw(ah.getContext(), Process.myPid()) });
      paramString = b.da(paramString, q.LK());
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(79083);
        paramString = localObject;
      }
      else
      {
        paramString = "shortcut_" + b.V(paramString.getBytes());
        AppMethodBeat.o(79083);
      }
    }
  }

  public static String db(String paramString1, String paramString2)
  {
    AppMethodBeat.i(79082);
    paramString1 = g.x((g.x(paramString1.getBytes()) + b.da(paramString2, paramString1)).getBytes());
    AppMethodBeat.o(79082);
    return paramString1;
  }

  public static String decrypt(String paramString)
  {
    AppMethodBeat.i(79081);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      AppMethodBeat.o(79081);
    }
    while (true)
    {
      return paramString;
      ab.i("MicroMsg.ShortcutUtil", "process name: %s", new Object[] { bo.aw(ah.getContext(), Process.myPid()) });
      if ((paramString.startsWith("shortcut_")) && (paramString.length() > 9))
      {
        String str = paramString.substring(9);
        if ((str != null) && (str.length() > 0))
        {
          paramString = b.da(new String(b.Fu(str)), q.LK());
          AppMethodBeat.o(79081);
        }
      }
      else
      {
        AppMethodBeat.o(79081);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.model.c
 * JD-Core Version:    0.6.2
 */