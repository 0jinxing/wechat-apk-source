package com.tencent.soter.a.a;

import android.os.CancellationSignal;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10460);
    this.AvL.zZp.cancel();
    AppMethodBeat.o(10460);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.a.a.2
 * JD-Core Version:    0.6.2
 */