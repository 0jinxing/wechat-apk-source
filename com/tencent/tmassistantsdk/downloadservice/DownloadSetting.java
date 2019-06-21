package com.tencent.tmassistantsdk.downloadservice;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.storage.table.DownloadSettingTable;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.HashMap;

public class DownloadSetting
{
  public static final String ISDOWNLOADWIFIONLY = "isDownloadWifiOnly";
  public static final String ISTASKAUTORESUME = "isTaskAutoResume";
  public static final String MAXTASKNUM = "maxTaskNum";
  private static final String TAG = "DownloadSetting";
  public static final String TYPE_BOOLEAN = "boolean";
  public static final String TYPE_INTEGER = "Integer";
  protected static DownloadSetting mInstance = null;
  protected boolean isDownloadWifiOnly;
  protected boolean isTaskAutoResume;
  protected int maxTaskNum;

  public DownloadSetting()
  {
    AppMethodBeat.i(75734);
    this.isTaskAutoResume = true;
    this.isDownloadWifiOnly = false;
    this.maxTaskNum = 5;
    loadFromDB();
    AppMethodBeat.o(75734);
  }

  public static DownloadSetting getInstance()
  {
    try
    {
      AppMethodBeat.i(75735);
      if (mInstance == null)
      {
        localDownloadSetting = new com/tencent/tmassistantsdk/downloadservice/DownloadSetting;
        localDownloadSetting.<init>();
        mInstance = localDownloadSetting;
      }
      DownloadSetting localDownloadSetting = mInstance;
      AppMethodBeat.o(75735);
      return localDownloadSetting;
    }
    finally
    {
    }
  }

  static int getSplitSizeInBytes(String paramString)
  {
    int i = 921600;
    AppMethodBeat.i(75736);
    if (paramString.equalsIgnoreCase("WIFI"))
    {
      paramString = new UnsupportedOperationException("Split is not allowed in current version. netType: ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(75736);
      throw paramString;
    }
    if (paramString.contains("net"))
      AppMethodBeat.o(75736);
    while (true)
    {
      return i;
      if (paramString.contains("wap"))
      {
        i = 409600;
        AppMethodBeat.o(75736);
      }
      else
      {
        AppMethodBeat.o(75736);
      }
    }
  }

  private void loadFromDB()
  {
    boolean bool1 = false;
    AppMethodBeat.i(75740);
    Object localObject = DownloadSettingTable.query();
    String str = (String)((HashMap)localObject).get("isTaskAutoResume");
    if ((str != null) && (str.length() > 0))
    {
      if (str.equals("false"))
      {
        bool2 = false;
        this.isTaskAutoResume = bool2;
      }
    }
    else
    {
      str = (String)((HashMap)localObject).get("isDownloadWifiOnly");
      if ((str != null) && (str.length() > 0))
        if (!str.equals("false"))
          break label133;
    }
    label133: for (boolean bool2 = bool1; ; bool2 = true)
    {
      this.isDownloadWifiOnly = bool2;
      localObject = (String)((HashMap)localObject).get("maxTaskNum");
      if ((localObject != null) && (((String)localObject).length() > 0))
        this.maxTaskNum = Integer.valueOf((String)localObject).intValue();
      AppMethodBeat.o(75740);
      return;
      bool2 = true;
      break;
    }
  }

  public boolean getIsDownloadWifiOnly()
  {
    return this.isDownloadWifiOnly;
  }

  public boolean getIsTaskAutoResume()
  {
    return this.isTaskAutoResume;
  }

  public int getMaxTaskNum()
  {
    return this.maxTaskNum;
  }

  public boolean isAutoDownload()
  {
    AppMethodBeat.i(75741);
    boolean bool;
    if (this.isTaskAutoResume)
    {
      String str = DownloadHelper.getNetStatus();
      if ((str.contains("wifi")) || (str.contains("net")))
      {
        bool = true;
        AppMethodBeat.o(75741);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(75741);
    }
  }

  public boolean isAutoDownload(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(75742);
    TMLog.i("DownloadSetting", "downloadInfoNetType = ".concat(String.valueOf(paramString1)));
    TMLog.i("DownloadSetting", "currentNetType = ".concat(String.valueOf(paramString2)));
    if (TextUtils.isEmpty(paramString1))
      AppMethodBeat.o(75742);
    while (true)
    {
      return bool;
      if (paramString2.equalsIgnoreCase("WIFI"))
      {
        AppMethodBeat.o(75742);
        bool = true;
      }
      else if ((paramString2.contains("net")) && (!paramString1.equalsIgnoreCase("WIFI")))
      {
        AppMethodBeat.o(75742);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(75742);
      }
    }
  }

  public void setIsDownloadWifiOnly(boolean paramBoolean)
  {
    AppMethodBeat.i(75738);
    if (mInstance.isDownloadWifiOnly == paramBoolean)
      AppMethodBeat.o(75738);
    while (true)
    {
      return;
      mInstance.isDownloadWifiOnly = paramBoolean;
      DownloadSettingTable.save("isDownloadWifiOnly", String.valueOf(paramBoolean), "boolean");
      AppMethodBeat.o(75738);
    }
  }

  public void setIsTaskAutoResume(boolean paramBoolean)
  {
    AppMethodBeat.i(75737);
    if (mInstance.isTaskAutoResume == paramBoolean)
      AppMethodBeat.o(75737);
    while (true)
    {
      return;
      mInstance.isTaskAutoResume = paramBoolean;
      DownloadSettingTable.save("isTaskAutoResume", String.valueOf(paramBoolean), "boolean");
      AppMethodBeat.o(75737);
    }
  }

  public void setMaxTaskNum(int paramInt)
  {
    AppMethodBeat.i(75739);
    if (mInstance.maxTaskNum == paramInt)
      AppMethodBeat.o(75739);
    while (true)
    {
      return;
      mInstance.maxTaskNum = paramInt;
      DownloadSettingTable.save("maxTaskNum", String.valueOf(paramInt), "Integer");
      AppMethodBeat.o(75739);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.DownloadSetting
 * JD-Core Version:    0.6.2
 */