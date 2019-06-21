package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.tools.d;
import com.tencent.mm.pluginsdk.ui.tools.t;

final class q$a
  implements Runnable
{
  String url;

  private q$a(q paramq)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81241);
    if ((this.qfG.qet == null) || (q.g(this.qfG)))
      AppMethodBeat.o(81241);
    while (true)
    {
      return;
      t.a(new d());
      Intent localIntent = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("jsapi_args_appid", "wx751a1acca5688ba3");
      localIntent.putExtra("jsapiargs", localBundle);
      localIntent.putExtra("rawUrl", this.url);
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("title", 2131302738);
      localIntent.putExtra("webview_bg_color_rsID", 2131689761);
      localIntent.putExtra("geta8key_scene", 13);
      localIntent.setFlags(65536);
      c.gkE.i(localIntent, this.qfG.qet.getContext());
      this.qfG.qet.getContext().finish();
      this.qfG.qet.getContext().overridePendingTransition(0, 0);
      AppMethodBeat.o(81241);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.q.a
 * JD-Core Version:    0.6.2
 */