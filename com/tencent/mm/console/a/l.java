package com.tencent.mm.console.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.c;

public final class l
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    AppMethodBeat.i(16147);
    b.a(new l(), new String[] { "//pay" });
    AppMethodBeat.o(16147);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(16146);
    if (paramArrayOfString.length < 2)
      AppMethodBeat.o(16146);
    while (true)
    {
      label21: return bool;
      paramString = paramArrayOfString[1];
      int i = -1;
      switch (paramString.hashCode())
      {
      default:
      case -1326045846:
      case 174797075:
      case 99657:
      case -1943286194:
      }
      while (true)
        switch (i)
        {
        default:
          AppMethodBeat.o(16146);
          bool = false;
          break label21;
          if (paramString.equals("dorder"))
          {
            i = 0;
            continue;
            if (paramString.equals("sethassource"))
            {
              i = 1;
              continue;
              if (paramString.equals("dot"))
              {
                i = 2;
                continue;
                if (paramString.equals("forcenewcashier"))
                  i = 3;
              }
            }
          }
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      d.H(paramContext, "wallet", ".pwd.ui.WalletUniversalPayOrderUI");
      AppMethodBeat.o(16146);
      continue;
      g.RP().Ry().set(ac.a.xUv, Integer.valueOf(1));
      AppMethodBeat.o(16146);
      continue;
      c.PK().b(ac.a.xUi, true);
      AppMethodBeat.o(16146);
      continue;
      if (paramArrayOfString.length >= 3)
      {
        i = bo.getInt(paramArrayOfString[2], 0);
        g.RP().Ry().set(ac.a.xUA, Integer.valueOf(i));
      }
      AppMethodBeat.o(16146);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.l
 * JD-Core Version:    0.6.2
 */