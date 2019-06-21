package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum XWalkUIClient$InitiateBy
{
  static
  {
    AppMethodBeat.i(85853);
    BY_USER_GESTURE = new InitiateBy("BY_USER_GESTURE", 0);
    BY_JAVASCRIPT = new InitiateBy("BY_JAVASCRIPT", 1);
    $VALUES = new InitiateBy[] { BY_USER_GESTURE, BY_JAVASCRIPT };
    AppMethodBeat.o(85853);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkUIClient.InitiateBy
 * JD-Core Version:    0.6.2
 */