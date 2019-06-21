package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WXAppLaunchData$Builder
{
  public static WXAppLaunchData fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128332);
    WXAppLaunchData localWXAppLaunchData = new WXAppLaunchData();
    localWXAppLaunchData.launchType = paramBundle.getInt("_wxapplaunchdata_launchType");
    localWXAppLaunchData.message = paramBundle.getString("_wxapplaunchdata_message");
    AppMethodBeat.o(128332);
    return localWXAppLaunchData;
  }

  public static Bundle toBundle(WXAppLaunchData paramWXAppLaunchData)
  {
    AppMethodBeat.i(128333);
    Bundle localBundle = new Bundle();
    localBundle.putInt("_wxapplaunchdata_launchType", paramWXAppLaunchData.launchType);
    localBundle.putString("_wxapplaunchdata_message", paramWXAppLaunchData.message);
    AppMethodBeat.o(128333);
    return localBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXAppLaunchData.Builder
 * JD-Core Version:    0.6.2
 */