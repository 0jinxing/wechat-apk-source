package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class cz
  implements Runnable
{
  cz(cy paramcy, cs paramcs, long paramLong)
  {
  }

  public final void run()
  {
    boolean bool1 = false;
    AppMethodBeat.i(98687);
    try
    {
      cv localcv = this.a.a();
      this.a.k = (SystemClock.elapsedRealtime() - this.b);
      this.a.a(false);
      boolean bool2 = bool1;
      if (localcv.a == 0)
      {
        int i = localcv.c;
        bool2 = bool1;
        if (i == 200)
          bool2 = true;
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        cy.a(this.c, false);
        AppMethodBeat.o(98687);
      }
    }
    finally
    {
      cy.a(this.c, false);
      AppMethodBeat.o(98687);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cz
 * JD-Core Version:    0.6.2
 */