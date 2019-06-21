package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class InternalSettings
{
  private static final String UNITY_PREFIX = "Unity.";
  private static volatile String mCustomUserAgent;

  public static String getCustomUserAgent()
  {
    return mCustomUserAgent;
  }

  public static boolean isUnityApp()
  {
    AppMethodBeat.i(72399);
    boolean bool;
    if ((mCustomUserAgent != null) && (mCustomUserAgent.startsWith("Unity.")))
    {
      bool = true;
      AppMethodBeat.o(72399);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72399);
    }
  }

  public static void setCustomUserAgent(String paramString)
  {
    mCustomUserAgent = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.InternalSettings
 * JD-Core Version:    0.6.2
 */