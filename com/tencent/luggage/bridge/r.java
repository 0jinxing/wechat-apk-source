package com.tencent.luggage.bridge;

import android.webkit.JavascriptInterface;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class r
{
  private n bOO;

  r(n paramn)
  {
    this.bOO = paramn;
  }

  @JavascriptInterface
  public final String send(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(90746);
    paramString = this.bOO.h(paramString, paramBoolean);
    AppMethodBeat.o(90746);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.r
 * JD-Core Version:    0.6.2
 */