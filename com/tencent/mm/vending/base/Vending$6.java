package com.tencent.mm.vending.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class Vending$6 extends Handler
{
  Vending$6(Vending paramVending, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(126158);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(126158);
      while (true)
      {
        return;
        Vending.f(this.zXo);
        AppMethodBeat.o(126158);
      }
      this.zXo.destroyAsynchronous();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.base.Vending.6
 * JD-Core Version:    0.6.2
 */