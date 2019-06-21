package com.tencent.mm.plugin.account.model;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class h$1 extends ak
{
  h$1(h paramh)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(124688);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(124688);
      while (true)
      {
        return;
        if (this.gyP.gyO == null)
          break;
        this.gyP.gyO.onError(paramMessage.arg1, (String)paramMessage.obj);
        AppMethodBeat.o(124688);
      }
      if (this.gyP.gyO != null)
        this.gyP.gyO.p(paramMessage.getData());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.h.1
 * JD-Core Version:    0.6.2
 */