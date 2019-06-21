package com.tencent.mm.modelfriend;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Random;

final class AddrBookObserver$1 extends ak
{
  AddrBookObserver$1(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(124497);
    super.handleMessage(paramMessage);
    paramMessage = (Context)paramMessage.obj;
    if (AddrBookObserver.age() == null)
    {
      AddrBookObserver.t(new Intent());
      AddrBookObserver.age().setClass(paramMessage, AddrBookObserver.AddrBookService.class);
    }
    float f = new Random(System.currentTimeMillis()).nextFloat();
    AddrBookObserver.age().putExtra(AddrBookObserver.AddrBookService.fAX, f);
    try
    {
      ab.i("MicroMsg.AddrBookObserver", "time's up, start AddrBookObserver, session:%f", new Object[] { Float.valueOf(f) });
      d.aH(AddrBookObserver.age());
      AppMethodBeat.o(124497);
      return;
    }
    catch (Exception paramMessage)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AddrBookObserver", paramMessage, "startService failed", new Object[0]);
        AppMethodBeat.o(124497);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.AddrBookObserver.1
 * JD-Core Version:    0.6.2
 */