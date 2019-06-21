package com.tencent.mm.bf;

import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2$1
  implements MessageQueue.IdleHandler
{
  e$2$1(e.2 param2)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(116556);
    this.fQU.fQT.b(new e.2.1.1(this));
    AppMethodBeat.o(116556);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.e.2.1
 * JD-Core Version:    0.6.2
 */