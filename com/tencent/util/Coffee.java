package com.tencent.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Coffee
{
  public static String dSI()
  {
    AppMethodBeat.i(86576);
    String str = getDESSignKey();
    AppMethodBeat.o(86576);
    return str;
  }

  private static native String getDESSignKey();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.util.Coffee
 * JD-Core Version:    0.6.2
 */