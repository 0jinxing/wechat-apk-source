package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Credentials
{
  public static CredentialsClient getClient(Activity paramActivity)
  {
    AppMethodBeat.i(50329);
    paramActivity = new CredentialsClient(paramActivity, CredentialsOptions.DEFAULT);
    AppMethodBeat.o(50329);
    return paramActivity;
  }

  public static CredentialsClient getClient(Activity paramActivity, CredentialsOptions paramCredentialsOptions)
  {
    AppMethodBeat.i(50330);
    paramActivity = new CredentialsClient(paramActivity, paramCredentialsOptions);
    AppMethodBeat.o(50330);
    return paramActivity;
  }

  public static CredentialsClient getClient(Context paramContext)
  {
    AppMethodBeat.i(50331);
    paramContext = new CredentialsClient(paramContext, CredentialsOptions.DEFAULT);
    AppMethodBeat.o(50331);
    return paramContext;
  }

  public static CredentialsClient getClient(Context paramContext, CredentialsOptions paramCredentialsOptions)
  {
    AppMethodBeat.i(50332);
    paramContext = new CredentialsClient(paramContext, paramCredentialsOptions);
    AppMethodBeat.o(50332);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.Credentials
 * JD-Core Version:    0.6.2
 */