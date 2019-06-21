package com.tencent.ytcommon.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;

final class Auth$1 extends TimerTask
{
  public final void run()
  {
    AppMethodBeat.i(1);
    String str = Auth.access$000();
    if (str != "")
      Auth.report(str);
    AppMethodBeat.o(1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ytcommon.auth.Auth.1
 * JD-Core Version:    0.6.2
 */