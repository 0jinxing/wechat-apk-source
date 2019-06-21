package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$3
  implements Runnable
{
  e$3(e parame)
  {
  }

  @TargetApi(7)
  public final void run()
  {
    AppMethodBeat.i(2177);
    a.a(this.sHJ, "onNavBarShadowManuallyHidden", "");
    AppMethodBeat.o(2177);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e.3
 * JD-Core Version:    0.6.2
 */