package com.tencent.mm.plugin.music.model.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.plugin.music.e.a;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.sdk.platformtools.ag;

public final class b
{
  public static String Tm(String paramString)
  {
    AppMethodBeat.i(104961);
    e locale = k.bUf().oLX.bTQ();
    if ((locale == null) || (!paramString.equalsIgnoreCase(locale.fJU)))
    {
      paramString = "0_" + ag.ck(paramString);
      AppMethodBeat.o(104961);
    }
    while (true)
    {
      return paramString;
      paramString = com.tencent.mm.plugin.music.h.b.K(locale);
      AppMethodBeat.o(104961);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.b
 * JD-Core Version:    0.6.2
 */