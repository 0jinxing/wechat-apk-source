package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.tencent.matrix.trace.core.AppMethodBeat;

@KeepForSdkWithMembers
public class AuthApiStatusCodes extends CommonStatusCodes
{
  public static final int AUTH_API_ACCESS_FORBIDDEN = 3001;
  public static final int AUTH_API_CLIENT_ERROR = 3002;
  public static final int AUTH_API_INVALID_CREDENTIALS = 3000;
  public static final int AUTH_API_SERVER_ERROR = 3003;
  public static final int AUTH_APP_CERT_ERROR = 3006;
  public static final int AUTH_TOKEN_ERROR = 3004;
  public static final int AUTH_URL_RESOLUTION = 3005;

  public static String getStatusCodeString(int paramInt)
  {
    AppMethodBeat.i(77034);
    String str;
    switch (paramInt)
    {
    default:
      str = CommonStatusCodes.getStatusCodeString(paramInt);
      AppMethodBeat.o(77034);
    case 3000:
    case 3001:
    case 3002:
    case 3003:
    case 3004:
    case 3005:
    case 3006:
    }
    while (true)
    {
      return str;
      str = "AUTH_API_INVALID_CREDENTIALS";
      AppMethodBeat.o(77034);
      continue;
      str = "AUTH_API_ACCESS_FORBIDDEN";
      AppMethodBeat.o(77034);
      continue;
      str = "AUTH_API_CLIENT_ERROR";
      AppMethodBeat.o(77034);
      continue;
      str = "AUTH_API_SERVER_ERROR";
      AppMethodBeat.o(77034);
      continue;
      str = "AUTH_TOKEN_ERROR";
      AppMethodBeat.o(77034);
      continue;
      str = "AUTH_URL_RESOLUTION";
      AppMethodBeat.o(77034);
      continue;
      str = "AUTH_APP_CERT_ERROR";
      AppMethodBeat.o(77034);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.proxy.AuthApiStatusCodes
 * JD-Core Version:    0.6.2
 */