package com.tencent.mm.d.a;

import com.eclipsesource.v8.MultiContextV8;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Timer;

final class m$1
  implements Runnable
{
  m$1(m paramm, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113852);
    if (this.cig.chm == null)
    {
      localObject = new IllegalStateException("V8DebuggerHelper v8 null");
      AppMethodBeat.o(113852);
      throw ((Throwable)localObject);
    }
    this.cig.chm.waitForDebugger(this.chV);
    Object localObject = this.cig;
    if (((m)localObject).cie == null)
    {
      ((m)localObject).cie = new Timer();
      ((m)localObject).cie.schedule(new m.4((m)localObject), 2000L, 2000L);
    }
    AppMethodBeat.o(113852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.m.1
 * JD-Core Version:    0.6.2
 */