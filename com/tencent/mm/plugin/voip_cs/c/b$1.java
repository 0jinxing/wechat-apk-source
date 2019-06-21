package com.tencent.mm.plugin.voip_cs.c;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$1
  implements ap.a
{
  b$1(b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(135437);
    int i = this.teP.sWC[(this.teP.sWE % this.teP.sWC.length)];
    if (this.teP.sW != null)
    {
      if (-1 != i)
        break label78;
      this.teP.sW.setText(null);
    }
    while (true)
    {
      b localb = this.teP;
      localb.sWE += 1;
      AppMethodBeat.o(135437);
      return true;
      label78: this.teP.sW.setText(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.c.b.1
 * JD-Core Version:    0.6.2
 */