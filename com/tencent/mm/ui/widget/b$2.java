package com.tencent.mm.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107852);
    if (this.zMc.zMb != null)
    {
      ab.w("MicroMsg.InputPanelHelper", "onKeyboardHideOnce not run in measure");
      this.zMc.zMb.run();
      this.zMc.zMb = null;
    }
    AppMethodBeat.o(107852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.2
 * JD-Core Version:    0.6.2
 */