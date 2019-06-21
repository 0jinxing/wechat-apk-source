package com.tencent.mm.loader.j;

import android.os.Build.VERSION;
import android.os.Bundle;

public final class a
{
  public static String BUILD_TAG;
  public static String CLIENT_VERSION;
  public static String COMMAND;
  public static String HOSTNAME;
  public static String OWNER;
  public static String PATCH_ENABLED;
  public static String REV;
  public static String SVNPATH;
  public static String TIME;
  public static String eSg = "android-" + Build.VERSION.SDK_INT;
  public static String eSh;

  public static String Uk()
  {
    if (eSh == null);
    for (String str = REV; ; str = REV + "." + eSh)
      return str;
  }

  public static String Ul()
  {
    return REV;
  }

  public static boolean Um()
  {
    if (!"false".equalsIgnoreCase(PATCH_ENABLED));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void m(Bundle paramBundle)
  {
    if (paramBundle == null)
      return;
    if (paramBundle.getBoolean("com.tencent.mm.BuildInfo.PATCH_ENABLED"));
    for (String str = "true"; ; str = "false")
    {
      PATCH_ENABLED = str;
      REV = paramBundle.getString("com.tencent.mm.BuildInfo.BUILD_REV");
      CLIENT_VERSION = "0x" + Integer.toHexString(paramBundle.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION"));
      TIME = paramBundle.getString("com.tencent.mm.BuildInfo.BUILD_TIME");
      HOSTNAME = paramBundle.getString("com.tencent.mm.BuildInfo.BUILD_HOSTNAME");
      BUILD_TAG = paramBundle.getString("com.tencent.mm.BuildInfo.BUILD_TAG");
      OWNER = paramBundle.getString("com.tencent.mm.BuildInfo.BUILD_OWNER");
      COMMAND = paramBundle.getString("com.tencent.mm.BuildInfo.BUILD_COMMAND");
      SVNPATH = paramBundle.getString("com.tencent.mm.BuildInfo.BUILD_SVNPATH");
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.j.a
 * JD-Core Version:    0.6.2
 */