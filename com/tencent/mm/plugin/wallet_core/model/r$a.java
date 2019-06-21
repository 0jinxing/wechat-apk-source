package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.wallet_core.c.b;

final class r$a
  implements a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(46865);
    paramContext = paramArrayOfString[0];
    int i = -1;
    switch (paramContext.hashCode())
    {
    default:
      switch (i)
      {
      default:
        AppMethodBeat.o(46865);
      case 0:
      }
      break;
    case -1912590262:
    }
    while (true)
    {
      return bool;
      if (!paramContext.equals("//cleanpaycn"))
        break;
      i = 0;
      break;
      b.dNJ();
      b.clean();
      bool = true;
      AppMethodBeat.o(46865);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.r.a
 * JD-Core Version:    0.6.2
 */