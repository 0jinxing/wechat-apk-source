package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class GoogleSignInStatusCodes extends CommonStatusCodes
{
  public static final int SIGN_IN_CANCELLED = 12501;
  public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
  public static final int SIGN_IN_FAILED = 12500;

  public static String getStatusCodeString(int paramInt)
  {
    AppMethodBeat.i(50397);
    String str;
    switch (paramInt)
    {
    default:
      str = CommonStatusCodes.getStatusCodeString(paramInt);
      AppMethodBeat.o(50397);
    case 12500:
    case 12501:
    case 12502:
    }
    while (true)
    {
      return str;
      str = "A non-recoverable sign in failure occurred";
      AppMethodBeat.o(50397);
      continue;
      str = "Sign in action cancelled";
      AppMethodBeat.o(50397);
      continue;
      str = "Sign-in in progress";
      AppMethodBeat.o(50397);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes
 * JD-Core Version:    0.6.2
 */