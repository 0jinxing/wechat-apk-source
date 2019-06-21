package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity.a;

final class e$2$1
  implements MMActivity.a
{
  e$2$1(e.2 param2)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131020);
    if (paramInt1 == 1)
    {
      if (this.hIK.hIJ != null)
        this.hIK.hIJ.a(true, "ok", paramIntent);
      this.hIK.hIA.aBW();
    }
    AppMethodBeat.o(131020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.e.2.1
 * JD-Core Version:    0.6.2
 */