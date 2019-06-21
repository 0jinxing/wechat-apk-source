package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AccountTransferStatusCodes extends CommonStatusCodes
{
  public static final int CHALLENGE_NOT_ALLOWED = 20503;
  public static final int INVALID_REQUEST = 20502;
  public static final int NOT_ALLOWED_SECURITY = 20500;
  public static final int NO_DATA_AVAILABLE = 20501;
  public static final int SESSION_INACTIVE = 20504;

  public static String getStatusCodeString(int paramInt)
  {
    AppMethodBeat.i(76989);
    String str;
    switch (paramInt)
    {
    default:
      str = CommonStatusCodes.getStatusCodeString(paramInt);
      AppMethodBeat.o(76989);
    case 20500:
    case 20501:
    case 20502:
    case 20503:
    case 20504:
    }
    while (true)
    {
      return str;
      str = "NOT_ALLOWED_SECURITY";
      AppMethodBeat.o(76989);
      continue;
      str = "NO_DATA_AVAILABLE";
      AppMethodBeat.o(76989);
      continue;
      str = "INVALID_REQUEST";
      AppMethodBeat.o(76989);
      continue;
      str = "CHALLENGE_NOT_ALLOWED";
      AppMethodBeat.o(76989);
      continue;
      str = "SESSION_INACTIVE";
      AppMethodBeat.o(76989);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes
 * JD-Core Version:    0.6.2
 */