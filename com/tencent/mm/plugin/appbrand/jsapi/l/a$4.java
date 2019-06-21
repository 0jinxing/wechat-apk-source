package com.tencent.mm.plugin.appbrand.jsapi.l;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity.a;

final class a$4
  implements MMActivity.a
{
  a$4(a parama, b.a parama1)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131404);
    if (paramInt1 != (this.hTM.hashCode() & 0xFFFF))
      AppMethodBeat.o(131404);
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        if (this.hTL != null)
          this.hTL.a(1, null, null);
        AppMethodBeat.o(131404);
      }
      else
      {
        if (paramInt2 == 2)
        {
          if (this.hTL != null)
            if (paramIntent == null)
              break label100;
          label100: for (paramIntent = paramIntent.getStringExtra("key_result_errmsg"); ; paramIntent = "")
          {
            this.hTL.a(2, paramIntent, null);
            AppMethodBeat.o(131404);
            break;
          }
        }
        if (this.hTL != null)
          this.hTL.a(3, null, null);
        AppMethodBeat.o(131404);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.a.4
 * JD-Core Version:    0.6.2
 */