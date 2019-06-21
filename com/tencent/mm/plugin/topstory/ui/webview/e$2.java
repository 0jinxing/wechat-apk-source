package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$2
  implements Runnable
{
  public e$2(e parame, String paramString)
  {
  }

  @TargetApi(7)
  public final void run()
  {
    AppMethodBeat.i(2176);
    a.a(this.sHJ, "onWebRecommendNotifyReddotExtMsg", this.sHK);
    AppMethodBeat.o(2176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e.2
 * JD-Core Version:    0.6.2
 */