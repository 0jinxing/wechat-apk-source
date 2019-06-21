package com.tencent.tmassistantsdk.downloadclient;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.text.TextUtils;
import com.tencent.b.a.a.a;
import com.tencent.b.a.a.a.a;
import com.tencent.b.a.a.b;
import com.tencent.b.a.a.b.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.util.Base64;
import com.tencent.tmassistantsdk.util.Cryptor;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class TMAssistantDownloadOpenSDKClient extends TMAssistantDownloadSDKClientBase
{
  protected static final String TAG = "TMAssistantDownloadOpenSDKClient";
  ArrayList<IAssistantOnActionListener> mListeners;
  protected boolean retryBindResult;
  protected int retryCount;

  public TMAssistantDownloadOpenSDKClient(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1, paramString2);
    AppMethodBeat.i(75623);
    this.retryBindResult = false;
    this.retryCount = 0;
    this.mListeners = new ArrayList();
    this.mServiceCallback = new b.a()
    {
      public void onActionResult(byte[] paramAnonymousArrayOfByte)
      {
        AppMethodBeat.i(75621);
        TMLog.i("TMAssistantDownloadOpenSDKClient", "onActionResult  callBack data:" + paramAnonymousArrayOfByte + "  mListeners.size:" + TMAssistantDownloadOpenSDKClient.this.mListeners.size());
        TMAssistantDownloadSDKMessageThread.getInstance().postActionResult(paramAnonymousArrayOfByte, TMAssistantDownloadOpenSDKClient.this.mListeners);
        AppMethodBeat.o(75621);
      }
    };
    AppMethodBeat.o(75623);
  }

  public static String about()
  {
    return "TMAssistantDownloadOpenSDKClient_2014_03_06_11_20_release_25634";
  }

  public void addAssistantOnActionListener(IAssistantOnActionListener paramIAssistantOnActionListener)
  {
    AppMethodBeat.i(75626);
    TMLog.i("TMAssistantDownloadOpenSDKClient", "addAssistantOnActionListener");
    if ((paramIAssistantOnActionListener != null) && (!this.mListeners.contains(paramIAssistantOnActionListener)))
      this.mListeners.add(paramIAssistantOnActionListener);
    AppMethodBeat.o(75626);
  }

  protected Intent getBindServiceIntent()
  {
    AppMethodBeat.i(75630);
    Intent localIntent = new Intent(this.mDwonloadServiceName);
    localIntent.setPackage("com.tencent.android.qqdownloader");
    AppMethodBeat.o(75630);
    return localIntent;
  }

  public boolean initTMAssistantDownloadSDK()
  {
    try
    {
      AppMethodBeat.i(75632);
      boolean bool = super.initTMAssistantDownloadSDK();
      TMLog.i("TMAssistantDownloadOpenSDKClient", "initTMAssistantDownloadSDK bindResult:".concat(String.valueOf(bool)));
      if (!bool);
      try
      {
        Object localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>();
        ((Intent)localObject1).setClassName("com.tencent.android.qqdownloader", "com.tencent.pangu.link.LinkProxyActivity");
        ((Intent)localObject1).addFlags(268435456);
        this.mContext.startActivity((Intent)localObject1);
        localObject3 = new android/os/HandlerThread;
        ((HandlerThread)localObject3).<init>("retry_thread");
        ((HandlerThread)localObject3).start();
        localObject1 = new android/os/Handler;
        ((Handler)localObject1).<init>(((HandlerThread)localObject3).getLooper());
        localObject3 = new com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadOpenSDKClient$2;
        ((2)localObject3).<init>(this, (Handler)localObject1);
        ((Handler)localObject1).postDelayed((Runnable)localObject3, 1000L);
        AppMethodBeat.o(75632);
        return bool;
      }
      catch (Exception localException)
      {
        while (true)
        {
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("retry bind service startActivity Exception:");
          TMLog.w("TMAssistantDownloadOpenSDKClient", localException.toString());
        }
      }
    }
    finally
    {
    }
  }

  protected void onDownloadSDKServiceInvalid()
  {
    AppMethodBeat.i(75627);
    if ((this.mListeners != null) && (this.mListeners.size() > 0))
    {
      Iterator localIterator = this.mListeners.iterator();
      while (localIterator.hasNext())
      {
        IAssistantOnActionListener localIAssistantOnActionListener = (IAssistantOnActionListener)localIterator.next();
        if (localIAssistantOnActionListener != null)
          localIAssistantOnActionListener.onDownloadSDKServiceInvalid();
      }
    }
    AppMethodBeat.o(75627);
  }

  protected void registerServiceCallback()
  {
    AppMethodBeat.i(75629);
    Object localObject = String.valueOf(System.currentTimeMillis()).getBytes();
    localObject = Base64.encodeToString(new Cryptor().encrypt((byte[])localObject, this.mClientKey.getBytes()), 0);
    int i = ((a)this.mServiceInterface).a(this.mClientKey, (String)localObject, (b)this.mServiceCallback);
    TMLog.i("TMAssistantDownloadOpenSDKClient", "onServiceConnected,registerActionCallback:" + this.mClientKey + ",tokenString:" + (String)localObject + ",threadId:" + Thread.currentThread().getId() + ",mServiceCallback:" + this.mServiceCallback + ",registed result:" + i);
    if (i == 2)
      onDownloadSDKServiceInvalid();
    AppMethodBeat.o(75629);
  }

  public void sendAsyncData(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(75625);
    if (!TextUtils.isEmpty(this.mClientKey))
    {
      a locala = (a)super.getServiceInterface();
      if (locala != null)
        locala.d(this.mClientKey, paramArrayOfByte);
    }
    AppMethodBeat.o(75625);
  }

  public byte[] sendSyncData(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(75624);
    if (!TextUtils.isEmpty(this.mClientKey))
    {
      a locala = (a)super.getServiceInterface();
      if (locala != null)
      {
        paramArrayOfByte = locala.c(this.mClientKey, paramArrayOfByte);
        AppMethodBeat.o(75624);
      }
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = null;
      AppMethodBeat.o(75624);
    }
  }

  protected void stubAsInterface(IBinder paramIBinder)
  {
    AppMethodBeat.i(75628);
    this.mServiceInterface = a.a.j(paramIBinder);
    AppMethodBeat.o(75628);
  }

  protected void unRegisterServiceCallback()
  {
    AppMethodBeat.i(75631);
    if (((a)this.mServiceInterface).a((b)this.mServiceCallback) == 2)
      onDownloadSDKServiceInvalid();
    AppMethodBeat.o(75631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient
 * JD-Core Version:    0.6.2
 */