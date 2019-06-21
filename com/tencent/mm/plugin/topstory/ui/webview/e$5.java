package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class e$5
  implements Runnable
{
  e$5(e parame, JSONObject paramJSONObject)
  {
  }

  @TargetApi(7)
  public final void run()
  {
    AppMethodBeat.i(2179);
    String str = this.sHM.toString();
    a.a(this.sHJ, "notifyNumReddotChange", str);
    AppMethodBeat.o(2179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e.5
 * JD-Core Version:    0.6.2
 */