package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d.a;

final class h$4
  implements d.a
{
  h$4(h paramh)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(1716);
    if (h.a(this.sDP))
    {
      this.sDP.sDN.cFV().cEf();
      h.b(this.sDP);
    }
    this.sDP.sDN.cGc();
    AppMethodBeat.o(1716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.h.4
 * JD-Core Version:    0.6.2
 */