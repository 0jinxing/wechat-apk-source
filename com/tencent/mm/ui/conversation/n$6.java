package com.tencent.mm.ui.conversation;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.sdk.platformtools.ab;

final class n$6
  implements MessageQueue.IdleHandler
{
  n$6(n paramn)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(34600);
    ab.d("MicroMsg.RefreshHelper", "dkuploadAddrBook idleHandler");
    if ((aw.RK()) && (l.apS() == l.a.gvz) && (!l.apR()))
    {
      al localal = new al(l.aqb(), l.aqa());
      aw.Rg().a(localal, 0);
    }
    Looper.myQueue().removeIdleHandler(this.zvB.jQs);
    AppMethodBeat.o(34600);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.n.6
 * JD-Core Version:    0.6.2
 */