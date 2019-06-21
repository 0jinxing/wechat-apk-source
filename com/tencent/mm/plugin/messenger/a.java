package com.tencent.mm.plugin.messenger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.storage.ad;

public final class a
  implements b
{
  public final String a(ad paramad, String paramString)
  {
    AppMethodBeat.i(136872);
    paramad = s.a(paramad, paramString);
    AppMethodBeat.o(136872);
    return paramad;
  }

  public final String c(ad paramad)
  {
    AppMethodBeat.i(136874);
    paramad = s.c(paramad);
    AppMethodBeat.o(136874);
    return paramad;
  }

  public final String getDisplayName(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136870);
    paramString1 = s.getDisplayName(paramString1, paramString2);
    AppMethodBeat.o(136870);
    return paramString1;
  }

  public final String mI(String paramString)
  {
    AppMethodBeat.i(136873);
    paramString = s.mI(paramString);
    AppMethodBeat.o(136873);
    return paramString;
  }

  public final String mJ(String paramString)
  {
    AppMethodBeat.i(136871);
    paramString = s.mJ(paramString);
    AppMethodBeat.o(136871);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.a
 * JD-Core Version:    0.6.2
 */