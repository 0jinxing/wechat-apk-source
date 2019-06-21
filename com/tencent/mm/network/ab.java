package com.tencent.mm.network;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.a.b;
import com.tencent.mm.sdk.platformtools.at;

public final class ab
{
  public b geg = null;
  public boolean geh = false;

  public static boolean cg(Context paramContext)
  {
    AppMethodBeat.i(58681);
    boolean bool;
    if ((paramContext != null) && (!at.isWap(paramContext)))
    {
      bool = true;
      AppMethodBeat.o(58681);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(58681);
    }
  }

  public static boolean ch(Context paramContext)
  {
    AppMethodBeat.i(58682);
    boolean bool;
    if ((paramContext != null) && (at.isWifi(paramContext)))
    {
      bool = true;
      AppMethodBeat.o(58682);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(58682);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ab
 * JD-Core Version:    0.6.2
 */