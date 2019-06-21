package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;

final class am$3
  implements Runnable
{
  am$3(am paramam)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27413);
    SightVideoJNI.registerALL();
    AppMethodBeat.o(27413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.am.3
 * JD-Core Version:    0.6.2
 */