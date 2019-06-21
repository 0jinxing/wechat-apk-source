package com.facebook.login;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LoginManager$LoginLoggerHolder
{
  private static LoginLogger logger;

  private static LoginLogger getLogger(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(96879);
      if (paramContext != null)
      {
        if (paramContext != null)
          break label35;
        paramContext = null;
        AppMethodBeat.o(96879);
      }
      while (true)
      {
        return paramContext;
        paramContext = FacebookSdk.getApplicationContext();
        break;
        label35: if (logger == null)
        {
          LoginLogger localLoginLogger = new com/facebook/login/LoginLogger;
          localLoginLogger.<init>(paramContext, FacebookSdk.getApplicationId());
          logger = localLoginLogger;
        }
        paramContext = logger;
        AppMethodBeat.o(96879);
      }
    }
    finally
    {
    }
    throw paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.login.LoginManager.LoginLoggerHolder
 * JD-Core Version:    0.6.2
 */