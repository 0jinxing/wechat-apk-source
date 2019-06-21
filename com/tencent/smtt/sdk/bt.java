package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class bt extends Thread
{
  bt(WebView paramWebView, String paramString)
  {
    super(paramString);
  }

  public void run()
  {
    AppMethodBeat.i(64838);
    try
    {
      this.a.a();
      AppMethodBeat.o(64838);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(64838);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bt
 * JD-Core Version:    0.6.2
 */