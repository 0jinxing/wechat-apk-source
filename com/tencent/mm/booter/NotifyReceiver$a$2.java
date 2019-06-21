package com.tencent.mm.booter;

import android.os.Process;
import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.plugin.zero.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class NotifyReceiver$a$2
  implements Runnable
{
  NotifyReceiver$a$2(NotifyReceiver.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57781);
    ab.i("MicroMsg.NotifyReceiver", "checkKillProcess, canKillProcess :%b", new Object[] { Boolean.valueOf(NotifyReceiver.access$900()) });
    synchronized (NotifyReceiver.Ip())
    {
      if (NotifyReceiver.Iq() != null)
        NotifyReceiver.Iq().unLock();
      NotifyReceiver.a(null);
      if (NotifyReceiver.access$900())
      {
        ??? = (PluginZero)g.M(PluginZero.class);
        if (((PluginZero)???).uZT != null)
          ((PluginZero)???).uZT.aVq();
        ab.dou();
        Process.killProcess(Process.myPid());
      }
      AppMethodBeat.o(57781);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.NotifyReceiver.a.2
 * JD-Core Version:    0.6.2
 */