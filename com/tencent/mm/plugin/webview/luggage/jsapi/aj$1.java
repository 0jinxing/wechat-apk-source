package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Intent;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

final class aj$1
  implements MMActivity.a
{
  aj$1(aj paramaj, a.a parama, MMActivity paramMMActivity)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6347);
    if (paramInt1 == (this.ukq.hashCode() & 0xFFFF))
      switch (paramInt2)
      {
      default:
        this.mUf.a("fail", null);
      case 0:
      case -1:
      }
    while (true)
    {
      this.icV.ifE = null;
      AppMethodBeat.o(6347);
      return;
      this.mUf.a("cancel", null);
      continue;
      this.mUf.a("", null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aj.1
 * JD-Core Version:    0.6.2
 */