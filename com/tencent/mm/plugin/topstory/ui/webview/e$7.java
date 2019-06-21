package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$7
  implements Runnable
{
  public e$7(e parame, String paramString)
  {
  }

  @TargetApi(7)
  public final void run()
  {
    AppMethodBeat.i(2181);
    a.a(this.sHJ, "onWebRecommendCommCgiResult", this.sHN);
    AppMethodBeat.o(2181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e.7
 * JD-Core Version:    0.6.2
 */