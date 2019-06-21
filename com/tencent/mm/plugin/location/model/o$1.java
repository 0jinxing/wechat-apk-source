package com.tencent.mm.plugin.location.model;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class o$1 extends ak
{
  o$1(o paramo, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(113383);
    super.handleMessage(paramMessage);
    if (paramMessage == null)
    {
      AppMethodBeat.o(113383);
      return;
    }
    o localo = this.nKV;
    switch (paramMessage.what)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(113383);
      break;
      localo.bJH();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.o.1
 * JD-Core Version:    0.6.2
 */