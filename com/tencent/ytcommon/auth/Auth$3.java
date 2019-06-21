package com.tencent.ytcommon.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class Auth$3
  implements HttpUtil.HttpResponseListener
{
  public final void onFail(int paramInt)
  {
    AppMethodBeat.i(4);
    try
    {
      Log.d("log_print_java", "http request error : ".concat(String.valueOf(paramInt)));
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("handle: ");
      Log.d("log_print_java", Auth.access$200());
      Auth.access$300(Auth.access$200(), null);
      AppMethodBeat.o(4);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(4);
    }
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(3);
    try
    {
      Log.d("log_print_java", "response: ".concat(String.valueOf(paramString)));
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("handle: ");
      Log.d("log_print_java", Auth.access$200());
      Auth.access$300(Auth.access$200(), paramString);
      AppMethodBeat.o(3);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(3);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ytcommon.auth.Auth.3
 * JD-Core Version:    0.6.2
 */