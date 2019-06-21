package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity.a;

final class d$3$1
  implements MMActivity.a
{
  d$3$1(d.3 param3)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131002);
    if (paramInt1 == 1)
    {
      if (this.hIC.hIv != null)
        this.hIC.hIv.a(true, "ok", paramIntent);
      this.hIC.hIA.aBW();
    }
    AppMethodBeat.o(131002);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.d.3.1
 * JD-Core Version:    0.6.2
 */