package com.tencent.mm.booter;

import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NotifyReceiver$a$1
  implements MessageQueue.IdleHandler
{
  NotifyReceiver$a$1(NotifyReceiver.a parama)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(57780);
    NotifyReceiver.a.a(this.eck);
    AppMethodBeat.o(57780);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.NotifyReceiver.a.1
 * JD-Core Version:    0.6.2
 */