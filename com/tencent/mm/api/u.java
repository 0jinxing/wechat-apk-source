package com.tencent.mm.api;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class u
{
  public static u.a cda;

  public static t AH()
  {
    AppMethodBeat.i(123960);
    t localt = cda.AI();
    AppMethodBeat.o(123960);
    return localt;
  }

  public static SmileyPanel aR(Context paramContext)
  {
    AppMethodBeat.i(123958);
    paramContext = cda.aS(paramContext);
    AppMethodBeat.o(123958);
    return paramContext;
  }

  public static SmileyPanel i(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(123959);
    paramContext = cda.j(paramContext, paramBoolean);
    AppMethodBeat.o(123959);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.api.u
 * JD-Core Version:    0.6.2
 */