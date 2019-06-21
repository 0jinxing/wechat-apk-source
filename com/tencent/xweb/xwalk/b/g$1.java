package com.tencent.xweb.xwalk.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;
import org.xwalk.core.XWalkInitializer;

final class g$1 extends TimerTask
{
  g$1(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(85491);
    XWalkInitializer.addXWalkInitializeLog("task retry execute ! mRetrytimes = " + g.a(this.ATI));
    g.a(g.b(this.ATI), g.c(this.ATI), g.a(this.ATI));
    g.d(this.ATI);
    AppMethodBeat.o(85491);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.b.g.1
 * JD-Core Version:    0.6.2
 */