package com.tencent.mm.ui.chatting;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.chatting.c.as;

final class d$2 extends ak
{
  d$2(d paramd, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(30406);
    super.handleMessage(paramMessage);
    try
    {
      ab.i("MicroMsg.AutoPlay", "reset speaker");
      d.a(this.yHc);
      paramMessage = this.yHc;
      if (!this.yHc.yGQ.mfQ);
      for (boolean bool = true; ; bool = false)
      {
        paramMessage.mfP = bool;
        AppMethodBeat.o(30406);
        return;
      }
    }
    catch (Exception paramMessage)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AutoPlay", paramMessage, "", new Object[0]);
        AppMethodBeat.o(30406);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.d.2
 * JD-Core Version:    0.6.2
 */