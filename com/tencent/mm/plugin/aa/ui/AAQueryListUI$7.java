package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class AAQueryListUI$7
  implements a.a
{
  AAQueryListUI$7(AAQueryListUI paramAAQueryListUI)
  {
  }

  public final void aos()
  {
    AppMethodBeat.i(40736);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", AAQueryListUI.m(this.gnt));
    d.b(this.gnt, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(40736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAQueryListUI.7
 * JD-Core Version:    0.6.2
 */