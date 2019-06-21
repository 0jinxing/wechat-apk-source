package com.tencent.mm.d.a;

import android.content.ComponentCallbacks2;
import com.eclipsesource.v8.MultiContextV8;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class x
{
  private static final String TAG;
  private final MultiContextV8 chm;
  private final int ciO;
  private Integer ciP;
  private boolean ciQ;
  private int ciR;
  private final Runnable ciS;
  private final ComponentCallbacks2 ciT;

  static
  {
    AppMethodBeat.i(113928);
    TAG = "MicroMsg.V8MemoryPressureMonitor" + ah.getProcessName().replace("com.tencent.mm", "");
    AppMethodBeat.o(113928);
  }

  public x(MultiContextV8 paramMultiContextV8)
  {
    AppMethodBeat.i(113922);
    this.ciO = 1000;
    this.ciP = null;
    this.ciR = 0;
    this.ciS = new x.1(this);
    this.chm = paramMultiContextV8;
    this.ciT = new x.2(this);
    AppMethodBeat.o(113922);
  }

  private static void CF()
  {
    AppMethodBeat.i(113925);
    ab.i(TAG, "startThrottlingInterval");
    AppMethodBeat.o(113925);
  }

  private void gs(int paramInt)
  {
    AppMethodBeat.i(113924);
    CF();
    this.ciR = paramInt;
    String str;
    if (paramInt == 2)
      str = "CRITICAL";
    while (true)
    {
      ab.i(TAG, "reportPressure [%s]", new Object[] { str });
      this.chm.memoryPressureNotification(paramInt);
      AppMethodBeat.o(113924);
      return;
      if (paramInt == 1)
        str = "MODERATE";
      else
        str = "NONE";
    }
  }

  public final void gr(int paramInt)
  {
    AppMethodBeat.i(113923);
    if (this.ciQ)
    {
      ab.i(TAG, "notifyPressure but throttle");
      this.ciP = Integer.valueOf(paramInt);
      AppMethodBeat.o(113923);
    }
    while (true)
    {
      return;
      gs(paramInt);
      AppMethodBeat.o(113923);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.x
 * JD-Core Version:    0.6.2
 */