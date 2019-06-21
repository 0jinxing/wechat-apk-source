package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class ab$1 extends ak
{
  ab$1(ab paramab, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(36363);
    super.handleMessage(paramMessage);
    if ((ab.a(this.qKn) >= 5) || (System.currentTimeMillis() - ab.b(this.qKn) > 300000L))
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.RemoveSnsTask", "cleanCount: " + ab.a(this.qKn));
      ab.nLD = false;
      AppMethodBeat.o(36363);
    }
    while (true)
    {
      return;
      if (ab.c(this.qKn))
      {
        AppMethodBeat.o(36363);
      }
      else
      {
        if (ab.nLD)
          new ab.a(this.qKn).u(new String[] { "" });
        AppMethodBeat.o(36363);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ab.1
 * JD-Core Version:    0.6.2
 */