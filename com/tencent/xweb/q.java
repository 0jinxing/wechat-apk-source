package com.tencent.xweb;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.g;
import com.tencent.xweb.c.k;
import com.tencent.xweb.c.k.a;
import org.xwalk.core.Log;

public final class q
{
  static q AML = null;
  public g AMK;

  private q()
  {
    AppMethodBeat.i(3838);
    this.AMK = null;
    g localg = k.f(WebView.getCurWebType()).createWebviewStorage();
    if (localg == null)
    {
      Log.e("WebStorage", "create WebStorage failed webStg is null, cur core kind is " + WebView.getCurWebType());
      AppMethodBeat.o(3838);
    }
    while (true)
    {
      return;
      this.AMK = localg;
      AppMethodBeat.o(3838);
    }
  }

  public static q dUk()
  {
    try
    {
      AppMethodBeat.i(3837);
      if (AML == null)
      {
        localq = new com/tencent/xweb/q;
        localq.<init>();
        AML = localq;
      }
      q localq = AML;
      AppMethodBeat.o(3837);
      return localq;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.q
 * JD-Core Version:    0.6.2
 */