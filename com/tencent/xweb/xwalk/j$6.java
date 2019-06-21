package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkLogMessageListener;

final class j$6 extends XWalkLogMessageListener
{
  j$6(j paramj)
  {
  }

  public final void onLogMessage(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(85293);
    Log.i("XWWebView", "[WCWebview] :".concat(String.valueOf(paramString2)));
    AppMethodBeat.o(85293);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.j.6
 * JD-Core Version:    0.6.2
 */