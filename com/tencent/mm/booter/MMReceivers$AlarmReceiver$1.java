package com.tencent.mm.booter;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class MMReceivers$AlarmReceiver$1
  implements Runnable
{
  MMReceivers$AlarmReceiver$1(MMReceivers.AlarmReceiver paramAlarmReceiver)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57766);
    mw localmw = new mw();
    a.xxA.a(localmw, Looper.getMainLooper());
    ab.i("MicroMsg.AlarmReceiver", "onReceive() publish PushKeepAliveEvent");
    AppMethodBeat.o(57766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MMReceivers.AlarmReceiver.1
 * JD-Core Version:    0.6.2
 */