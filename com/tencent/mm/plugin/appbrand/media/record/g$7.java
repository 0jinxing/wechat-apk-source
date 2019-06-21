package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam;

public final class g$7
  implements Runnable
{
  public g$7(g paramg, RecordParam paramRecordParam)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105609);
    synchronized (g.f(this.ilC))
    {
      g.a(this.ilC, this.ilD);
      g.g(this.ilC);
      AppMethodBeat.o(105609);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.g.7
 * JD-Core Version:    0.6.2
 */