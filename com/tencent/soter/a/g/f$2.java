package com.tencent.soter.a.g;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$2
  implements Runnable
{
  f$2(f paramf, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10482);
    synchronized (f.a(this.Awy))
    {
      d locald = (d)f.Ql().get(this.uqF);
      if (locald != null)
        locald.dRm();
      AppMethodBeat.o(10482);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.f.2
 * JD-Core Version:    0.6.2
 */