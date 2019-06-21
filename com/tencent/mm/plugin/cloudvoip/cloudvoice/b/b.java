package com.tencent.mm.plugin.cloudvoip.cloudvoice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ab.a;

public final class b
{
  public static int bgo()
  {
    AppMethodBeat.i(135467);
    int i;
    if (ab.dos() != null)
    {
      i = ab.dos().getLogLevel();
      AppMethodBeat.o(135467);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(135467);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.b.b
 * JD-Core Version:    0.6.2
 */