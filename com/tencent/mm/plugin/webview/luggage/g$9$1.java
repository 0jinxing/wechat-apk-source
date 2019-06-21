package com.tencent.mm.plugin.webview.luggage;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.c;

final class g$9$1
  implements Runnable
{
  g$9$1(g.9 param9, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6131);
    c.a(this.cgJ.getInt("fav_simple_img_result"), (Activity)g.a(this.uiO.uiJ).mContext, g.c(this.uiO.uiJ));
    AppMethodBeat.o(6131);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.9.1
 * JD-Core Version:    0.6.2
 */