package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.QbSdk.PreInitCallback;
import com.tencent.xweb.WebView.c;

final class X5WebFactory$b$1
  implements QbSdk.PreInitCallback
{
  private boolean AQK = false;
  private boolean AQL = false;

  X5WebFactory$b$1(WebView.c paramc)
  {
  }

  public final void onCoreInitFinished()
  {
    AppMethodBeat.i(84866);
    this.AQK = true;
    if ((this.AQK) && (this.AQL) && (this.AQM != null))
    {
      this.AQM.onCoreInitFinished();
      X5WebFactory.b.Pu();
    }
    AppMethodBeat.o(84866);
  }

  public final void onViewInitFinished(boolean paramBoolean)
  {
    AppMethodBeat.i(84867);
    this.AQL = true;
    if ((this.AQK) && (this.AQL) && (this.AQM != null))
    {
      this.AQM.onCoreInitFinished();
      X5WebFactory.b.Pu();
    }
    AppMethodBeat.o(84867);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.X5WebFactory.b.1
 * JD-Core Version:    0.6.2
 */