package com.tencent.tmassistantsdk.downloadclient;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.tmassistantsdk.util.TMLog;

public abstract class TMAssistantDownloadSDKClientBase
  implements ServiceConnection
{
  public static final String CONNTECTSTATE_CONNECTING = "CONNECTING";
  public static final String CONNTECTSTATE_FINISH = "FINISH";
  public static final String CONNTECTSTATE_INIT = "INIT";
  protected static final String TAG = "TMAssistantDownloadSDKClient";
  protected String connectState = "INIT";
  public String mClientKey;
  protected Context mContext;
  protected String mDwonloadServiceName = null;
  protected IInterface mServiceCallback = null;
  protected IInterface mServiceInterface = null;
  protected final Object mThreadlock = new Object();

  public TMAssistantDownloadSDKClientBase(Context paramContext, String paramString1, String paramString2)
  {
    this.mContext = paramContext;
    this.mClientKey = paramString1;
    this.mDwonloadServiceName = paramString2;
  }

  protected abstract Intent getBindServiceIntent();

  protected IInterface getServiceInterface()
  {
    if ((this.mContext != null) && (this.mContext.getMainLooper().getThread().getId() == Thread.currentThread().getId()))
      throw new Exception("TMAssistantDownloadSDKClient must be called in other Thread(no MainThread)");
    if (this.mServiceInterface == null)
    {
      initTMAssistantDownloadSDK();
      this.connectState = "CONNECTING";
    }
    synchronized (this.mThreadlock)
    {
      this.mThreadlock.wait(10000L);
      if (this.mServiceInterface == null)
        throw new Exception("TMAssistantDownloadSDKClient ServiceInterface is null");
    }
    return this.mServiceInterface;
  }

  // ERROR //
  public boolean initTMAssistantDownloadSDK()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aload_0
    //   5: monitorenter
    //   6: new 95	java/lang/StringBuilder
    //   9: astore_3
    //   10: aload_3
    //   11: ldc 97
    //   13: invokespecial 98	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   16: ldc 19
    //   18: aload_3
    //   19: aload_0
    //   20: getfield 38	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:connectState	Ljava/lang/String;
    //   23: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: invokestatic 112	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: aload_0
    //   33: getfield 38	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:connectState	Ljava/lang/String;
    //   36: astore_3
    //   37: aload_3
    //   38: ldc 16
    //   40: if_acmpeq +11 -> 51
    //   43: iconst_1
    //   44: istore 4
    //   46: aload_0
    //   47: monitorexit
    //   48: iload 4
    //   50: ireturn
    //   51: new 95	java/lang/StringBuilder
    //   54: astore_3
    //   55: aload_3
    //   56: ldc 114
    //   58: invokespecial 98	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   61: ldc 19
    //   63: aload_3
    //   64: aload_0
    //   65: getfield 48	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:mClientKey	Ljava/lang/String;
    //   68: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: ldc 116
    //   73: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_0
    //   77: getfield 40	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:mServiceInterface	Landroid/os/IInterface;
    //   80: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   83: ldc 121
    //   85: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: invokestatic 74	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   91: invokevirtual 71	java/lang/Thread:getId	()J
    //   94: invokevirtual 124	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   97: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: invokestatic 112	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: aload_0
    //   104: ldc 16
    //   106: putfield 38	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:connectState	Ljava/lang/String;
    //   109: aload_0
    //   110: getfield 40	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:mServiceInterface	Landroid/os/IInterface;
    //   113: ifnull +15 -> 128
    //   116: aload_0
    //   117: ldc 13
    //   119: putfield 38	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:connectState	Ljava/lang/String;
    //   122: iconst_1
    //   123: istore 4
    //   125: goto -79 -> 46
    //   128: iload_2
    //   129: istore 4
    //   131: aload_0
    //   132: getfield 46	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:mContext	Landroid/content/Context;
    //   135: ifnull -89 -> 46
    //   138: aload_0
    //   139: getfield 36	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:mDwonloadServiceName	Ljava/lang/String;
    //   142: astore_3
    //   143: iload_2
    //   144: istore 4
    //   146: aload_3
    //   147: ifnull -101 -> 46
    //   150: aload_0
    //   151: invokevirtual 126	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:getBindServiceIntent	()Landroid/content/Intent;
    //   154: astore_3
    //   155: aload_0
    //   156: getfield 46	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClientBase:mContext	Landroid/content/Context;
    //   159: aload_3
    //   160: aload_0
    //   161: iconst_1
    //   162: invokevirtual 130	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   165: istore 4
    //   167: ldc 19
    //   169: ldc 132
    //   171: iload 4
    //   173: invokestatic 138	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   176: invokevirtual 142	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   179: invokestatic 112	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   182: goto -136 -> 46
    //   185: astore_3
    //   186: aload_0
    //   187: monitorexit
    //   188: aload_3
    //   189: athrow
    //   190: astore_3
    //   191: ldc 19
    //   193: aload_3
    //   194: ldc 144
    //   196: iconst_0
    //   197: anewarray 4	java/lang/Object
    //   200: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: iload_1
    //   204: istore 4
    //   206: goto -39 -> 167
    //
    // Exception table:
    //   from	to	target	type
    //   6	37	185	finally
    //   51	122	185	finally
    //   131	143	185	finally
    //   150	167	185	finally
    //   167	182	185	finally
    //   191	203	185	finally
    //   150	167	190	java/lang/Exception
  }

  protected abstract void onDownloadSDKServiceInvalid();

  public void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    stubAsInterface(paramIBinder);
    this.connectState = "FINISH";
    synchronized (this.mThreadlock)
    {
      this.mThreadlock.notifyAll();
      TMLog.i("TMAssistantDownloadSDKClient", "onServiceConnected,clientKey:" + this.mClientKey + ",mServiceInterface:" + this.mServiceInterface + ",IBinder:" + paramIBinder + ",threadId:" + Thread.currentThread().getId());
    }
    try
    {
      if ((this.mServiceInterface != null) && (this.mServiceCallback != null))
        registerServiceCallback();
      return;
      paramIBinder = finally;
      throw paramIBinder;
    }
    catch (RemoteException )
    {
      while (true)
      {
        TMLog.i("TMAssistantDownloadSDKClient", "onServiceConnected, exception : " + ???.getMessage());
        onDownloadSDKServiceInvalid();
      }
    }
  }

  public void onServiceDisconnected(ComponentName arg1)
  {
    TMLog.i("TMAssistantDownloadSDKClient", "onServiceDisconnected,clientKey:" + this.mClientKey);
    try
    {
      this.mServiceInterface = null;
      this.connectState = "INIT";
      synchronized (this.mThreadlock)
      {
        this.mThreadlock.notifyAll();
        onDownloadSDKServiceInvalid();
        return;
      }
    }
    finally
    {
    }
    throw ???;
  }

  protected abstract void registerServiceCallback();

  protected abstract void stubAsInterface(IBinder paramIBinder);

  public void unInitTMAssistantDownloadSDK()
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("unInitTMAssistantDownloadSDK,clientKey:");
      TMLog.i("TMAssistantDownloadSDKClient", this.mClientKey + ",mServiceInterface:" + this.mServiceInterface + ",threadId:" + Thread.currentThread().getId());
      if (this.mServiceInterface != null)
      {
        localObject1 = this.mServiceCallback;
        if (localObject1 == null);
      }
      try
      {
        unRegisterServiceCallback();
        label74: if ((this.mContext != null) && (this.mServiceInterface != null))
          this.mContext.unbindService(this);
        this.mServiceInterface = null;
        this.mServiceCallback = null;
        this.connectState = "INIT";
        return;
      }
      catch (RemoteException localRemoteException)
      {
        break label74;
      }
    }
    finally
    {
    }
  }

  protected abstract void unRegisterServiceCallback();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
 * JD-Core Version:    0.6.2
 */