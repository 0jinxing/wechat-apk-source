package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g;

public final class c
  implements g
{
  public final o a(Context paramContext, String paramString1, int paramInt, n paramn, String paramString2)
  {
    AppMethodBeat.i(27637);
    paramContext = new b(paramContext, paramString1, paramInt, paramn, paramString2);
    AppMethodBeat.o(27637);
    return paramContext;
  }

  public final o a(Context paramContext, String paramString1, int paramInt, n paramn, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(27638);
    paramContext = new b(paramContext, paramString1, paramInt, paramn, paramBoolean, paramString2);
    AppMethodBeat.o(27638);
    return paramContext;
  }

  public final o a(Context paramContext, String paramString, n paramn)
  {
    AppMethodBeat.i(27636);
    paramContext = new b(paramContext, paramString, paramn);
    AppMethodBeat.o(27636);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.c
 * JD-Core Version:    0.6.2
 */