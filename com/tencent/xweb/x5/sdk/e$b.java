package com.tencent.xweb.x5.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.QbSdk.PreInitCallback;

final class e$b
  implements QbSdk.PreInitCallback
{
  d.a AQY;

  public e$b(d.a parama)
  {
    this.AQY = parama;
  }

  public final void onCoreInitFinished()
  {
  }

  public final void onViewInitFinished(boolean paramBoolean)
  {
    AppMethodBeat.i(85094);
    if (this.AQY != null)
      this.AQY.onViewInitFinished(paramBoolean);
    AppMethodBeat.o(85094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.sdk.e.b
 * JD-Core Version:    0.6.2
 */