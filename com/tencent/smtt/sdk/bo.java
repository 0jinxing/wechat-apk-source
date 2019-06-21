package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class bo extends Thread
{
  bo(WebView paramWebView, String paramString)
  {
    super(paramString);
  }

  public void run()
  {
    AppMethodBeat.i(64833);
    this.a.tbsWebviewDestroy(false);
    AppMethodBeat.o(64833);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bo
 * JD-Core Version:    0.6.2
 */