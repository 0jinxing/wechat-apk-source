package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Intent;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

final class ax$1
  implements MMActivity.a
{
  ax$1(ax paramax, a.a parama, MMActivity paramMMActivity)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6382);
    if (paramInt1 == (this.ukx.hashCode() & 0xFFFF))
    {
      if (paramInt2 != -1)
        break label50;
      this.mUf.a("", null);
    }
    while (true)
    {
      this.icV.ifE = null;
      AppMethodBeat.o(6382);
      return;
      label50: this.mUf.a("cancel", null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ax.1
 * JD-Core Version:    0.6.2
 */