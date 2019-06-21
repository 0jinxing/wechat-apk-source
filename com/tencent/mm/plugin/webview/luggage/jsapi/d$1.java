package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity.a;

final class d$1
  implements MMActivity.a
{
  d$1(d paramd, bc.a parama)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6282);
    if (paramInt1 == (this.ujW.hashCode() & 0xFFFF))
      if (paramInt2 == -1)
      {
        this.kOx.d(null, null);
        AppMethodBeat.o(6282);
      }
    while (true)
    {
      return;
      this.kOx.d("fail", null);
      AppMethodBeat.o(6282);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.d.1
 * JD-Core Version:    0.6.2
 */