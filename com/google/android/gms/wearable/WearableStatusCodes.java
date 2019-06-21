package com.google.android.gms.wearable;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class WearableStatusCodes extends CommonStatusCodes
{
  public static final int ASSET_UNAVAILABLE = 4005;
  public static final int DATA_ITEM_TOO_LARGE = 4003;
  public static final int DUPLICATE_CAPABILITY = 4006;
  public static final int DUPLICATE_LISTENER = 4001;
  public static final int INVALID_TARGET_NODE = 4004;
  public static final int TARGET_NODE_NOT_CONNECTED = 4000;
  public static final int UNKNOWN_CAPABILITY = 4007;
  public static final int UNKNOWN_LISTENER = 4002;
  public static final int WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED = 4008;

  public static String getStatusCodeString(int paramInt)
  {
    AppMethodBeat.i(70938);
    String str;
    switch (paramInt)
    {
    default:
      str = CommonStatusCodes.getStatusCodeString(paramInt);
      AppMethodBeat.o(70938);
    case 4000:
    case 4001:
    case 4002:
    case 4003:
    case 4004:
    case 4005:
    }
    while (true)
    {
      return str;
      str = "TARGET_NODE_NOT_CONNECTED";
      AppMethodBeat.o(70938);
      continue;
      str = "DUPLICATE_LISTENER";
      AppMethodBeat.o(70938);
      continue;
      str = "UNKNOWN_LISTENER";
      AppMethodBeat.o(70938);
      continue;
      str = "DATA_ITEM_TOO_LARGE";
      AppMethodBeat.o(70938);
      continue;
      str = "INVALID_TARGET_NODE";
      AppMethodBeat.o(70938);
      continue;
      str = "ASSET_UNAVAILABLE";
      AppMethodBeat.o(70938);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.WearableStatusCodes
 * JD-Core Version:    0.6.2
 */