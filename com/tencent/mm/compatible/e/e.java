package com.tencent.mm.compatible.e;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e
  implements d.a
{
  public static d.a.a b(Looper paramLooper)
  {
    Object localObject = null;
    AppMethodBeat.i(92927);
    d.a.a locala = new d.a.a();
    try
    {
      locala.erH = u.c(paramLooper);
      locala.rotate = 0;
      if (locala.erH == null)
      {
        AppMethodBeat.o(92927);
        paramLooper = localObject;
        return paramLooper;
      }
    }
    catch (Exception paramLooper)
    {
      while (true)
      {
        AppMethodBeat.o(92927);
        paramLooper = localObject;
        continue;
        AppMethodBeat.o(92927);
        paramLooper = locala;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.e
 * JD-Core Version:    0.6.2
 */