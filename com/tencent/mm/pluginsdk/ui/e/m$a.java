package com.tencent.mm.pluginsdk.ui.e;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class m$a
  implements Runnable
{
  m$a(m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79868);
    if ((m.a(this.vst) != null) && (m.a(this.vst).isPressed()))
    {
      ab.d("MicroMsg.PressSpanTouchListener", "long pressed timeout");
      m.b(this.vst);
      this.vst.bHM();
    }
    AppMethodBeat.o(79868);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.m.a
 * JD-Core Version:    0.6.2
 */