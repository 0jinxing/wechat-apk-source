package com.tencent.mm.plugin.appbrand.appusage;

import android.os.DeadObjectException;
import android.os.Looper;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.e.b;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class o$b$2
  implements b
{
  o$b$2(o.b paramb, k.a parama)
  {
  }

  public final void d(Exception paramException)
  {
    AppMethodBeat.i(129588);
    if ((paramException instanceof DeadObjectException))
    {
      new ak(Looper.myLooper()).post(new o.b.2.1(this));
      AppMethodBeat.o(129588);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.AppBrandLocalUsageStorageIPCImpl", "onExceptionOccur(%s)", new Object[] { Log.getStackTraceString(paramException) });
      AppMethodBeat.o(129588);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.o.b.2
 * JD-Core Version:    0.6.2
 */