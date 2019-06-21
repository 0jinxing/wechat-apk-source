package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class e$4
  implements Runnable
{
  e$4(e parame, JSONObject paramJSONObject)
  {
  }

  @TargetApi(7)
  public final void run()
  {
    AppMethodBeat.i(2178);
    String str = String.format("javascript:window.activity_state_change && activity_state_change(%s)", new Object[] { this.sHL.toString() });
    this.sHJ.sHG.evaluateJavascript(str, null);
    AppMethodBeat.o(2178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e.4
 * JD-Core Version:    0.6.2
 */