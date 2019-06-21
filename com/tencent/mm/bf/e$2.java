package com.tencent.mm.bf;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2
  implements Runnable
{
  e$2(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116557);
    Looper.myQueue().addIdleHandler(new e.2.1(this));
    AppMethodBeat.o(116557);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.e.2
 * JD-Core Version:    0.6.2
 */