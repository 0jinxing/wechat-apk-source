package com.tencent.tmassistantsdk.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class QUASetting
{
  protected static final String APP_VERSION = "100";
  protected static final String BUILD_NO = "100";
  public static final int ROOT_STATUS_UNKNOWN = 0;
  protected static final String UN_DEFINED = "NA";
  protected static String mChannelId = "NA";
  protected Context mContext = null;

  public QUASetting(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private StringBuffer filter(String paramString)
  {
    AppMethodBeat.i(76280);
    StringBuffer localStringBuffer = new StringBuffer();
    if (TextUtils.isEmpty(paramString))
    {
      localStringBuffer.append("NA");
      AppMethodBeat.o(76280);
    }
    while (true)
    {
      return localStringBuffer;
      paramString = paramString.toCharArray();
      for (int i = 0; i < paramString.length; i++)
        if ((paramString[i] > ' ') && (paramString[i] != '/') && (paramString[i] != '_') && (paramString[i] != '&') && (paramString[i] != '|') && (paramString[i] != '-'))
          localStringBuffer.append(paramString[i]);
      AppMethodBeat.o(76280);
    }
  }

  private String getAndroidVersion()
  {
    AppMethodBeat.i(76279);
    StringBuffer localStringBuffer = new StringBuffer();
    String str = Build.VERSION.RELEASE;
    if (TextUtils.isEmpty(str))
      localStringBuffer.append("NA");
    while (true)
    {
      localStringBuffer.append("_");
      localStringBuffer.append(Build.VERSION.SDK_INT);
      str = localStringBuffer.toString();
      AppMethodBeat.o(76279);
      return str;
      localStringBuffer.append(str);
    }
  }

  public static String getBuildNo()
  {
    AppMethodBeat.i(76277);
    String str;
    if ("100".contains("BuildNo"))
    {
      str = "0000";
      AppMethodBeat.o(76277);
    }
    while (true)
    {
      return str;
      str = "100";
      AppMethodBeat.o(76277);
    }
  }

  private int getDeviceHeight()
  {
    AppMethodBeat.i(76276);
    int i = this.mContext.getResources().getDisplayMetrics().heightPixels;
    AppMethodBeat.o(76276);
    return i;
  }

  private int getDeviceWidth()
  {
    AppMethodBeat.i(76275);
    int i = this.mContext.getResources().getDisplayMetrics().widthPixels;
    AppMethodBeat.o(76275);
    return i;
  }

  private int getRootStatus()
  {
    return 0;
  }

  private String getUA()
  {
    AppMethodBeat.i(76278);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(filter(Build.BRAND));
    ((StringBuffer)localObject).append("_");
    ((StringBuffer)localObject).append(filter(Build.MODEL));
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(76278);
    return localObject;
  }

  public String buildQUA()
  {
    AppMethodBeat.i(76274);
    Object localObject = new QUABuilder();
    ((QUABuilder)localObject).mBuildNo = getBuildNo();
    ((QUABuilder)localObject).mChannel = "";
    ((QUABuilder)localObject).mChannelId = mChannelId;
    ((QUABuilder)localObject).mAdrRelease = getAndroidVersion();
    ((QUABuilder)localObject).mDeviceHeight = getDeviceHeight();
    ((QUABuilder)localObject).mDeviceWidth = getDeviceWidth();
    ((QUABuilder)localObject).mRootStatus = getRootStatus();
    ((QUABuilder)localObject).mUA = getUA();
    ((QUABuilder)localObject).mVersionName = "100";
    localObject = ((QUABuilder)localObject).get();
    AppMethodBeat.o(76274);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.util.QUASetting
 * JD-Core Version:    0.6.2
 */