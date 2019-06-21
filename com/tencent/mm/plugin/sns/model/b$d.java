package com.tencent.mm.plugin.sns.model;

import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$d
  implements MessageQueue.IdleHandler
{
  b$d(b paramb)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(36105);
    ab.d("MicroMsg.DownloadManager", "I run idleHandler ");
    b.a(this.qHQ, bo.anT());
    boolean bool = b.a(this.qHQ);
    AppMethodBeat.o(36105);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.b.d
 * JD-Core Version:    0.6.2
 */