package com.tencent.mm.plugin.appbrand.jsapi.l;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity.a;

final class a$3
  implements MMActivity.a
{
  a$3(a parama, b.a parama1)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131403);
    if (paramInt1 != (this.hTM.hashCode() & 0xFFFF))
      AppMethodBeat.o(131403);
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        if (this.hTL != null)
        {
          this.hTL.a(1, null, null);
          AppMethodBeat.o(131403);
        }
      }
      else
      {
        if (this.hTL != null)
          this.hTL.a(2, null, null);
        AppMethodBeat.o(131403);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.a.3
 * JD-Core Version:    0.6.2
 */