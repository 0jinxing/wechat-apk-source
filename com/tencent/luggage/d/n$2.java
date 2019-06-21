package com.tencent.luggage.d;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$2 extends l
{
  n$2(n paramn)
  {
  }

  public final WebResourceResponse a(WebResourceRequest paramWebResourceRequest, Bundle paramBundle)
  {
    AppMethodBeat.i(90846);
    if (this.bPS.xu() != null)
    {
      paramWebResourceRequest = this.bPS.xu().a(paramWebResourceRequest, paramBundle);
      AppMethodBeat.o(90846);
    }
    while (true)
    {
      return paramWebResourceRequest;
      paramWebResourceRequest = null;
      AppMethodBeat.o(90846);
    }
  }

  public final void bE(String paramString)
  {
    AppMethodBeat.i(90843);
    if (this.bPS.xu() != null)
      this.bPS.xu().a(this.bPS, paramString);
    AppMethodBeat.o(90843);
  }

  public final void bF(String paramString)
  {
    AppMethodBeat.i(90844);
    if (this.bPS.xu() != null)
      this.bPS.xu().b(this.bPS, paramString);
    this.bPS.wS();
    AppMethodBeat.o(90844);
  }

  public final String xt()
  {
    AppMethodBeat.i(90845);
    String str = n.a(this.bPS);
    AppMethodBeat.o(90845);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.n.2
 * JD-Core Version:    0.6.2
 */