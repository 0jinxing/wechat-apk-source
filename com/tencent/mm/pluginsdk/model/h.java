package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h
{
  public static void a(Context paramContext, String[] paramArrayOfString, h.a parama)
  {
    AppMethodBeat.i(79213);
    if ((parama == null) || (paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      paramContext = new IllegalArgumentException();
      AppMethodBeat.o(79213);
      throw paramContext;
    }
    new h.1(paramContext, paramArrayOfString, parama).execute(new Void[0]);
    AppMethodBeat.o(79213);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.h
 * JD-Core Version:    0.6.2
 */