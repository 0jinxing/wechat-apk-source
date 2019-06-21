package com.tencent.mm.plugin.qqmail.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.v;

final class ReadMailProxy$5
  implements Runnable
{
  ReadMailProxy$5(ReadMailProxy paramReadMailProxy, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68094);
    ac.ccC().cancel(this.pvQ);
    AppMethodBeat.o(68094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.stub.ReadMailProxy.5
 * JD-Core Version:    0.6.2
 */