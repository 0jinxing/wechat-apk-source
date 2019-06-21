package com.tencent.ytcommon.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

final class Auth$4
  implements Runnable
{
  Auth$4(String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5);
    try
    {
      HttpUtil.post("https://api.youtu.qq.com/auth/report", this.val$data, Auth.access$400());
      AppMethodBeat.o(5);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        AppMethodBeat.o(5);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ytcommon.auth.Auth.4
 * JD-Core Version:    0.6.2
 */