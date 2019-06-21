package com.tencent.xweb.x5;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$a extends com.tencent.smtt.sdk.WebView
{
  public k$a(k paramk, Context paramContext)
  {
    super(paramContext);
  }

  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(84908);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.AQS.APS != null)
      this.AQS.APS.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(84908);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.k.a
 * JD-Core Version:    0.6.2
 */