package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum XWalkUIClient$JavascriptMessageType
{
  static
  {
    AppMethodBeat.i(85856);
    JAVASCRIPT_ALERT = new JavascriptMessageType("JAVASCRIPT_ALERT", 0);
    JAVASCRIPT_CONFIRM = new JavascriptMessageType("JAVASCRIPT_CONFIRM", 1);
    JAVASCRIPT_PROMPT = new JavascriptMessageType("JAVASCRIPT_PROMPT", 2);
    JAVASCRIPT_BEFOREUNLOAD = new JavascriptMessageType("JAVASCRIPT_BEFOREUNLOAD", 3);
    $VALUES = new JavascriptMessageType[] { JAVASCRIPT_ALERT, JAVASCRIPT_CONFIRM, JAVASCRIPT_PROMPT, JAVASCRIPT_BEFOREUNLOAD };
    AppMethodBeat.o(85856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkUIClient.JavascriptMessageType
 * JD-Core Version:    0.6.2
 */