package com.tencent.tmassistantsdk.openSDK;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class BaseQQDownloaderOpenSDK
{
  protected static final String TAG = "BaseQQDownloaderOpenSDK";
  protected String hostPackageName = null;
  protected int hostVersionCode = 0;
  protected Context mContext = null;
  protected ReferenceQueue<ITMQQDownloaderOpenSDKListener> mListenerQueue = new ReferenceQueue();
  protected ArrayList<WeakReference<ITMQQDownloaderOpenSDKListener>> mWeakListenerArrayList = new ArrayList();
  protected int sdkAPILevel = 1;
  protected TMAssistantSDKChannel sdkChannel = new TMAssistantSDKChannel();

  public static int getQQDownloadApiLevel(Context paramContext)
  {
    int i = 0;
    int j;
    if (paramContext == null)
      j = i;
    while (true)
    {
      return j;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo("com.tencent.android.qqdownloader", 128);
        j = i;
        if (paramContext != null)
        {
          j = i;
          if (paramContext.metaData != null)
            j = paramContext.metaData.getInt("com.tencent.android.qqdownloader.sdk.apilevel");
        }
      }
      catch (Exception paramContext)
      {
        TMLog.i("BaseQQDownloaderOpenSDK", "packagename not found！");
        j = i;
      }
    }
  }

  public abstract long addDownloadTaskFromAppDetail(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, boolean paramBoolean1, boolean paramBoolean2);

  public abstract long addDownloadTaskFromAuthorize(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, String paramString);

  public abstract long addDownloadTaskFromTaskList(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, boolean paramBoolean1, boolean paramBoolean2);

  public long addDownloadTaskFromWebview(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    paramString = formatIntentUriPath(5, localHashMap);
    long l = System.currentTimeMillis();
    TMLog.i("BaseQQDownloaderOpenSDK", "addDownloadTaskFromTaskList,hostPackageName=" + this.hostPackageName + "; hostVersionCode=" + this.hostVersionCode + "; hostUserIdentity=; dataItemType=0;dataItemAction=" + paramString);
    return this.sdkChannel.AddDataItem(this.hostPackageName, this.hostVersionCode, "", 0, paramString, l, l + 300000L, 0, null);
  }

  public long buildAddDBData(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, int paramInt)
  {
    if (TextUtils.isEmpty(paramString2))
      paramTMQQDownloaderOpenSDKParam = formatMapParams(paramTMQQDownloaderOpenSDKParam, paramBoolean1, paramBoolean2);
    while (true)
    {
      paramTMQQDownloaderOpenSDKParam = formatIntentUriPath(paramInt, paramTMQQDownloaderOpenSDKParam);
      long l = System.currentTimeMillis();
      TMLog.i("BaseQQDownloaderOpenSDK", "addDownloadTaskFromTaskList,hostPackageName=" + this.hostPackageName + "; hostVersionCode=" + this.hostVersionCode + "; hostUserIdentity=; dataItemType=0;dataItemAction=" + paramTMQQDownloaderOpenSDKParam);
      return this.sdkChannel.AddDataItem(this.hostPackageName, this.hostVersionCode, "", 0, paramTMQQDownloaderOpenSDKParam, l, l + 300000L, 0, null);
      paramTMQQDownloaderOpenSDKParam = formatMapParams(paramTMQQDownloaderOpenSDKParam, true, true);
      paramTMQQDownloaderOpenSDKParam.put("verifytype", paramString2);
    }
  }

  protected long buildAddDBData(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    for (long l = -1L; ; l = this.sdkChannel.AddDataItem(null, 0, null, 0, null, l, l + 300000L, 1, paramArrayOfByte))
    {
      return l;
      l = System.currentTimeMillis();
    }
  }

  public int checkQQDownloaderInstalled()
  {
    int i = 0;
    if (this.mContext == null)
      throw new Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
    PackageManager localPackageManager = this.mContext.getPackageManager();
    if (localPackageManager != null);
    while (true)
    {
      try
      {
        if (localPackageManager.getPackageInfo("com.tencent.android.qqdownloader", 0) != null)
        {
          int j = GlobalUtil.getInstance().getQQDownloaderAPILevel();
          int k = this.sdkAPILevel;
          if (k > j)
            i = 2;
          return i;
        }
        i = 1;
        continue;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        TMLog.i("BaseQQDownloaderOpenSDK", "packagename not found！");
      }
      i = 1;
    }
  }

  public abstract void destroyQQDownloaderOpenSDK();

  protected String formatEncryptUrl(String paramString)
  {
    return "tmast://encrypt?encryptdata=".concat(String.valueOf(URLEncoder.encode(OpenSDKTool4Assistant.encryptUri(paramString))));
  }

  protected String formatIntentUriPath(int paramInt, Map<String, String> paramMap)
  {
    Object localObject;
    String str1;
    switch (paramInt)
    {
    default:
      localObject = "appdetails";
      str1 = "tpmast://" + (String)localObject + "?";
      String str2 = "";
      localObject = str2;
      if (paramMap != null)
      {
        localObject = str2;
        if (paramMap.size() > 0)
        {
          Iterator localIterator = paramMap.entrySet().iterator();
          paramInt = 0;
          paramMap = str2;
          label103: localObject = paramMap;
          if (localIterator.hasNext())
          {
            localObject = (Map.Entry)localIterator.next();
            str2 = (String)((Map.Entry)localObject).getKey();
            String str3 = (String)((Map.Entry)localObject).getValue();
            if ((TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str3)))
              break label292;
            if (paramInt <= 0)
            {
              localObject = "";
              label171: paramMap = paramMap + (String)localObject + str2 + "=" + URLEncoder.encode(str3);
            }
          }
        }
      }
      break;
    case 2:
    case 1:
    case 3:
    case 4:
    case 5:
    }
    label292: 
    while (true)
    {
      paramInt++;
      break label103;
      localObject = "appdetails";
      break;
      localObject = "download";
      break;
      localObject = "appdetails";
      break;
      localObject = "updatedownload";
      break;
      localObject = "webview";
      break;
      localObject = "&";
      break label171;
      paramMap = str1 + (String)localObject;
      TMLog.i("BaseQQDownloaderOpenSDK", "path:".concat(String.valueOf(paramMap)));
      return formatEncryptUrl(paramMap);
    }
  }

  protected Map<String, String> formatMapParams(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str = formatOplist(paramBoolean1, paramBoolean2);
    HashMap localHashMap = new HashMap();
    localHashMap.put("hostpname", this.hostPackageName);
    localHashMap.put("hostversioncode", String.valueOf(this.hostVersionCode));
    localHashMap.put("sngappid", paramTMQQDownloaderOpenSDKParam.SNGAppId);
    localHashMap.put("appid", paramTMQQDownloaderOpenSDKParam.taskAppId);
    localHashMap.put("apkid", paramTMQQDownloaderOpenSDKParam.taskApkId);
    localHashMap.put("pname", paramTMQQDownloaderOpenSDKParam.taskPackageName);
    localHashMap.put("via", paramTMQQDownloaderOpenSDKParam.via);
    localHashMap.put("uin", paramTMQQDownloaderOpenSDKParam.uin);
    localHashMap.put("uintype", paramTMQQDownloaderOpenSDKParam.uinType);
    localHashMap.put("versioncode", String.valueOf(paramTMQQDownloaderOpenSDKParam.taskVersion));
    localHashMap.put("oplist", str);
    localHashMap.put("channelid", paramTMQQDownloaderOpenSDKParam.channelId);
    localHashMap.put("actionflag", paramTMQQDownloaderOpenSDKParam.actionFlag);
    localHashMap.put("sdkid", paramTMQQDownloaderOpenSDKParam.sdkId);
    return localHashMap;
  }

  protected String formatOplist(boolean paramBoolean1, boolean paramBoolean2)
  {
    String str = "";
    if ((paramBoolean1) && (paramBoolean2))
      str = "1;2";
    while (true)
    {
      return str;
      if (paramBoolean2)
        str = "2";
      else if (paramBoolean1)
        str = "1";
    }
  }

  public abstract TMAssistantDownloadTaskInfo getDownloadTaskState(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam);

  public abstract void initQQDownloaderOpenSDK(Context paramContext);

  protected void onStateChanged(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, int paramInt1, int paramInt2, String paramString)
  {
    Iterator localIterator = this.mWeakListenerArrayList.iterator();
    while (localIterator.hasNext())
    {
      ITMQQDownloaderOpenSDKListener localITMQQDownloaderOpenSDKListener = (ITMQQDownloaderOpenSDKListener)((WeakReference)localIterator.next()).get();
      if (localITMQQDownloaderOpenSDKListener == null)
        TMLog.i("BaseQQDownloaderOpenSDK", "onDownloadStateChanged listener = null");
      else
        localITMQQDownloaderOpenSDKListener.OnDownloadTaskStateChanged(paramTMQQDownloaderOpenSDKParam, paramInt1, paramInt2, paramString);
    }
  }

  public boolean registerListener(ITMQQDownloaderOpenSDKListener paramITMQQDownloaderOpenSDKListener)
  {
    boolean bool;
    if (paramITMQQDownloaderOpenSDKListener == null)
      bool = false;
    while (true)
    {
      return bool;
      while (true)
      {
        localObject = this.mListenerQueue.poll();
        if (localObject == null)
          break;
        this.mWeakListenerArrayList.remove(localObject);
      }
      Object localObject = this.mWeakListenerArrayList.iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
          if ((ITMQQDownloaderOpenSDKListener)((WeakReference)((Iterator)localObject).next()).get() == paramITMQQDownloaderOpenSDKListener)
          {
            bool = true;
            break;
          }
      paramITMQQDownloaderOpenSDKListener = new WeakReference(paramITMQQDownloaderOpenSDKListener, this.mListenerQueue);
      this.mWeakListenerArrayList.add(paramITMQQDownloaderOpenSDKListener);
      bool = true;
    }
  }

  public boolean removeDownloadTask(long paramLong)
  {
    if (paramLong >= 0L);
    for (boolean bool = this.sdkChannel.delDataItem(paramLong); ; bool = false)
      return bool;
  }

  public abstract void startToAuthorized(Context paramContext, TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, String paramString);

  public void startToDownloadTaskList(Context paramContext)
  {
    if (paramContext == null)
      throw new Exception("you must input an application or activity context!");
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("tmast://download?hostpname=" + this.hostPackageName + "&hostversion=" + this.hostVersionCode));
    if ((paramContext instanceof Application))
      localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  public abstract void startToWebView(Context paramContext, String paramString);

  public boolean unregisterListener(ITMQQDownloaderOpenSDKListener paramITMQQDownloaderOpenSDKListener)
  {
    boolean bool;
    if (paramITMQQDownloaderOpenSDKListener == null)
      bool = false;
    while (true)
    {
      return bool;
      Iterator localIterator = this.mWeakListenerArrayList.iterator();
      while (true)
        if (localIterator.hasNext())
          if ((ITMQQDownloaderOpenSDKListener)((WeakReference)localIterator.next()).get() == paramITMQQDownloaderOpenSDKListener)
          {
            localIterator.remove();
            bool = true;
            break;
          }
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK
 * JD-Core Version:    0.6.2
 */