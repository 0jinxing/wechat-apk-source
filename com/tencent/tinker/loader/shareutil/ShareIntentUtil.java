package com.tencent.tinker.loader.shareutil;

import android.content.Intent;
import java.io.Serializable;
import java.util.HashMap;

public class ShareIntentUtil
{
  public static void a(Intent paramIntent, long paramLong)
  {
    paramIntent.putExtra("intent_patch_cost_time", paramLong);
  }

  public static void a(Intent paramIntent, ClassLoader paramClassLoader)
  {
    try
    {
      paramIntent.setExtrasClassLoader(paramClassLoader);
      label5: return;
    }
    catch (Throwable paramIntent)
    {
      break label5;
    }
  }

  public static void b(Intent paramIntent, int paramInt)
  {
    paramIntent.putExtra("intent_return_code", paramInt);
  }

  public static int be(Intent paramIntent)
  {
    return v(paramIntent, "intent_return_code");
  }

  public static long bf(Intent paramIntent)
  {
    return paramIntent.getLongExtra("intent_patch_cost_time", 0L);
  }

  public static Throwable bg(Intent paramIntent)
  {
    paramIntent = u(paramIntent, "intent_patch_exception");
    if (paramIntent != null);
    for (paramIntent = (Throwable)paramIntent; ; paramIntent = null)
      return paramIntent;
  }

  public static Throwable bh(Intent paramIntent)
  {
    paramIntent = u(paramIntent, "intent_patch_interpret_exception");
    if (paramIntent != null);
    for (paramIntent = (Throwable)paramIntent; ; paramIntent = null)
      return paramIntent;
  }

  public static HashMap<String, String> bi(Intent paramIntent)
  {
    paramIntent = u(paramIntent, "intent_patch_dexes_path");
    if (paramIntent != null);
    for (paramIntent = (HashMap)paramIntent; ; paramIntent = null)
      return paramIntent;
  }

  public static HashMap<String, String> bj(Intent paramIntent)
  {
    paramIntent = u(paramIntent, "intent_patch_libs_path");
    if (paramIntent != null);
    for (paramIntent = (HashMap)paramIntent; ; paramIntent = null)
      return paramIntent;
  }

  public static HashMap<String, String> bk(Intent paramIntent)
  {
    paramIntent = u(paramIntent, "intent_patch_package_config");
    if (paramIntent != null);
    for (paramIntent = (HashMap)paramIntent; ; paramIntent = null)
      return paramIntent;
  }

  public static String n(Intent paramIntent, String paramString)
  {
    Object localObject = null;
    if (paramIntent == null)
      paramIntent = localObject;
    while (true)
    {
      return paramIntent;
      try
      {
        paramIntent = paramIntent.getStringExtra(paramString);
      }
      catch (Exception paramIntent)
      {
        new StringBuilder("getStringExtra exception:").append(paramIntent.getMessage());
        paramIntent = localObject;
      }
    }
  }

  public static Serializable u(Intent paramIntent, String paramString)
  {
    Object localObject = null;
    if (paramIntent == null)
      paramIntent = localObject;
    while (true)
    {
      return paramIntent;
      try
      {
        paramIntent = paramIntent.getSerializableExtra(paramString);
      }
      catch (Exception paramIntent)
      {
        new StringBuilder("getSerializableExtra exception:").append(paramIntent.getMessage());
        paramIntent = localObject;
      }
    }
  }

  private static int v(Intent paramIntent, String paramString)
  {
    int i = -10000;
    if (paramIntent == null);
    while (true)
    {
      return i;
      try
      {
        int j = paramIntent.getIntExtra(paramString, -10000);
        i = j;
      }
      catch (Exception paramIntent)
      {
        new StringBuilder("getIntExtra exception:").append(paramIntent.getMessage());
      }
    }
  }

  public static boolean w(Intent paramIntent, String paramString)
  {
    boolean bool1 = false;
    if (paramIntent == null);
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = paramIntent.getBooleanExtra(paramString, false);
        bool1 = bool2;
      }
      catch (Exception paramIntent)
      {
        new StringBuilder("getBooleanExtra exception:").append(paramIntent.getMessage());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.ShareIntentUtil
 * JD-Core Version:    0.6.2
 */