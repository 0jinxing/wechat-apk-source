package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

import android.app.Activity;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem;
import com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager;
import com.tencent.tmassistantsdk.logreport.TipsInfoReportManager;
import com.tencent.tmassistantsdk.network.GetAuthorizedHttpRequest;
import com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component.PopDialog;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo;
import com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog;
import com.tencent.tmassistantsdk.util.Res;
import com.tencent.tmassistantsdk.util.TMLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class TMOpenSDKToMsdkManager
{
  protected static final String CLIENT_NAME = "downloadSDKClient";
  protected static final String TAG = "OpensdkToMsdkManager";
  protected static TMOpenSDKToMsdkManager mInstance = null;
  protected int authorizedState;
  protected PopDialog dialog;
  protected boolean hasNotify;
  protected long insertActionId;
  protected boolean isInstallFinished;
  protected TMOpenSDKAuthorizedInfo mAuthorizedInfo;
  protected TMAssistantDownloadSDKClient mClient;
  protected Context mContext;
  protected ITMAssistantDownloadSDKClientListener mDownloadSDKListener;
  protected String mDownloadUrl;
  protected GetAuthorizedHttpRequest mHttpRequest;
  protected ak mMainMessageHandler;
  protected TMQQDownloaderOpenSDK mOpenSDK;
  protected IGetAuthorizedHttpRequestListenner mRequestListener;
  protected ak mSubMessageHandler;
  protected HandlerThread mSubMessagehandlerThread;
  protected int mSupportVersionCode;
  protected ITMOpenSDKToMsdkListener mToMsdkListener;
  protected View.OnClickListener negativeBtnListenner;
  protected View.OnClickListener positiveBtnListener;
  protected View.OnClickListener retryBtnListener;
  protected TMAssistantSDKChannel sdkChannel;

  private TMOpenSDKToMsdkManager(Context paramContext)
  {
    AppMethodBeat.i(75931);
    this.mContext = null;
    this.mHttpRequest = null;
    this.mToMsdkListener = null;
    this.mAuthorizedInfo = null;
    this.mDownloadUrl = null;
    this.mSupportVersionCode = 0;
    this.authorizedState = 0;
    this.hasNotify = false;
    this.isInstallFinished = false;
    this.insertActionId = -1L;
    this.sdkChannel = null;
    this.dialog = null;
    this.mOpenSDK = null;
    this.mSubMessagehandlerThread = null;
    this.mSubMessageHandler = null;
    this.mMainMessageHandler = null;
    this.mClient = null;
    this.mRequestListener = new TMOpenSDKToMsdkManager.2(this);
    this.retryBtnListener = new TMOpenSDKToMsdkManager.4(this);
    this.negativeBtnListenner = new TMOpenSDKToMsdkManager.5(this);
    this.positiveBtnListener = new TMOpenSDKToMsdkManager.6(this);
    this.mDownloadSDKListener = new TMOpenSDKToMsdkManager.9(this);
    this.mContext = paramContext;
    AppMethodBeat.o(75931);
  }

  public static String about()
  {
    return "TMOpenSDKToMsdkManager_2014_04_01_19_51_release_25434";
  }

  public static TMOpenSDKToMsdkManager getInstance(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(75932);
      if (mInstance == null)
      {
        TMOpenSDKToMsdkManager localTMOpenSDKToMsdkManager = new com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager;
        localTMOpenSDKToMsdkManager.<init>(paramContext);
        mInstance = localTMOpenSDKToMsdkManager;
      }
      paramContext = mInstance;
      AppMethodBeat.o(75932);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  protected void continueDownload()
  {
    AppMethodBeat.i(75943);
    this.mSubMessageHandler.post(new TMOpenSDKToMsdkManager.3(this));
    AppMethodBeat.o(75943);
  }

  protected TMAssistantDownloadSDKClient getClient()
  {
    AppMethodBeat.i(75953);
    TMAssistantDownloadSDKClient localTMAssistantDownloadSDKClient;
    if (this.mContext != null)
      if (this.mClient == null)
      {
        localTMAssistantDownloadSDKClient = TMAssistantDownloadSDKManager.getInstance(this.mContext).getDownloadSDKClient("downloadSDKClient");
        localTMAssistantDownloadSDKClient.registerDownloadTaskListener(this.mDownloadSDKListener);
        this.mClient = localTMAssistantDownloadSDKClient;
        AppMethodBeat.o(75953);
      }
    while (true)
    {
      return localTMAssistantDownloadSDKClient;
      localTMAssistantDownloadSDKClient = this.mClient;
      break;
      localTMAssistantDownloadSDKClient = null;
      AppMethodBeat.o(75953);
    }
  }

  public void getUserAuthorizedInfo(TMOpenSDKAuthorizedInfo paramTMOpenSDKAuthorizedInfo, Context paramContext)
  {
    AppMethodBeat.i(75936);
    if (paramContext != null)
      this.mContext = paramContext;
    TMLog.i("OpensdkToMsdkManager", "getUserAuthorizedInfo method called!");
    this.hasNotify = false;
    if (this.mHttpRequest != null)
    {
      TMLog.i("OpensdkToMsdkManager", "mHttpRequest != null, request didn't finish!");
      AppMethodBeat.o(75936);
    }
    while (true)
    {
      return;
      if (paramTMOpenSDKAuthorizedInfo != null)
      {
        this.mAuthorizedInfo = paramTMOpenSDKAuthorizedInfo;
        if (this.mHttpRequest == null)
        {
          this.authorizedState = 1;
          this.mHttpRequest = new GetAuthorizedHttpRequest();
          this.mHttpRequest.setListenner(this.mRequestListener);
          this.mHttpRequest.sendRequest(paramTMOpenSDKAuthorizedInfo);
          AppMethodBeat.o(75936);
        }
      }
      else
      {
        TMLog.i("OpensdkToMsdkManager", "AuthorizedInfo object is null!");
        AppMethodBeat.o(75936);
      }
    }
  }

  protected void handleDownloadContinue(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(75949);
    if (this.mContext == null)
    {
      TMLog.i("OpensdkToMsdkManager", "handleDownloading context = null!");
      AppMethodBeat.o(75949);
    }
    while (true)
    {
      return;
      Res localRes = new Res(this.mContext);
      String str1 = this.mContext.getString(localRes.string("white_list_positive_continue"));
      String str2 = "(" + (int)(((float)(100L * paramLong1) + 0.0F) / (float)paramLong2) + "%)";
      this.dialog.downloadText.setText(str1 + str2);
      this.dialog.downloadProgressBar.setProgress((int)(((float)paramLong1 + 0.0F) / (float)paramLong2 * this.dialog.downloadProgressBar.getMax()));
      if (this.dialog.downloadProgressBar.getProgress() > 0)
        this.dialog.setPositiveBtnBgResource(localRes.drawable("com_tencent_tmassistant_sdk_button_bg"));
      AppMethodBeat.o(75949);
    }
  }

  protected void handleDownloadFailed()
  {
    AppMethodBeat.i(75947);
    if (this.mContext == null)
    {
      TMLog.i("OpensdkToMsdkManager", "handleDownloading context = null!");
      AppMethodBeat.o(75947);
    }
    while (true)
    {
      return;
      Res localRes = new Res(this.mContext);
      this.dialog.setPositiveBtnEnable(true);
      this.dialog.downloadText.setText(this.mContext.getString(localRes.string("white_list_positive_retry")));
      if (this.dialog.downloadProgressBar.getProgress() > 0)
        this.dialog.setPositiveBtnBgResource(localRes.drawable("com_tencent_tmassistant_sdk_button_bg"));
      AppMethodBeat.o(75947);
    }
  }

  protected void handleDownloading(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(75948);
    if (this.mContext == null)
    {
      TMLog.i("OpensdkToMsdkManager", "handleDownloading context = null!");
      AppMethodBeat.o(75948);
    }
    while (true)
    {
      return;
      Object localObject = new Res(this.mContext);
      localObject = this.mContext.getString(((Res)localObject).string("white_list_positive_downloading"));
      String str = "(" + (int)(((float)(100L * paramLong1) + 0.0F) / (float)paramLong2) + "%)";
      this.dialog.downloadText.setText((String)localObject + str);
      this.dialog.downloadProgressBar.setProgress((int)(((float)paramLong1 + 0.0F) / (float)paramLong2 * this.dialog.downloadProgressBar.getMax()));
      TMLog.i("OpensdkToMsdkManager", "handleDownloading : receivedlen:" + paramLong1 + " | totalLen:" + paramLong2);
      AppMethodBeat.o(75948);
    }
  }

  protected void handleInstall(String paramString, int paramInt)
  {
    AppMethodBeat.i(75946);
    if (this.mContext == null)
      AppMethodBeat.o(75946);
    while (true)
    {
      return;
      Res localRes = new Res(this.mContext);
      this.dialog.setPositiveBtnEnable(true);
      this.dialog.downloadText.setText(this.mContext.getString(localRes.string("white_list_positive_install")));
      if (this.mContext == null)
      {
        TMLog.i("OpensdkToMsdkManager", "handleDownloading context = null!");
        AppMethodBeat.o(75946);
      }
      else
      {
        this.isInstallFinished = true;
        if (paramInt == 1)
        {
          AppMethodBeat.o(75946);
        }
        else
        {
          q.a(this.mContext, new File(paramString), null, false);
          AppMethodBeat.o(75946);
        }
      }
    }
  }

  public void initOpenSDK(ITMOpenSDKToMsdkListener paramITMOpenSDKToMsdkListener)
  {
    AppMethodBeat.i(75933);
    this.mOpenSDK = TMQQDownloaderOpenSDK.getInstance();
    this.mOpenSDK.initQQDownloaderOpenSDK(this.mContext);
    this.mToMsdkListener = paramITMOpenSDKToMsdkListener;
    this.sdkChannel = new TMAssistantSDKChannel();
    this.mSubMessagehandlerThread = new HandlerThread("OpenSDKToMsdkManager");
    this.mSubMessagehandlerThread.start();
    this.mSubMessageHandler = new ak(this.mSubMessagehandlerThread.getLooper());
    this.mMainMessageHandler = new ak(Looper.getMainLooper(), new TMOpenSDKToMsdkManager.1(this));
    AppMethodBeat.o(75933);
  }

  protected boolean isExitsAction(long paramLong)
  {
    AppMethodBeat.i(75945);
    boolean bool;
    if (paramLong < 0L)
    {
      AppMethodBeat.o(75945);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this.sdkChannel == null)
      {
        AppMethodBeat.o(75945);
        bool = false;
      }
      else
      {
        Iterator localIterator = this.sdkChannel.getChannelDataItemList().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            TMAssistantSDKChannelDataItem localTMAssistantSDKChannelDataItem = (TMAssistantSDKChannelDataItem)localIterator.next();
            if ((localTMAssistantSDKChannelDataItem.mDBIdentity == paramLong) && (localTMAssistantSDKChannelDataItem.mDataItemEndTime - localTMAssistantSDKChannelDataItem.mDataItemStartTime <= 300000L))
            {
              bool = true;
              AppMethodBeat.o(75945);
              break;
            }
          }
        AppMethodBeat.o(75945);
        bool = false;
      }
    }
  }

  protected void notifyAuthorizedFinished(boolean paramBoolean, TMOpenSDKAuthorizedInfo paramTMOpenSDKAuthorizedInfo)
  {
    AppMethodBeat.i(75941);
    TMLog.i("OpensdkToMsdkManager", "before realy notifyAuthorizedFinished: TMOpenSDKAuthorizedInfo:" + this.mAuthorizedInfo);
    if (this.mToMsdkListener == null)
      TMLog.i("OpensdkToMsdkManager", "before notifyAuthorizedFinished: mToMsdkListener = null !");
    if ((this.mToMsdkListener != null) && (this.mAuthorizedInfo != null))
    {
      TMLog.i("OpensdkToMsdkManager", "notifyAuthorizedFinished: result:".concat(String.valueOf(paramBoolean)));
      this.mToMsdkListener.onAuthorizedFinished(paramBoolean, this.mAuthorizedInfo);
      this.mHttpRequest = null;
      this.hasNotify = true;
    }
    AppMethodBeat.o(75941);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(75934);
    if ((this.dialog != null) && (this.dialog.isShowing()))
      this.dialog.dismiss();
    if (this.mOpenSDK != null)
      this.mOpenSDK.destroyQQDownloaderOpenSDK();
    this.mToMsdkListener = null;
    this.hasNotify = false;
    this.isInstallFinished = false;
    this.authorizedState = 0;
    this.mHttpRequest = null;
    this.mAuthorizedInfo = null;
    this.sdkChannel = null;
    this.insertActionId = -1L;
    if (this.mContext != null)
      TMAssistantDownloadSDKManager.closeAllService(this.mContext);
    this.mClient = null;
    AppMethodBeat.o(75934);
  }

  protected void onNetworkException(int paramInt)
  {
    AppMethodBeat.i(75940);
    if (this.mContext == null)
    {
      AppMethodBeat.o(75940);
      return;
    }
    Object localObject1 = new Res(this.mContext);
    if (1 == paramInt);
    for (Object localObject2 = this.mContext.getString(((Res)localObject1).string("white_list_network_not_connected")); ; localObject2 = this.mContext.getString(((Res)localObject1).string("white_list_network_error")))
    {
      TipsInfo localTipsInfo = new TipsInfo();
      localTipsInfo.title = this.mContext.getString(((Res)localObject1).string("white_list_dlg_title"));
      localTipsInfo.content = ((String)localObject2);
      localObject2 = new ArrayList();
      ActionButton localActionButton = new ActionButton();
      localActionButton.jumpType = 3;
      ((ArrayList)localObject2).add(localActionButton);
      localObject1 = this.mContext.getString(((Res)localObject1).string("white_list_negtive_known"));
      localActionButton.textInstalled = ((String)localObject1);
      localActionButton.textUninstalled = ((String)localObject1);
      localTipsInfo.actionButton = ((ArrayList)localObject2);
      showDialog(localTipsInfo);
      this.mHttpRequest = null;
      this.mDownloadUrl = "";
      this.authorizedState = 3;
      TMLog.i("OpensdkToMsdkManager", "network error happened!");
      localObject2 = TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
      ((TipsInfoLog)localObject2).networkErrorTipsCount += 1;
      TipsInfoReportManager.getInstance().addLogData((JceStruct)localObject2);
      AppMethodBeat.o(75940);
      break;
    }
  }

  protected void onNetworkFinishedFailed(int paramInt)
  {
    AppMethodBeat.i(75938);
    if ((paramInt == 606) || (paramInt == 602) || (paramInt == 601) || (paramInt == 704))
    {
      onServerException(paramInt);
      AppMethodBeat.o(75938);
    }
    while (true)
    {
      return;
      onNetworkException(paramInt);
      AppMethodBeat.o(75938);
    }
  }

  protected void onNetworkFinishedSuccess(AuthorizedResult paramAuthorizedResult)
  {
    AppMethodBeat.i(75937);
    this.mDownloadUrl = paramAuthorizedResult.downloadUrl;
    this.mSupportVersionCode = paramAuthorizedResult.versionCode;
    this.mHttpRequest = null;
    TMLog.i("OpensdkToMsdkManager", "onNetworkFinishedSuccess! authorizedResult.hasAuthoried=" + paramAuthorizedResult.hasAuthoried + "  listenner:" + this.mToMsdkListener + "  authroizedinfo:" + this.mAuthorizedInfo);
    if (paramAuthorizedResult.hasAuthoried == 1)
    {
      this.authorizedState = 2;
      if (paramAuthorizedResult.tipsInfo != null)
      {
        showDialog(paramAuthorizedResult.tipsInfo);
        AppMethodBeat.o(75937);
      }
    }
    while (true)
    {
      return;
      notifyAuthorizedFinished(true, this.mAuthorizedInfo);
      AppMethodBeat.o(75937);
      continue;
      this.authorizedState = 3;
      if (paramAuthorizedResult.tipsInfo != null)
      {
        showDialog(paramAuthorizedResult.tipsInfo);
        AppMethodBeat.o(75937);
      }
      else
      {
        onServerException(paramAuthorizedResult.errorCode);
        TMLog.i("OpensdkToMsdkManager", "not in white list and no tips!");
        AppMethodBeat.o(75937);
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(75935);
    tryToCloseDialog();
    if (this.hasNotify)
      AppMethodBeat.o(75935);
    while (true)
    {
      return;
      if (this.authorizedState == 2)
      {
        AppMethodBeat.o(75935);
      }
      else
      {
        if (((this.authorizedState == 3) || (this.authorizedState == 0)) && (this.mContext != null))
          getUserAuthorizedInfo(this.mAuthorizedInfo, this.mContext);
        AppMethodBeat.o(75935);
      }
    }
  }

  protected void onServerException(int paramInt)
  {
    AppMethodBeat.i(75939);
    if (this.mContext == null)
    {
      AppMethodBeat.o(75939);
      return;
    }
    Object localObject1 = new Res(this.mContext);
    TipsInfo localTipsInfo = new TipsInfo();
    localTipsInfo.title = this.mContext.getString(((Res)localObject1).string("white_list_dlg_title"));
    if ((paramInt == 602) || (paramInt == 601));
    for (localTipsInfo.content = this.mContext.getString(((Res)localObject1).string("white_list_network_error")); ; localTipsInfo.content = this.mContext.getString(((Res)localObject1).string("white_list_server_error")))
    {
      Object localObject2 = new ArrayList();
      ActionButton localActionButton = new ActionButton();
      localActionButton.jumpType = 4;
      Object localObject3 = this.mContext.getString(((Res)localObject1).string("white_list_positive_retry_again"));
      localActionButton.textInstalled = ((String)localObject3);
      localActionButton.textUninstalled = ((String)localObject3);
      localObject3 = new ActionButton();
      ((ActionButton)localObject3).jumpType = 3;
      localObject1 = this.mContext.getString(((Res)localObject1).string("white_list_negtive"));
      ((ActionButton)localObject3).textInstalled = ((String)localObject1);
      ((ActionButton)localObject3).textUninstalled = ((String)localObject1);
      ((ArrayList)localObject2).add(localActionButton);
      ((ArrayList)localObject2).add(localObject3);
      localTipsInfo.actionButton = ((ArrayList)localObject2);
      showDialog(localTipsInfo);
      this.mHttpRequest = null;
      this.mDownloadUrl = "";
      this.authorizedState = 3;
      localObject2 = TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
      ((TipsInfoLog)localObject2).networkErrorTipsCount += 1;
      TipsInfoReportManager.getInstance().addLogData((JceStruct)localObject2);
      AppMethodBeat.o(75939);
      break;
    }
  }

  protected void pauseDownloadTask(String paramString)
  {
    AppMethodBeat.i(75952);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(75952);
    while (true)
    {
      return;
      if (this.mAuthorizedInfo == null)
      {
        AppMethodBeat.o(75952);
      }
      else
      {
        this.mSubMessageHandler.post(new TMOpenSDKToMsdkManager.8(this, paramString));
        AppMethodBeat.o(75952);
      }
    }
  }

  protected void showDialog(TipsInfo paramTipsInfo)
  {
    AppMethodBeat.i(75942);
    if (this.mContext == null)
      AppMethodBeat.o(75942);
    while (true)
    {
      return;
      if ((this.dialog != null) && (this.dialog.isShowing()))
      {
        AppMethodBeat.o(75942);
      }
      else if (((this.mContext instanceof Activity)) && (((Activity)this.mContext).isFinishing()))
      {
        TMLog.i("OpensdkToMsdkManager", "context is finishing!  context" + this.mContext);
        AppMethodBeat.o(75942);
      }
      else
      {
        Res localRes = new Res(this.mContext);
        if (paramTipsInfo != null)
        {
          ArrayList localArrayList = paramTipsInfo.actionButton;
          if ((localArrayList != null) && (localArrayList.size() > 0))
          {
            this.dialog = new PopDialog(this.mContext, localRes.style("while_list_dialog"), localArrayList.size());
            this.dialog.show();
            this.dialog.setTitle(paramTipsInfo.title);
            this.dialog.setContent(paramTipsInfo.content);
            int i = 0;
            if (i < localArrayList.size())
            {
              paramTipsInfo = (ActionButton)localArrayList.get(i);
              if (paramTipsInfo.jumpType == 3)
              {
                this.dialog.setNegativeBtnText(paramTipsInfo.textInstalled);
                this.dialog.setNegativeBtnClickListener(this.negativeBtnListenner);
              }
              while (true)
              {
                i++;
                break;
                if (paramTipsInfo.jumpType == 4)
                {
                  this.dialog.setPositiveBtnText(paramTipsInfo.textUninstalled);
                  this.dialog.setPositiveBtnClickListener(this.retryBtnListener);
                }
                else
                {
                  try
                  {
                    int j = this.mOpenSDK.checkQQDownloaderInstalled(this.mSupportVersionCode);
                    switch (j)
                    {
                    default:
                    case 0:
                      while (true)
                      {
                        this.dialog.setPositiveBtnTag(paramTipsInfo);
                        this.dialog.setPositiveBtnClickListener(this.positiveBtnListener);
                        break;
                        this.dialog.setPositiveBtnText(paramTipsInfo.textInstalled);
                        TipsInfoLog localTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
                        localTipsInfoLog.authorizedTipsCount += 1;
                        TipsInfoReportManager.getInstance().addLogData(localTipsInfoLog);
                      }
                    case 2:
                    case 1:
                    }
                  }
                  catch (Exception localException)
                  {
                    while (true)
                    {
                      ab.printErrStackTrace("OpensdkToMsdkManager", localException, "", new Object[0]);
                      continue;
                      this.dialog.setPositiveBtnText(this.mContext.getString(localRes.string("white_list_positive_update")));
                      continueDownload();
                      continue;
                      this.dialog.setPositiveBtnText(paramTipsInfo.textUninstalled);
                      continueDownload();
                    }
                  }
                }
              }
            }
          }
        }
        AppMethodBeat.o(75942);
      }
    }
  }

  protected void startDownloadTask(String paramString1, String paramString2)
  {
    AppMethodBeat.i(75951);
    if (TextUtils.isEmpty(paramString1))
      AppMethodBeat.o(75951);
    while (true)
    {
      return;
      this.dialog.setPositiveBtnEnable(false);
      this.mSubMessageHandler.post(new TMOpenSDKToMsdkManager.7(this, paramString2, paramString1));
      AppMethodBeat.o(75951);
    }
  }

  protected void startToQQDownloaderAuthorized(String paramString)
  {
    AppMethodBeat.i(75950);
    if (this.dialog.isShowing())
      this.dialog.dismiss();
    this.mHttpRequest = null;
    this.isInstallFinished = false;
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(75950);
    while (true)
    {
      return;
      TipsInfoLog localTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
      localTipsInfoLog.authorizedBtnClickCount += 1;
      TipsInfoReportManager.getInstance().addLogData(localTipsInfoLog);
      if ((this.mContext != null) && (this.mOpenSDK != null))
        this.mOpenSDK.startToAuthorized(this.mContext, paramString);
      AppMethodBeat.o(75950);
    }
  }

  protected void tryToCloseDialog()
  {
    AppMethodBeat.i(75944);
    if (this.mOpenSDK == null)
      AppMethodBeat.o(75944);
    while (true)
    {
      return;
      if (this.mContext == null)
        AppMethodBeat.o(75944);
      else
        try
        {
          int i = this.mOpenSDK.checkQQDownloaderInstalled(this.mSupportVersionCode);
          if ((this.isInstallFinished) && (i == 0))
          {
            this.mHttpRequest = null;
            this.isInstallFinished = false;
            this.mDownloadUrl = null;
            if (this.dialog.isShowing())
              this.dialog.dismiss();
            TMAssistantDownloadSDKManager.closeAllService(this.mContext);
            this.mClient = null;
            if (isExitsAction(this.insertActionId))
              this.mOpenSDK.startQQDownloader(this.mContext);
          }
          AppMethodBeat.o(75944);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("OpensdkToMsdkManager", localException, "", new Object[0]);
          AppMethodBeat.o(75944);
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager
 * JD-Core Version:    0.6.2
 */