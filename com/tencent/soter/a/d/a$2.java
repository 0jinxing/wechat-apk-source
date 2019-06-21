package com.tencent.soter.a.d;

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
    AppMethodBeat.i(10468);
    this.AvQ.zZp.cancel();
    AppMethodBeat.o(10468);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.d.a.2
 * JD-Core Version:    0.6.2
 */