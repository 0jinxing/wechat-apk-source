package com.tencent.luggage.d;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class n$a extends e.a
{
  public n$a()
  {
  }

  protected n$a(e.a parama)
  {
    super(parama);
  }

  public WebResourceResponse a(WebResourceRequest paramWebResourceRequest, Bundle paramBundle)
  {
    AppMethodBeat.i(90849);
    if ((this.bPh instanceof a))
    {
      paramWebResourceRequest = ((a)this.bPh).a(paramWebResourceRequest, paramBundle);
      AppMethodBeat.o(90849);
    }
    while (true)
    {
      return paramWebResourceRequest;
      paramWebResourceRequest = null;
      AppMethodBeat.o(90849);
    }
  }

  public void a(n paramn, String paramString)
  {
    AppMethodBeat.i(90847);
    if ((this.bPh instanceof a))
      ((a)this.bPh).a(paramn, paramString);
    AppMethodBeat.o(90847);
  }

  public void b(n paramn, String paramString)
  {
    AppMethodBeat.i(90848);
    if ((this.bPh instanceof a))
      ((a)this.bPh).b(paramn, paramString);
    AppMethodBeat.o(90848);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.n.a
 * JD-Core Version:    0.6.2
 */