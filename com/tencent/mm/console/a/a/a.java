package com.tencent.mm.console.a.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(16152);
    if (paramArrayOfString.length <= 1)
    {
      AppMethodBeat.o(16152);
      return bool;
    }
    if (bo.getInt(paramArrayOfString[1], 0) > 0);
    for (com.tencent.mm.plugin.hardcoder.a.nqe = true; ; com.tencent.mm.plugin.hardcoder.a.nqe = false)
    {
      AppMethodBeat.o(16152);
      bool = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.a.a
 * JD-Core Version:    0.6.2
 */