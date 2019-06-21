package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public class TbsPVConfig extends TbsBaseConfig
{
  private static TbsPVConfig b;
  public SharedPreferences mPreferences;

  public static TbsPVConfig getInstance(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(64545);
      if (b == null)
      {
        TbsPVConfig localTbsPVConfig = new com/tencent/smtt/sdk/TbsPVConfig;
        localTbsPVConfig.<init>();
        b = localTbsPVConfig;
        localTbsPVConfig.init(paramContext);
      }
      paramContext = b;
      AppMethodBeat.o(64545);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static void releaseInstance()
  {
    try
    {
      b = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String getConfigFileName()
  {
    return "tbs_pv_config";
  }

  public int getDisabledCoreVersion()
  {
    try
    {
      AppMethodBeat.i(64549);
      try
      {
        String str = (String)this.a.get("disabled_core_version");
        if (!TextUtils.isEmpty(str))
        {
          i = Integer.parseInt(str);
          AppMethodBeat.o(64549);
          return i;
        }
      }
      catch (Exception localException)
      {
        while (true)
          int i = 0;
      }
    }
    finally
    {
    }
  }

  public int getEmergentCoreVersion()
  {
    try
    {
      AppMethodBeat.i(64547);
      try
      {
        String str = (String)this.a.get("emergent_core_version");
        if (!TextUtils.isEmpty(str))
        {
          i = Integer.parseInt(str);
          AppMethodBeat.o(64547);
          return i;
        }
      }
      catch (Exception localException)
      {
        while (true)
          int i = 0;
      }
    }
    finally
    {
    }
  }

  public int getLocalCoreVersionMoreTimes()
  {
    try
    {
      AppMethodBeat.i(64546);
      try
      {
        String str = (String)this.a.get("get_localcoreversion_moretimes");
        if (!TextUtils.isEmpty(str))
        {
          i = Integer.parseInt(str);
          AppMethodBeat.o(64546);
          return i;
        }
      }
      catch (Exception localException)
      {
        while (true)
          int i = 0;
      }
    }
    finally
    {
    }
  }

  public int getReadApk()
  {
    try
    {
      AppMethodBeat.i(64548);
      try
      {
        String str = (String)this.a.get("read_apk");
        if (!TextUtils.isEmpty(str))
        {
          i = Integer.parseInt(str);
          AppMethodBeat.o(64548);
          return i;
        }
      }
      catch (Exception localException)
      {
        while (true)
          int i = 0;
      }
    }
    finally
    {
    }
  }

  public boolean isDisableHostBackupCore()
  {
    try
    {
      AppMethodBeat.i(64551);
      try
      {
        String str = (String)this.a.get("disable_host_backup");
        if (!TextUtils.isEmpty(str))
        {
          bool = str.equals("true");
          if (bool)
          {
            bool = true;
            AppMethodBeat.o(64551);
            return bool;
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          boolean bool = false;
          AppMethodBeat.o(64551);
        }
      }
    }
    finally
    {
    }
  }

  public boolean isEnableNoCoreGray()
  {
    try
    {
      AppMethodBeat.i(64550);
      try
      {
        String str = (String)this.a.get("enable_no_share_gray");
        if (!TextUtils.isEmpty(str))
        {
          bool = str.equals("true");
          if (bool)
          {
            bool = true;
            AppMethodBeat.o(64550);
            return bool;
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          boolean bool = false;
          AppMethodBeat.o(64550);
        }
      }
    }
    finally
    {
    }
  }

  public void putData(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(64552);
      this.a.put(paramString1, paramString2);
      AppMethodBeat.o(64552);
      return;
    }
    finally
    {
      paramString1 = finally;
    }
    throw paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsPVConfig
 * JD-Core Version:    0.6.2
 */