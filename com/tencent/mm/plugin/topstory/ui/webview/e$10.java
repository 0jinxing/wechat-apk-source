package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$10
  implements Runnable
{
  public e$10(e parame, String paramString)
  {
  }

  @TargetApi(7)
  public final void run()
  {
    AppMethodBeat.i(2184);
    a.a(this.sHJ, "onWebRecommendPostComments", this.sHO);
    AppMethodBeat.o(2184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e.10
 * JD-Core Version:    0.6.2
 */