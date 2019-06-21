package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class at$b
  implements ap.a
{
  private Runnable fZM;

  at$b(Runnable paramRunnable)
  {
    this.fZM = paramRunnable;
  }

  public final boolean BI()
  {
    AppMethodBeat.i(6805);
    if (this.fZM != null)
      this.fZM.run();
    AppMethodBeat.o(6805);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.at.b
 * JD-Core Version:    0.6.2
 */