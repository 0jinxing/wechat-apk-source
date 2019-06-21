package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;

@KeepForSdk
public class CommonStatusCodes
{
  public static final int API_NOT_CONNECTED = 17;
  public static final int CANCELED = 16;
  public static final int DEVELOPER_ERROR = 10;
  public static final int ERROR = 13;
  public static final int INTERNAL_ERROR = 8;
  public static final int INTERRUPTED = 14;
  public static final int INVALID_ACCOUNT = 5;
  public static final int NETWORK_ERROR = 7;
  public static final int RESOLUTION_REQUIRED = 6;

  @Deprecated
  public static final int SERVICE_DISABLED = 3;

  @Deprecated
  public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
  public static final int SIGN_IN_REQUIRED = 4;
  public static final int SUCCESS = 0;
  public static final int SUCCESS_CACHE = -1;
  public static final int TIMEOUT = 15;

  public static String getStatusCodeString(int paramInt)
  {
    AppMethodBeat.i(89444);
    String str;
    switch (paramInt)
    {
    case 1:
    case 9:
    case 11:
    case 12:
    default:
      str = 32 + "unknown status code: " + paramInt;
      AppMethodBeat.o(89444);
    case -1:
    case 0:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 10:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    }
    while (true)
    {
      return str;
      str = "SUCCESS_CACHE";
      AppMethodBeat.o(89444);
      continue;
      str = "SUCCESS";
      AppMethodBeat.o(89444);
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      AppMethodBeat.o(89444);
      continue;
      str = "SERVICE_DISABLED";
      AppMethodBeat.o(89444);
      continue;
      str = "SIGN_IN_REQUIRED";
      AppMethodBeat.o(89444);
      continue;
      str = "INVALID_ACCOUNT";
      AppMethodBeat.o(89444);
      continue;
      str = "RESOLUTION_REQUIRED";
      AppMethodBeat.o(89444);
      continue;
      str = "NETWORK_ERROR";
      AppMethodBeat.o(89444);
      continue;
      str = "INTERNAL_ERROR";
      AppMethodBeat.o(89444);
      continue;
      str = "DEVELOPER_ERROR";
      AppMethodBeat.o(89444);
      continue;
      str = "ERROR";
      AppMethodBeat.o(89444);
      continue;
      str = "INTERRUPTED";
      AppMethodBeat.o(89444);
      continue;
      str = "TIMEOUT";
      AppMethodBeat.o(89444);
      continue;
      str = "CANCELED";
      AppMethodBeat.o(89444);
      continue;
      str = "API_NOT_CONNECTED";
      AppMethodBeat.o(89444);
      continue;
      str = "DEAD_CLIENT";
      AppMethodBeat.o(89444);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.CommonStatusCodes
 * JD-Core Version:    0.6.2
 */