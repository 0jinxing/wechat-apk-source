package com.tencent.mm.plugin.webview.luggage.ipc;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity.a;

final class b$1
  implements MMActivity.a
{
  b$1(a parama)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6246);
    if (paramInt1 == 3456)
      if ((paramIntent == null) || (this.ujH == null))
        AppMethodBeat.o(6246);
    while (true)
    {
      return;
      paramIntent = paramIntent.getBundleExtra("input_data");
      this.ujH.l(paramIntent);
      AppMethodBeat.o(6246);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.ipc.b.1
 * JD-Core Version:    0.6.2
 */