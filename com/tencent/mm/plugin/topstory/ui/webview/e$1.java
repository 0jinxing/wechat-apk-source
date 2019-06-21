package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.c;
import org.json.JSONObject;

final class e$1
  implements Runnable
{
  e$1(e parame, JSONObject paramJSONObject)
  {
  }

  @TargetApi(7)
  public final void run()
  {
    AppMethodBeat.i(2175);
    String str = this.sHI.toString();
    a.a(this.sHJ, "onSearchDataReady", str);
    c.c(this.sHJ.cPu, "dataReady", System.currentTimeMillis());
    AppMethodBeat.o(2175);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e.1
 * JD-Core Version:    0.6.2
 */