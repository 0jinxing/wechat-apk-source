package com.tencent.youtu.ytcommon.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class YTException
{
  public static void report(Exception paramException)
  {
    AppMethodBeat.i(118084);
    YTLogger.e("YTException", "[YTException.report] ");
    AppMethodBeat.o(118084);
  }

  public static void report(Exception paramException, String paramString1, String paramString2)
  {
    AppMethodBeat.i(118085);
    YTLogger.w("YTException".concat(String.valueOf(paramString1)), paramString2);
    AppMethodBeat.o(118085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.tools.YTException
 * JD-Core Version:    0.6.2
 */