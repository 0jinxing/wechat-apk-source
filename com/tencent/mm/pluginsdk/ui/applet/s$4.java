package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class s$4
  implements Runnable
{
  s$4(s params)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79792);
    if ((this.vlo.context instanceof MMActivity))
      ((MMActivity)this.vlo.context).showVKB();
    AppMethodBeat.o(79792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.s.4
 * JD-Core Version:    0.6.2
 */