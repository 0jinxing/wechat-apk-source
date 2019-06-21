package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class e$6
  implements Runnable
{
  e$6(e parame, JSONObject paramJSONObject)
  {
  }

  @TargetApi(7)
  public final void run()
  {
    AppMethodBeat.i(2180);
    String str = this.sHM.toString();
    a.a(this.sHJ, "notifyReddot", str);
    AppMethodBeat.o(2180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e.6
 * JD-Core Version:    0.6.2
 */