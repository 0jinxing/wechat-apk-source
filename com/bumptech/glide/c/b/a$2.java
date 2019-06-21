package com.bumptech.glide.c.b;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.ReferenceQueue;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91746);
    Process.setThreadPriority(10);
    a locala = this.azO;
    while (!locala.azM)
      try
      {
        Object localObject = (a.b)locala.azK.remove();
        locala.awA.obtainMessage(1, localObject).sendToTarget();
        localObject = locala.azN;
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
      }
    AppMethodBeat.o(91746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.2
 * JD-Core Version:    0.6.2
 */