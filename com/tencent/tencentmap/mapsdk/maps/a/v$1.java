package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.Date;

final class v$1
  implements Runnable
{
  v$1(v paramv, String paramString1, String paramString2, Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(100561);
    String str = this.a;
    try
    {
      l1 = e.d(this.b).getTime() / 1000L;
      long l2 = l1;
      if (l1 == 0L)
        l2 = new Date().getTime() / 1000L + 86400L;
      Context localContext = this.c;
      this.d.getClass();
      e.a(localContext, "sid", new Object[] { str, Long.valueOf(l2) });
      AppMethodBeat.o(100561);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        long l1 = 0L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.v.1
 * JD-Core Version:    0.6.2
 */