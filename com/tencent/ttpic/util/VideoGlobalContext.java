package com.tencent.ttpic.util;

import android.content.Context;

public class VideoGlobalContext
{
  private static Context sContext;

  public static Context getContext()
  {
    return sContext;
  }

  public static void setContext(Context paramContext)
  {
    sContext = paramContext;
    com.tencent.ttpic.gameplaysdk.GamePlaySDK.context = paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoGlobalContext
 * JD-Core Version:    0.6.2
 */