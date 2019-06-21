package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ef
  implements Runnable
{
  ef(ed paramed)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(98784);
    try
    {
      String str1 = ed.b(this.a).a();
      String str2 = ds.a().b();
      ec.c().d().a(str1, str2);
      AppMethodBeat.o(98784);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(98784);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ef
 * JD-Core Version:    0.6.2
 */