package com.tencent.matrix.mrs.core;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.d.c;
import java.util.TimeZone;

public final class MrsLogic
{
  private static final String TAG = "MrsLogic";
  private static MrsCallback mrsCallback = null;
  private static PhoneInfo phoneInfo;

  static native void collectData(String paramString, byte[] paramArrayOfByte);

  static String getCryptKey(MatrixUploadDataSlice paramMatrixUploadDataSlice)
  {
    if (mrsCallback == null);
    for (paramMatrixUploadDataSlice = ""; ; paramMatrixUploadDataSlice = mrsCallback.getCryptKey(paramMatrixUploadDataSlice))
      return paramMatrixUploadDataSlice;
  }

  static String getHost(MatrixUploadDataSlice paramMatrixUploadDataSlice)
  {
    if (mrsCallback == null)
      c.w("MrsLogic", "callback is null", new Object[0]);
    for (paramMatrixUploadDataSlice = ""; ; paramMatrixUploadDataSlice = mrsCallback.getHost(paramMatrixUploadDataSlice))
      return paramMatrixUploadDataSlice;
  }

  static PhoneInfo getPhoneInfo()
  {
    if (phoneInfo == null)
      phoneInfo = getPhoneInfoInternal();
    return phoneInfo;
  }

  private static PhoneInfo getPhoneInfoInternal()
  {
    PhoneInfo localPhoneInfo = new PhoneInfo();
    localPhoneInfo.deviceModel = replayUnderlineWithDoc(Build.MODEL);
    localPhoneInfo.deviceBrand = replayUnderlineWithDoc(Build.BRAND);
    String str1 = Build.MANUFACTURER;
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = Build.BRAND;
    localPhoneInfo.osName = replayUnderlineWithDoc(str2);
    localPhoneInfo.osVersion = Build.VERSION.SDK_INT;
    localPhoneInfo.languageVer = "";
    return localPhoneInfo;
  }

  static String getPublicSharePath()
  {
    String str;
    try
    {
      if (mrsCallback == null)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("getPublicSharePath, but mrsCallback is null");
        throw localRuntimeException;
      }
    }
    catch (Exception localException)
    {
      c.printErrStackTrace("MrsLogic", localException, "jni callback exception", new Object[0]);
      str = null;
    }
    while (true)
    {
      return str;
      str = mrsCallback.getPublicSharePath();
    }
  }

  static String getUrl(MatrixUploadDataSlice paramMatrixUploadDataSlice)
  {
    if (mrsCallback == null)
      c.w("MrsLogic", "callback is null", new Object[0]);
    for (paramMatrixUploadDataSlice = ""; ; paramMatrixUploadDataSlice = mrsCallback.getUrl(paramMatrixUploadDataSlice))
      return paramMatrixUploadDataSlice;
  }

  static void init(long paramLong1, String paramString, boolean paramBoolean, long paramLong2)
  {
    onCreate();
    onForeground(true);
    setTimeZone(TimeZone.getDefault().getRawOffset() / 3600000);
    setClientVersion(paramLong1);
    setRevision(paramString);
    setDebugFlag(paramBoolean);
    setPhoneInfo(getPhoneInfo());
    setPublishType(paramLong2);
  }

  static native boolean isNeed2Report(String paramString);

  private static String limitRevision(String paramString)
  {
    String str;
    if (TextUtils.isEmpty(paramString))
      str = paramString;
    while (true)
    {
      return str;
      str = paramString;
      if (paramString.length() > 7)
        str = paramString.substring(0, 7);
    }
  }

  static native void onCrash();

  static native void onCreate();

  static native void onDestroy();

  static native void onForeground(boolean paramBoolean);

  static boolean onRequestGetMrsStrategy(byte[] paramArrayOfByte)
  {
    boolean bool1 = false;
    try
    {
      if (mrsCallback == null)
      {
        paramArrayOfByte = new java/lang/RuntimeException;
        paramArrayOfByte.<init>("onRequestGetMrsStrategy, but mrsCallback is null");
        throw paramArrayOfByte;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      c.printErrStackTrace("MrsLogic", paramArrayOfByte, "jni callback exception", new Object[0]);
    }
    while (true)
    {
      return bool1;
      boolean bool2 = mrsCallback.onRequestGetMrsStrategy(paramArrayOfByte);
      bool1 = bool2;
    }
  }

  static void onStrategyNotify(String paramString)
  {
    try
    {
      if (mrsCallback == null)
      {
        paramString = new java/lang/RuntimeException;
        paramString.<init>("onRequestGetMrsStrategy, but mrsCallback is null");
        throw paramString;
      }
    }
    catch (Exception paramString)
    {
      c.printErrStackTrace("MrsLogic", paramString, "jni callback exception", new Object[0]);
    }
    while (true)
    {
      return;
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.setAction("strategyNotify");
      localIntent.putExtra("strategy", paramString);
      MatrixReport.with().getContext().sendBroadcast(localIntent, "com.tencent.mm.matrix.strategynotify");
      mrsCallback.onStrategyNotify(paramString, true);
    }
  }

  static native void onStrategyResp(int paramInt1, int paramInt2, byte[] paramArrayOfByte);

  private static String replayUnderlineWithDoc(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return paramString;
      paramString = paramString.replace("_", "-");
    }
  }

  static void setCallBack(MrsCallback paramMrsCallback)
  {
    mrsCallback = paramMrsCallback;
  }

  static native void setClientVersion(long paramLong);

  static native void setDebugFlag(boolean paramBoolean);

  static native void setPhoneInfo(PhoneInfo paramPhoneInfo);

  static native void setPublishType(long paramLong);

  static native void setRevision(String paramString);

  public static native void setTimeZone(int paramInt);

  static native void setUin(long paramLong);

  public static native void uploadMatrixIssue(MatrixUploadIssue paramMatrixUploadIssue);

  public static class PhoneInfo
  {
    public String deviceBrand;
    public String deviceModel;
    public String languageVer;
    public String osName;
    public String osVersion;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.mrs.core.MrsLogic
 * JD-Core Version:    0.6.2
 */