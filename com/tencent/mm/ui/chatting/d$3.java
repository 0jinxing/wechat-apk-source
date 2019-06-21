package com.tencent.mm.ui.chatting;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class d$3 extends ak
{
  d$3(d paramd, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(30407);
    super.handleMessage(paramMessage);
    try
    {
      ab.i("MicroMsg.AutoPlay", "startPlayHandler start Play");
      this.yHc.dBz();
      AppMethodBeat.o(30407);
      return;
    }
    catch (Exception paramMessage)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AutoPlay", paramMessage, "", new Object[0]);
        AppMethodBeat.o(30407);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.d.3
 * JD-Core Version:    0.6.2
 */