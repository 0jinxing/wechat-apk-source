package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

final class e$a$1
  implements MMActivity.a
{
  e$a$1(e.a parama, MMActivity paramMMActivity)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(17036);
    e.e(this.icW.icM).b(this.icV, paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(17036);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e.a.1
 * JD-Core Version:    0.6.2
 */