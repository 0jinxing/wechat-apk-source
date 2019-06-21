package com.tencent.youtu.ytcommon.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytcommon.tools.YTLogger;

final class YTAuthJNIInterface$3
  implements HttpUtil.HttpResponseListener
{
  public final void onFail(int paramInt)
  {
    AppMethodBeat.i(118066);
    try
    {
      YTLogger.d("log_print_java", "http request error : ".concat(String.valueOf(paramInt)));
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("handle: ");
      YTLogger.d("log_print_java", YTAuthJNIInterface.access$200());
      YTAuthJNIInterface.access$300(YTAuthJNIInterface.access$200(), null);
      AppMethodBeat.o(118066);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(118066);
    }
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(118065);
    try
    {
      YTLogger.d("log_print_java", "response: ".concat(String.valueOf(paramString)));
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("handle: ");
      YTLogger.d("log_print_java", YTAuthJNIInterface.access$200());
      YTAuthJNIInterface.access$300(YTAuthJNIInterface.access$200(), paramString);
      AppMethodBeat.o(118065);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(118065);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.3
 * JD-Core Version:    0.6.2
 */