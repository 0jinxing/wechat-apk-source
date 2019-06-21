package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class v$a$2
  implements MessageQueue.IdleHandler
{
  v$a$2(Context paramContext)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(114665);
    Looper.myQueue().removeIdleHandler(this);
    v.a.fI(this.val$context);
    AppMethodBeat.o(114665);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.v.a.2
 * JD-Core Version:    0.6.2
 */