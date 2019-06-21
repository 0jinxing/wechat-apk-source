package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;

class XWalkCoreWrapper$1 extends XWalkLogMessageListener
{
  XWalkCoreWrapper$1(XWalkCoreWrapper paramXWalkCoreWrapper1, XWalkCoreWrapper paramXWalkCoreWrapper2)
  {
    super(paramXWalkCoreWrapper2);
  }

  public void onLogMessage(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(85553);
    Log.i("XWalkLib", "[WCWebview] :".concat(String.valueOf(paramString2)));
    AppMethodBeat.o(85553);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkCoreWrapper.1
 * JD-Core Version:    0.6.2
 */