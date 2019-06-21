package com.tencent.tmassistantsdk.openSDK;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import com.tencent.tmassistantsdk.logreport.DownloadReportManager;
import com.tencent.tmassistantsdk.logreport.GetSettingEngine;
import com.tencent.tmassistantsdk.logreport.LogReportManager;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos;
import com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class TMQQDownloaderOpenSDK extends BaseQQDownloaderOpenSDK
  implements IDownloadStateChangedListener
{
  public static final String AUTHORITY = "com.tencent.android.qqdownloader.provider";
  public static final Uri CONTENT_URI = AssistantStore.DownloadInfos.CONTENT_URI;
  protected static final String TAG = "QQDownloaderOpenSDK";
  protected static TMQQDownloaderOpenSDK mInstance = null;
  Map<String, TMQQDownloaderOpenSDKParam> mDownloadParams;
  protected int sdkAPILevel;

  private TMQQDownloaderOpenSDK()
  {
    AppMethodBeat.i(75856);
    this.sdkAPILevel = 1;
    this.mDownloadParams = null;
    this.mDownloadParams = new ConcurrentHashMap();
    AppMethodBeat.o(75856);
  }

  public static String about()
  {
    return "TMQQDownloaderOpenSDK_2014_05_13_17_36_release_35169";
  }

  public static TMQQDownloaderOpenSDK getInstance()
  {
    try
    {
      AppMethodBeat.i(75857);
      if (mInstance == null)
      {
        localTMQQDownloaderOpenSDK = new com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK;
        localTMQQDownloaderOpenSDK.<init>();
        mInstance = localTMQQDownloaderOpenSDK;
      }
      TMQQDownloaderOpenSDK localTMQQDownloaderOpenSDK = mInstance;
      AppMethodBeat.o(75857);
      return localTMQQDownloaderOpenSDK;
    }
    finally
    {
    }
  }

  public static boolean isExistActoin(long paramLong)
  {
    AppMethodBeat.i(75859);
    boolean bool;
    if (paramLong < 0L)
    {
      AppMethodBeat.o(75859);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = new TMAssistantSDKChannel().getChannelDataItemList();
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        localObject = ((ArrayList)localObject).iterator();
        while (true)
          if (((Iterator)localObject).hasNext())
          {
            TMAssistantSDKChannelDataItem localTMAssistantSDKChannelDataItem = (TMAssistantSDKChannelDataItem)((Iterator)localObject).next();
            if ((localTMAssistantSDKChannelDataItem.mDBIdentity == paramLong) && (localTMAssistantSDKChannelDataItem.mDataItemEndTime - localTMAssistantSDKChannelDataItem.mDataItemStartTime <= 300000L))
            {
              bool = true;
              AppMethodBeat.o(75859);
              break;
            }
          }
      }
      AppMethodBeat.o(75859);
      bool = false;
    }
  }

  private boolean isFileExist(String paramString)
  {
    AppMethodBeat.i(75872);
    boolean bool;
    if (new File(paramString).exists())
    {
      bool = true;
      AppMethodBeat.o(75872);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(75872);
    }
  }

  private void relateToQQDownloader(Context paramContext, TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, String paramString)
  {
    AppMethodBeat.i(75871);
    paramTMQQDownloaderOpenSDKParam = super.formatMapParams(paramTMQQDownloaderOpenSDKParam, false, false);
    paramTMQQDownloaderOpenSDKParam.put("taskid", paramString);
    paramString = super.formatIntentUriPath(4, paramTMQQDownloaderOpenSDKParam);
    paramTMQQDownloaderOpenSDKParam = new Intent("com.tencent.android.qqdownloader.action.RELATED");
    paramTMQQDownloaderOpenSDKParam.setPackage("com.tencent.android.qqdownloader");
    paramTMQQDownloaderOpenSDKParam.putExtra("command", "cmd_updatedownload");
    paramTMQQDownloaderOpenSDKParam.putExtra("relatedurl", paramString);
    paramContext.sendBroadcast(paramTMQQDownloaderOpenSDKParam);
    AppMethodBeat.o(75871);
  }

  public long addDownloadTaskFromAppDetail(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(75865);
    if ((this.mDownloadParams != null) && (paramTMQQDownloaderOpenSDKParam != null))
    {
      String str = UUID.randomUUID().toString();
      this.mDownloadParams.put(str, paramTMQQDownloaderOpenSDKParam);
    }
    long l = super.buildAddDBData(paramTMQQDownloaderOpenSDKParam, paramBoolean1, paramBoolean2, paramTMQQDownloaderOpenSDKParam.actionFlag, null, 2);
    AppMethodBeat.o(75865);
    return l;
  }

  public long addDownloadTaskFromAuthorize(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, String paramString)
  {
    AppMethodBeat.i(75868);
    if ((this.mDownloadParams != null) && (paramTMQQDownloaderOpenSDKParam != null))
    {
      String str = UUID.randomUUID().toString();
      this.mDownloadParams.put(str, paramTMQQDownloaderOpenSDKParam);
    }
    long l = super.buildAddDBData(paramTMQQDownloaderOpenSDKParam, true, true, paramTMQQDownloaderOpenSDKParam.actionFlag, paramString, 3);
    AppMethodBeat.o(75868);
    return l;
  }

  public long addDownloadTaskFromAuthorize(String paramString)
  {
    AppMethodBeat.i(75869);
    paramString = super.formatEncryptUrl(paramString);
    long l = System.currentTimeMillis();
    l = this.sdkChannel.AddDataItem(this.hostPackageName, this.hostVersionCode, "", 0, paramString, l, l + 300000L, 0, null);
    AppMethodBeat.o(75869);
    return l;
  }

  public long addDownloadTaskFromTaskList(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(75863);
    if ((this.mDownloadParams != null) && (paramTMQQDownloaderOpenSDKParam != null))
    {
      String str = UUID.randomUUID().toString();
      this.mDownloadParams.put(str, paramTMQQDownloaderOpenSDKParam);
    }
    long l = super.buildAddDBData(paramTMQQDownloaderOpenSDKParam, paramBoolean1, paramBoolean2, paramTMQQDownloaderOpenSDKParam.actionFlag, null, 1);
    AppMethodBeat.o(75863);
    return l;
  }

  public int checkQQDownloaderInstalled(int paramInt)
  {
    int i = 2;
    AppMethodBeat.i(75860);
    if (this.mContext == null)
    {
      localObject = new Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
      AppMethodBeat.o(75860);
      throw ((Throwable)localObject);
    }
    Object localObject = this.mContext.getPackageManager();
    if (localObject != null);
    while (true)
    {
      try
      {
        if (((PackageManager)localObject).getPackageInfo("com.tencent.android.qqdownloader", 0) != null)
        {
          int j = GlobalUtil.getInstance().getQQDownloaderVersionCode();
          int k = GlobalUtil.getInstance().getQQDownloaderAPILevel();
          int m = this.sdkAPILevel;
          if (m > k)
          {
            AppMethodBeat.o(75860);
            paramInt = i;
            return paramInt;
          }
          if (paramInt > j)
          {
            AppMethodBeat.o(75860);
            paramInt = i;
            continue;
          }
          AppMethodBeat.o(75860);
          paramInt = 0;
          continue;
        }
        AppMethodBeat.o(75860);
        paramInt = 1;
        continue;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        ab.printErrStackTrace("QQDownloaderOpenSDK", localNameNotFoundException, "", new Object[0]);
      }
      AppMethodBeat.o(75860);
      paramInt = 1;
    }
  }

  public void destroyQQDownloaderOpenSDK()
  {
    AppMethodBeat.i(75858);
    NetworkMonitorReceiver.getInstance().unregisterReceiver();
    GetSettingEngine.getInstance().cancleRequest();
    LogReportManager.getInstance().cancleReport();
    LogReportManager.getInstance().destory();
    if (this.mContext != null)
    {
      DownloadStateChangedReceiver.getInstance().unRegisteReceiver(this.mContext);
      DownloadStateChangedReceiver.getInstance().removeDownloadStateChangedListener(this);
    }
    GlobalUtil.getInstance().destroy();
    this.mContext = null;
    AppMethodBeat.o(75858);
  }

  // ERROR //
  public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskState(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam)
  {
    // Byte code:
    //   0: ldc_w 307
    //   3: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 224	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:mContext	Landroid/content/Context;
    //   10: ifnonnull +22 -> 32
    //   13: new 226	java/lang/Exception
    //   16: dup
    //   17: ldc_w 309
    //   20: invokespecial 229	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   23: astore_1
    //   24: ldc_w 307
    //   27: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: aload_1
    //   31: athrow
    //   32: aload_1
    //   33: ifnonnull +22 -> 55
    //   36: new 226	java/lang/Exception
    //   39: dup
    //   40: ldc_w 311
    //   43: invokespecial 229	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   46: astore_1
    //   47: ldc_w 307
    //   50: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: aload_1
    //   54: athrow
    //   55: aload_0
    //   56: getfield 224	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:mContext	Landroid/content/Context;
    //   59: invokevirtual 315	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   62: astore_2
    //   63: aload_2
    //   64: getstatic 31	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:CONTENT_URI	Landroid/net/Uri;
    //   67: aconst_null
    //   68: ldc_w 317
    //   71: iconst_3
    //   72: anewarray 319	java/lang/String
    //   75: dup
    //   76: iconst_0
    //   77: aload_1
    //   78: getfield 322	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskPackageName	Ljava/lang/String;
    //   81: aastore
    //   82: dup
    //   83: iconst_1
    //   84: aload_1
    //   85: getfield 325	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskVersion	I
    //   88: invokestatic 329	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   91: aastore
    //   92: dup
    //   93: iconst_2
    //   94: aload_1
    //   95: getfield 332	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:channelId	Ljava/lang/String;
    //   98: aastore
    //   99: aconst_null
    //   100: invokevirtual 338	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   103: astore_2
    //   104: new 340	java/lang/StringBuilder
    //   107: astore_3
    //   108: aload_3
    //   109: ldc_w 342
    //   112: invokespecial 343	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   115: ldc 15
    //   117: aload_3
    //   118: aload_1
    //   119: getfield 322	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskPackageName	Ljava/lang/String;
    //   122: invokevirtual 347	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: ldc_w 349
    //   128: invokevirtual 347	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: aload_1
    //   132: getfield 325	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskVersion	I
    //   135: invokestatic 329	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   138: invokevirtual 347	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: ldc_w 351
    //   144: invokevirtual 347	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: aload_1
    //   148: getfield 332	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:channelId	Ljava/lang/String;
    //   151: invokevirtual 347	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 352	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: invokestatic 358	com/tencent/tmassistantsdk/util/TMLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload_2
    //   161: ifnull +572 -> 733
    //   164: aload_2
    //   165: invokeinterface 363 1 0
    //   170: ifeq +563 -> 733
    //   173: new 340	java/lang/StringBuilder
    //   176: astore_3
    //   177: aload_3
    //   178: ldc_w 365
    //   181: invokespecial 343	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   184: ldc 15
    //   186: aload_3
    //   187: aload_1
    //   188: getfield 322	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskPackageName	Ljava/lang/String;
    //   191: invokevirtual 347	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: invokevirtual 352	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: invokestatic 367	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   200: aload_2
    //   201: aload_2
    //   202: ldc_w 369
    //   205: invokeinterface 373 2 0
    //   210: invokeinterface 377 2 0
    //   215: lstore 4
    //   217: aload_2
    //   218: aload_2
    //   219: ldc_w 379
    //   222: invokeinterface 373 2 0
    //   227: invokeinterface 382 2 0
    //   232: invokestatic 386	com/tencent/tmassistantsdk/util/GlobalUtil:String2List	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   235: iconst_0
    //   236: invokevirtual 390	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   239: checkcast 319	java/lang/String
    //   242: astore_3
    //   243: aload_2
    //   244: aload_2
    //   245: ldc_w 392
    //   248: invokeinterface 373 2 0
    //   253: invokeinterface 382 2 0
    //   258: astore 6
    //   260: aload_2
    //   261: aload_2
    //   262: ldc_w 394
    //   265: invokeinterface 373 2 0
    //   270: invokeinterface 377 2 0
    //   275: lstore 7
    //   277: aload_2
    //   278: aload_2
    //   279: ldc_w 396
    //   282: invokeinterface 373 2 0
    //   287: invokeinterface 377 2 0
    //   292: lstore 9
    //   294: aload_2
    //   295: aload_2
    //   296: ldc_w 398
    //   299: invokeinterface 373 2 0
    //   304: invokeinterface 401 2 0
    //   309: invokestatic 404	com/tencent/tmassistantsdk/util/GlobalUtil:assistantState2SDKState	(I)I
    //   312: istore 11
    //   314: ldc 15
    //   316: ldc_w 406
    //   319: iload 11
    //   321: invokestatic 329	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   324: invokevirtual 409	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   327: invokestatic 367	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   330: iconst_4
    //   331: iload 11
    //   333: if_icmpne +38 -> 371
    //   336: aload_0
    //   337: aload 6
    //   339: invokespecial 411	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:isFileExist	(Ljava/lang/String;)Z
    //   342: istore 12
    //   344: iload 12
    //   346: ifne +25 -> 371
    //   349: aload_2
    //   350: ifnull +9 -> 359
    //   353: aload_2
    //   354: invokeinterface 414 1 0
    //   359: aconst_null
    //   360: astore 13
    //   362: ldc_w 307
    //   365: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   368: aload 13
    //   370: areturn
    //   371: new 416	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo
    //   374: astore 13
    //   376: aload 13
    //   378: aload_3
    //   379: aload 6
    //   381: iload 11
    //   383: lload 7
    //   385: lload 9
    //   387: ldc_w 418
    //   390: invokespecial 421	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:<init>	(Ljava/lang/String;Ljava/lang/String;IJJLjava/lang/String;)V
    //   393: iload 11
    //   395: iconst_5
    //   396: if_icmpeq +15 -> 411
    //   399: iload 11
    //   401: iconst_4
    //   402: if_icmpeq +9 -> 411
    //   405: iload 11
    //   407: iconst_3
    //   408: if_icmpne +52 -> 460
    //   411: invokestatic 426	com/tencent/tmassistantsdk/logreport/DownloadReportManager:getInstance	()Lcom/tencent/tmassistantsdk/logreport/DownloadReportManager;
    //   414: iconst_1
    //   415: invokevirtual 430	com/tencent/tmassistantsdk/logreport/DownloadReportManager:createNewChunkLogInfo	(B)Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;
    //   418: astore 6
    //   420: aload 6
    //   422: aload_1
    //   423: getfield 433	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:via	Ljava/lang/String;
    //   426: putfield 436	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:via	Ljava/lang/String;
    //   429: aload 6
    //   431: lload 4
    //   433: invokestatic 439	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   436: putfield 442	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:appId	Ljava/lang/String;
    //   439: aload 6
    //   441: iload 11
    //   443: putfield 445	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:resultState	I
    //   446: aload 6
    //   448: aload_3
    //   449: putfield 448	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:requestUrl	Ljava/lang/String;
    //   452: invokestatic 426	com/tencent/tmassistantsdk/logreport/DownloadReportManager:getInstance	()Lcom/tencent/tmassistantsdk/logreport/DownloadReportManager;
    //   455: aload 6
    //   457: invokevirtual 452	com/tencent/tmassistantsdk/logreport/DownloadReportManager:addLogData	(Lcom/qq/taf/jce/JceStruct;)V
    //   460: aload 13
    //   462: astore_3
    //   463: aload_0
    //   464: getfield 46	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:mDownloadParams	Ljava/util/Map;
    //   467: ifnull +157 -> 624
    //   470: aload_0
    //   471: getfield 46	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:mDownloadParams	Ljava/util/Map;
    //   474: invokeinterface 456 1 0
    //   479: invokeinterface 459 1 0
    //   484: astore_3
    //   485: aload_3
    //   486: invokeinterface 86 1 0
    //   491: ifeq +236 -> 727
    //   494: aload_3
    //   495: invokeinterface 90 1 0
    //   500: checkcast 461	java/util/Map$Entry
    //   503: invokeinterface 464 1 0
    //   508: checkcast 175	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam
    //   511: astore 6
    //   513: aload 6
    //   515: ifnull -30 -> 485
    //   518: aload 6
    //   520: getfield 322	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskPackageName	Ljava/lang/String;
    //   523: aload_1
    //   524: getfield 322	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskPackageName	Ljava/lang/String;
    //   527: invokevirtual 468	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   530: ifeq -45 -> 485
    //   533: aload 6
    //   535: getfield 325	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskVersion	I
    //   538: aload_1
    //   539: getfield 325	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskVersion	I
    //   542: if_icmpne -57 -> 485
    //   545: iconst_1
    //   546: istore 11
    //   548: aload 13
    //   550: astore_3
    //   551: iload 11
    //   553: ifne +71 -> 624
    //   556: new 340	java/lang/StringBuilder
    //   559: astore_3
    //   560: aload_3
    //   561: ldc_w 365
    //   564: invokespecial 343	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   567: ldc 15
    //   569: aload_3
    //   570: aload_1
    //   571: getfield 322	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskPackageName	Ljava/lang/String;
    //   574: invokevirtual 347	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: invokevirtual 352	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   580: invokestatic 367	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   583: invokestatic 170	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   586: invokevirtual 173	java/util/UUID:toString	()Ljava/lang/String;
    //   589: astore_3
    //   590: aload_1
    //   591: lload 4
    //   593: invokestatic 439	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   596: putfield 471	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam:taskApkId	Ljava/lang/String;
    //   599: aload_0
    //   600: getfield 46	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:mDownloadParams	Ljava/util/Map;
    //   603: aload_3
    //   604: aload_1
    //   605: invokeinterface 130 3 0
    //   610: pop
    //   611: aload_0
    //   612: aload_0
    //   613: getfield 224	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:mContext	Landroid/content/Context;
    //   616: aload_1
    //   617: aload_3
    //   618: invokespecial 473	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:relateToQQDownloader	(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;Ljava/lang/String;)V
    //   621: aload 13
    //   623: astore_3
    //   624: aload_3
    //   625: astore 13
    //   627: aload_2
    //   628: ifnull +12 -> 640
    //   631: aload_2
    //   632: invokeinterface 414 1 0
    //   637: aload_3
    //   638: astore 13
    //   640: ldc_w 307
    //   643: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   646: goto -278 -> 368
    //   649: astore_3
    //   650: aconst_null
    //   651: astore_2
    //   652: aconst_null
    //   653: astore_1
    //   654: ldc 15
    //   656: aload_3
    //   657: ldc 209
    //   659: iconst_0
    //   660: anewarray 252	java/lang/Object
    //   663: invokestatic 258	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   666: aload_1
    //   667: astore 13
    //   669: aload_2
    //   670: ifnull -30 -> 640
    //   673: aload_2
    //   674: invokeinterface 414 1 0
    //   679: aload_1
    //   680: astore 13
    //   682: goto -42 -> 640
    //   685: astore_1
    //   686: aconst_null
    //   687: astore_2
    //   688: aload_2
    //   689: ifnull +9 -> 698
    //   692: aload_2
    //   693: invokeinterface 414 1 0
    //   698: ldc_w 307
    //   701: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   704: aload_1
    //   705: athrow
    //   706: astore_1
    //   707: goto -19 -> 688
    //   710: astore_1
    //   711: goto -23 -> 688
    //   714: astore_3
    //   715: aconst_null
    //   716: astore_1
    //   717: goto -63 -> 654
    //   720: astore_3
    //   721: aload 13
    //   723: astore_1
    //   724: goto -70 -> 654
    //   727: iconst_0
    //   728: istore 11
    //   730: goto -182 -> 548
    //   733: aconst_null
    //   734: astore_3
    //   735: goto -111 -> 624
    //
    // Exception table:
    //   from	to	target	type
    //   63	104	649	java/lang/Exception
    //   63	104	685	finally
    //   104	160	706	finally
    //   164	330	706	finally
    //   336	344	706	finally
    //   371	393	706	finally
    //   411	460	706	finally
    //   463	485	706	finally
    //   485	513	706	finally
    //   518	545	706	finally
    //   556	621	706	finally
    //   654	666	710	finally
    //   104	160	714	java/lang/Exception
    //   164	330	714	java/lang/Exception
    //   336	344	714	java/lang/Exception
    //   371	393	714	java/lang/Exception
    //   411	460	720	java/lang/Exception
    //   463	485	720	java/lang/Exception
    //   485	513	720	java/lang/Exception
    //   518	545	720	java/lang/Exception
    //   556	621	720	java/lang/Exception
  }

  public void initQQDownloaderOpenSDK(Context paramContext)
  {
    AppMethodBeat.i(75874);
    this.mContext = paramContext;
    this.hostPackageName = paramContext.getPackageName();
    this.hostVersionCode = GlobalUtil.getAppVersionCode(this.mContext);
    GlobalUtil.getInstance().setContext(this.mContext);
    this.sdkAPILevel = 1;
    DownloadStateChangedReceiver.getInstance().registeReceiver(this.mContext);
    DownloadStateChangedReceiver.getInstance().addDownloadStateChangedListener(this);
    NetworkMonitorReceiver.getInstance().registerReceiver();
    GetSettingEngine.getInstance().sendRequest();
    LogReportManager.getInstance().reportLog();
    AppMethodBeat.o(75874);
  }

  public void onDownloadStateChanged(TMQQDownloaderStateChangeParam paramTMQQDownloaderStateChangeParam)
  {
    AppMethodBeat.i(75873);
    TMQQDownloaderOpenSDKParam localTMQQDownloaderOpenSDKParam = paramTMQQDownloaderStateChangeParam.param;
    int i = GlobalUtil.assistantState2SDKState(paramTMQQDownloaderStateChangeParam.state);
    int j = GlobalUtil.assistantErrorCode2SDKErrorCode(paramTMQQDownloaderStateChangeParam.errorCode);
    Object localObject1 = paramTMQQDownloaderStateChangeParam.errorMsg;
    Object localObject2 = paramTMQQDownloaderStateChangeParam.taskId;
    TMLog.i("QQDownloaderOpenSDK", "onDownloadStateChanged state = ".concat(String.valueOf(i)));
    Iterator localIterator = null;
    paramTMQQDownloaderStateChangeParam = localIterator;
    if (localObject2 != null)
    {
      paramTMQQDownloaderStateChangeParam = localIterator;
      if (((String)localObject2).trim().length() > 0)
        paramTMQQDownloaderStateChangeParam = (TMQQDownloaderOpenSDKParam)this.mDownloadParams.get(localObject2);
    }
    if (paramTMQQDownloaderStateChangeParam != null)
      onStateChanged(paramTMQQDownloaderStateChangeParam, i, j, (String)localObject1);
    while (6 == i)
    {
      paramTMQQDownloaderStateChangeParam = new ArrayList();
      localIterator = this.mDownloadParams.entrySet().iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localObject2 = (Map.Entry)localIterator.next();
          localObject1 = (TMQQDownloaderOpenSDKParam)((Map.Entry)localObject2).getValue();
          localObject2 = (String)((Map.Entry)localObject2).getKey();
          if ((localObject1 != null) && (!TextUtils.isEmpty(localTMQQDownloaderOpenSDKParam.taskPackageName)) && (((TMQQDownloaderOpenSDKParam)localObject1).taskPackageName.equals(localTMQQDownloaderOpenSDKParam.taskPackageName)) && (((TMQQDownloaderOpenSDKParam)localObject1).taskVersion == localTMQQDownloaderOpenSDKParam.taskVersion))
          {
            paramTMQQDownloaderStateChangeParam.add(localObject2);
            continue;
            TMLog.i("QQDownloaderOpenSDK", "onDownloadStateChanged storeParam = null");
            break;
          }
        }
      localIterator = paramTMQQDownloaderStateChangeParam.iterator();
      while (localIterator.hasNext())
      {
        paramTMQQDownloaderStateChangeParam = (String)localIterator.next();
        this.mDownloadParams.remove(paramTMQQDownloaderStateChangeParam);
      }
    }
    AppMethodBeat.o(75873);
  }

  public void startQQDownloader(Context paramContext)
  {
    AppMethodBeat.i(75861);
    if (paramContext != null)
    {
      Intent localIntent = paramContext.getPackageManager().getLaunchIntentForPackage("com.tencent.android.qqdownloader");
      if ((paramContext instanceof Application))
        localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent);
    }
    AppMethodBeat.o(75861);
  }

  public void startToAppDetail(Context paramContext, TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(75864);
    if (paramContext == null)
    {
      paramContext = new Exception("you must input an application or activity context!");
      AppMethodBeat.o(75864);
      throw paramContext;
    }
    String str = UUID.randomUUID().toString();
    if (this.mDownloadParams != null)
      this.mDownloadParams.put(str, paramTMQQDownloaderOpenSDKParam);
    if (paramBoolean1)
    {
      DownloadChunkLogInfo localDownloadChunkLogInfo = DownloadReportManager.getInstance().createNewChunkLogInfo((byte)1);
      localDownloadChunkLogInfo.via = paramTMQQDownloaderOpenSDKParam.via;
      localDownloadChunkLogInfo.UUID = str;
      localDownloadChunkLogInfo.appId = paramTMQQDownloaderOpenSDKParam.taskAppId;
      localDownloadChunkLogInfo.resultState = 1;
      DownloadReportManager.getInstance().addLogData(localDownloadChunkLogInfo);
    }
    paramTMQQDownloaderOpenSDKParam = super.formatMapParams(paramTMQQDownloaderOpenSDKParam, paramBoolean1, paramBoolean2);
    paramTMQQDownloaderOpenSDKParam.put("taskid", str);
    paramTMQQDownloaderOpenSDKParam = new Intent("android.intent.action.VIEW", Uri.parse(super.formatIntentUriPath(2, paramTMQQDownloaderOpenSDKParam)));
    if ((paramContext instanceof Application))
      paramTMQQDownloaderOpenSDKParam.addFlags(268435456);
    paramContext.startActivity(paramTMQQDownloaderOpenSDKParam);
    AppMethodBeat.o(75864);
  }

  public void startToAuthorized(Context paramContext, TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, String paramString)
  {
    AppMethodBeat.i(75866);
    if (paramContext == null)
    {
      paramContext = new Exception("you must input an application or activity context!");
      AppMethodBeat.o(75866);
      throw paramContext;
    }
    if (paramTMQQDownloaderOpenSDKParam == null)
    {
      paramContext = new Exception("QQDownloaderParam param cann't be null!");
      AppMethodBeat.o(75866);
      throw paramContext;
    }
    String str = UUID.randomUUID().toString();
    if (this.mDownloadParams != null)
      this.mDownloadParams.put(str, paramTMQQDownloaderOpenSDKParam);
    DownloadChunkLogInfo localDownloadChunkLogInfo = DownloadReportManager.getInstance().createNewChunkLogInfo((byte)1);
    localDownloadChunkLogInfo.via = paramTMQQDownloaderOpenSDKParam.via;
    localDownloadChunkLogInfo.UUID = str;
    localDownloadChunkLogInfo.appId = paramTMQQDownloaderOpenSDKParam.taskAppId;
    localDownloadChunkLogInfo.resultState = 1;
    DownloadReportManager.getInstance().addLogData(localDownloadChunkLogInfo);
    paramTMQQDownloaderOpenSDKParam = super.formatMapParams(paramTMQQDownloaderOpenSDKParam, true, true);
    paramTMQQDownloaderOpenSDKParam.put("verifytype", paramString);
    paramTMQQDownloaderOpenSDKParam.put("taskid", str);
    paramTMQQDownloaderOpenSDKParam = new Intent("android.intent.action.VIEW", Uri.parse(super.formatIntentUriPath(3, paramTMQQDownloaderOpenSDKParam)));
    if ((paramContext instanceof Application))
      paramTMQQDownloaderOpenSDKParam.addFlags(268435456);
    paramContext.startActivity(paramTMQQDownloaderOpenSDKParam);
    AppMethodBeat.o(75866);
  }

  public void startToAuthorized(Context paramContext, String paramString)
  {
    AppMethodBeat.i(75867);
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(formatEncryptUrl(paramString)));
    if ((paramContext instanceof Application))
      paramString.addFlags(268435456);
    paramContext.startActivity(paramString);
    AppMethodBeat.o(75867);
  }

  public void startToDownloadTaskList(Context paramContext, TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(75862);
    if (paramContext == null)
    {
      paramContext = new Exception("you must input an application or activity context!");
      AppMethodBeat.o(75862);
      throw paramContext;
    }
    if (paramTMQQDownloaderOpenSDKParam == null)
      AppMethodBeat.o(75862);
    while (true)
    {
      return;
      String str = UUID.randomUUID().toString();
      if (this.mDownloadParams != null)
        this.mDownloadParams.put(str, paramTMQQDownloaderOpenSDKParam);
      if (paramBoolean1)
      {
        DownloadChunkLogInfo localDownloadChunkLogInfo = DownloadReportManager.getInstance().createNewChunkLogInfo((byte)1);
        localDownloadChunkLogInfo.UUID = str;
        localDownloadChunkLogInfo.requestUrl = "";
        localDownloadChunkLogInfo.via = paramTMQQDownloaderOpenSDKParam.via;
        localDownloadChunkLogInfo.appId = paramTMQQDownloaderOpenSDKParam.taskAppId;
        DownloadReportManager.getInstance().addLogData(localDownloadChunkLogInfo);
      }
      paramTMQQDownloaderOpenSDKParam = super.formatMapParams(paramTMQQDownloaderOpenSDKParam, paramBoolean1, paramBoolean2);
      paramTMQQDownloaderOpenSDKParam.put("taskid", str);
      paramTMQQDownloaderOpenSDKParam = new Intent("android.intent.action.VIEW", Uri.parse(super.formatIntentUriPath(1, paramTMQQDownloaderOpenSDKParam)));
      if ((paramContext instanceof Application))
        paramTMQQDownloaderOpenSDKParam.addFlags(268435456);
      paramContext.startActivity(paramTMQQDownloaderOpenSDKParam);
      AppMethodBeat.o(75862);
    }
  }

  public void startToWebView(Context paramContext, String paramString)
  {
    AppMethodBeat.i(75875);
    if (paramContext == null)
    {
      paramContext = new Exception("you must input an application or activity context!");
      AppMethodBeat.o(75875);
      throw paramContext;
    }
    if (TextUtils.isEmpty(paramString))
    {
      paramContext = new Exception("param url shouldn't be null!");
      AppMethodBeat.o(75875);
      throw paramContext;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    paramString = super.formatIntentUriPath(5, localHashMap);
    TMLog.i("QQDownloaderOpenSDK", "startToWebView finalPath:".concat(String.valueOf(paramString)));
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    if ((paramContext instanceof Application))
      paramString.addFlags(268435456);
    paramContext.startActivity(paramString);
    AppMethodBeat.o(75875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK
 * JD-Core Version:    0.6.2
 */