package com.tencent.ytcommon.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;

final class Auth$2 extends TimerTask
{
  public final void run()
  {
    AppMethodBeat.i(2);
    Log.d("log_print_java", "flush in java ");
    Auth.access$100();
    AppMethodBeat.o(2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ytcommon.auth.Auth.2
 * JD-Core Version:    0.6.2
 */