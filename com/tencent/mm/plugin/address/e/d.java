package com.tencent.mm.plugin.address.e;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public static void wG(String paramString)
  {
    AppMethodBeat.i(17013);
    if (Build.VERSION.SDK_INT >= 11)
    {
      new b();
      b.wG(paramString);
      AppMethodBeat.o(17013);
    }
    while (true)
    {
      return;
      new c();
      c.wG(paramString);
      AppMethodBeat.o(17013);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.e.d
 * JD-Core Version:    0.6.2
 */