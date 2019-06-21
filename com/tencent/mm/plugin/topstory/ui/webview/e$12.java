package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$12
  implements Runnable
{
  public e$12(e parame, String paramString)
  {
  }

  @TargetApi(7)
  public final void run()
  {
    AppMethodBeat.i(2186);
    a.a(this.sHJ, "onWebRecommendInfoUpdate", this.sHK);
    AppMethodBeat.o(2186);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e.12
 * JD-Core Version:    0.6.2
 */