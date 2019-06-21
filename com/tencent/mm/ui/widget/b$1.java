package com.tencent.mm.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107851);
    if (this.zMc.zMa != null)
    {
      ab.w("MicroMsg.InputPanelHelper", "onKeyboardShowOnce not run in measure");
      this.zMc.zMa.run();
      this.zMc.zMa = null;
    }
    AppMethodBeat.o(107851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.1
 * JD-Core Version:    0.6.2
 */